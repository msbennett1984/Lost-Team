/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.control;

import byui.cit260.lostteam.model.GameInstance;
import byui.cit260.lostteam.model.Inventory;
import byui.cit260.lostteam.model.InventoryItem;
import byui.cit260.lostteam.model.Item;
import byui.cit260.lostteam.model.Player;
import lostteam.LostTeam;

/**
 *
 * @author Dallin Barlow
 */
public class GameControl {

    public static void createNewGame(Player player) {
        GameInstance game = new GameInstance();
        
        Item fakeItemA = new Item();
        fakeItemA.setName("fake item A");
        Item fakeItemB = new Item();
        fakeItemB.setName("fake item B");
        
        InventoryItem fakeInventoryItemA = new InventoryItem(fakeItemA);
        fakeInventoryItemA.setQuantity(5);
        InventoryItem fakeInventoryItemB = new InventoryItem(fakeItemB);
        fakeInventoryItemB.setQuantity(3);
        
        Inventory inventory = new Inventory();
        inventory.addItem(fakeInventoryItemA);
        inventory.addItem(fakeInventoryItemB);
        
        game.setInventory(inventory);
        game.setPlayer(player);
        game.setRemainingTime(120);
        
        LostTeam.setCurrentGame(game);
    }
    
}
