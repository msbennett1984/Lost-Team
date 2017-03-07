/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.control;

import byui.cit260.lostteam.model.Actor;
import byui.cit260.lostteam.model.Game;
import byui.cit260.lostteam.model.InventoryItem;
import byui.cit260.lostteam.model.Item;
import byui.cit260.lostteam.model.Map;
import byui.cit260.lostteam.model.Player;
import byui.cit260.lostteam.model.Scene;
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

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
