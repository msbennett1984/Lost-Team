/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.model.Game;
import byui.cit260.lostteam.model.InventoryItem;
import byui.cit260.lostteam.model.Navigation;
import java.util.ArrayList;
import lostteam.LostTeam;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class AntidoteMenuView extends MenuView {
    
    public AntidoteMenuView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Antidote Menu                         |"
            + "\n-----------------------------------------"
            + "\nC - Create Antidote"
            + "\nB - Back to Scene Menu"
            + "\n----------------------------------------");
    }
    
    @Override
    protected void beforeGetInput() {
        Game game = LostTeam.getCurrentGame();
        int size = game.getInventorySize();
        String itemsLabel = "items";
        if (size == 1) {
            itemsLabel = "item";
        }
        System.out.println(""
                         + "\n****************************************"
                         + "\n You have " + size + " " + itemsLabel + " in your inventory."
                         + "\n Attempting to create the antidote will"
                         + "\n take 15 minutes (you have " + game.getRemainingTime() + " left)."
                         + "\n*****************************************");
        if (size > 0) {
            System.out.println("\nInventory items:");
            for (InventoryItem i : game.getInventory()) {
                System.out.println("  " + i.getQuantity() + " - " + i.getItemName());
            }
        }
        return;
    }

    @Override
    public Navigation doAction(String choice) {
        Navigation nav = Navigation.Continue;
        
        switch (choice) {
            case "C":
                this.createAntidote();
                break;
            case "B":
                // Back to Scene Menu (immediately)
                return Navigation.ExitView;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return nav;
    }

    private void createAntidote() {
        System.out.println("Attempting to create antidote...");
        System.out.println("FAILED");
        Game game = LostTeam.getCurrentGame();
        game.setRemainingTime(game.getRemainingTime() - 15);
        return;
    }
}
