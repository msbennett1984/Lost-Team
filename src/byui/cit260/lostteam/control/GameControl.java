/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.control;

import byui.cit260.lostteam.exception.GameControlException;
import byui.cit260.lostteam.exception.LoseGameException;
import byui.cit260.lostteam.exception.WinGameException;
import byui.cit260.lostteam.model.Actor;
import byui.cit260.lostteam.model.Game;
import byui.cit260.lostteam.model.InventoryItem;
import byui.cit260.lostteam.model.Item;
import byui.cit260.lostteam.model.Location;
import byui.cit260.lostteam.model.Map;
import byui.cit260.lostteam.model.Player;
import byui.cit260.lostteam.model.Scene;
import byui.cit260.lostteam.model.SceneType;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Exception;
import java.util.LinkedHashSet;
import java.util.Set;
import lostteam.LostTeam;

/**
 *
 * @author Dallin Barlow
 */
public class GameControl {

    public static void createNewGame(Player player) {
        Game game = new Game(); // create new game
        LostTeam.setCurrentGame(game); // save in LostTeam
        
        game.setPlayer(player); // save player in game
        
        // create the inventory and save in the game
        InventoryItem[] inventory = GameControl.createInventory();
        game.setInventory(inventory);
        
        // create the interactions set and save in the game
        Set<Actor> interactions = GameControl.createInteractions();
        game.setInteractions(interactions);
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // save map in game
        MapControl.movePlayerToStartingLocation(map);
        
        // set remaining time to 120 minutes
        game.setRemainingTime(120);
    }
    
    
    public static InventoryItem[] createInventory() {
        InventoryItem[] inventory = new InventoryItem[8];
        
        inventory[Item.Aspirin.ordinal()] = new InventoryItem(Item.Aspirin);
        inventory[Item.BottledWater.ordinal()] = new InventoryItem(Item.BottledWater);
        inventory[Item.Coconut.ordinal()] = new InventoryItem(Item.Coconut);
        inventory[Item.DeliMeat.ordinal()] = new InventoryItem(Item.DeliMeat);
        inventory[Item.HotDog.ordinal()] = new InventoryItem(Item.HotDog);
        inventory[Item.Mushroom.ordinal()] = new InventoryItem(Item.Mushroom);
        inventory[Item.Nutmilk.ordinal()] = new InventoryItem(Item.Nutmilk);
        inventory[Item.TicTac.ordinal()] = new InventoryItem(Item.TicTac);
        
        // used for testing inventory
//        inventory[Item.Mushroom.ordinal()].setQuantity(1);
//        inventory[Item.TicTac.ordinal()].setQuantity(10);
        
        return inventory;
    }
    
    public static Set<Actor> createInteractions() {
        LinkedHashSet<Actor> interactions = new LinkedHashSet<>();        
        return interactions;
    }
    
    public static void decrementRemainingTime(long amount) throws LoseGameException {
        Game game = LostTeam.getCurrentGame();
        long remainingTime = game.getRemainingTime();
        remainingTime = remainingTime - amount;
        if (remainingTime <= 0) {
            throw new LoseGameException();
        }
        game.setRemainingTime(remainingTime);
    }
    
    public static void incrementRemainingTime(long amount) throws LoseGameException {
        Game game = LostTeam.getCurrentGame();
        long remainingTime = game.getRemainingTime();
        remainingTime = remainingTime + amount;
        if (remainingTime <= 0) {
            throw new LoseGameException();
        }
        game.setRemainingTime(remainingTime);
    }
    
    public static void addInteraction(Actor actor) {
        Game game = LostTeam.getCurrentGame();
        game.addInteraction(actor);
    }
    
    public static Scene getCurrentScene() {
        Game game = LostTeam.getCurrentGame();
        Map map = game.getMap();
        Location location = map.getCurrentLocation();
        return location.getScene();
    }

    public static void saveGame(Game game, String filePath) throws GameControlException {
        try(FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(game); // write the game object out to file
        } catch (Exception ex) {
            throw new GameControlException(ex.getMessage());
        }
    }

    public static void getSavedGame(String filePath) throws GameControlException {
        Game game = null;
        
        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); // read the game object from file
        } catch (Exception ex) {
            throw new GameControlException(ex.getMessage());
        }
        
        // close the output file
        LostTeam.setCurrentGame(game); // save in LostTeam
    }

    public static void createAntidote() throws LoseGameException, WinGameException {
        Game game = LostTeam.getCurrentGame();
        InventoryItem[] inventory = game.getInventory();
        boolean createdAntidote = true;
        for (InventoryItem i : inventory) {
            if (i.getQuantity() >= i.getItem().getRequiredAmount()) {
                continue;
            }
            createdAntidote = false;
            break;
        }
        if (createdAntidote) {
            throw new WinGameException();
        } else {
            decrementRemainingTime(15);
        }
    }
}
