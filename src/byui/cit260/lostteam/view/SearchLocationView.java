/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.control.GameControl;
import byui.cit260.lostteam.exception.LoseGameException;
import byui.cit260.lostteam.model.Game;
import byui.cit260.lostteam.model.InventoryItem;
import byui.cit260.lostteam.model.Item;
import byui.cit260.lostteam.model.Navigation;
import byui.cit260.lostteam.model.Scene;
import lostteam.LostTeam;

/**
 *
 * @author Dallin Barlow
 */
public class SearchLocationView extends MenuView {
    
    SearchLocationView(){
        super("\n"
            + "\n----------------------------------------------"
            + "\nWould you like to search your current location"
            + "\n                 for Items?"
            + "\nY - Yes (search for Items)"
            + "\nN - No (No return to Scene Menu)"
            + "\n");
    }
    
    @Override
    public Navigation doAction(String choice) {
        Navigation nav = Navigation.Continue;
        
        switch (choice) {
            case "Y":
                nav = this.searchLocation();
                break;
            case "N":
                // Back to Scene Menu (immediately)
                return Navigation.ExitView;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return nav;
    }

    private Navigation searchLocation() {
        Scene scene = GameControl.getCurrentScene();
        Item item = scene.getItem();
        if (item == null || item == Item.Nothing) {
            this.console.println("\n*** No items found *** you wasted 5 minutes of time");
            try {
                GameControl.decrementRemainingTime(5);
            } catch (LoseGameException ex) {
                return Navigation.LostGame;
            }
        } else {
            Game game = LostTeam.getCurrentGame();
            game.addItemToInventory(item, item.getAmountFound());
            InventoryItem inventoryItem = game.getInventoryItem(item);
            this.console.println("\n*** Found " + item.getAmountFound()
                               + " " + item.getName(item.getAmountFound()) + " ***"
                               + "\n*** You now have " + inventoryItem.getQuantity()
                               + " " + item.getName(inventoryItem.getQuantity()) + " ***");
        }
        return Navigation.ExitView;
    }
}
