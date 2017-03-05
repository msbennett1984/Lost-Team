/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.model.GameInstance;
import byui.cit260.lostteam.model.Inventory;
import byui.cit260.lostteam.model.InventoryItem;
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
    
    protected void beforeGetInput() {
        GameInstance game = LostTeam.getCurrentGame();
        ArrayList<InventoryItem> items = game.getInventory().getItems();
        int size = items.size();
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
            for (int i = 0; i < size; i++) {
                System.out.println("  " + items.get(i).getQuantity() + " - " + items.get(i).getItem().getName());
            }
        }
        return;
    }
    
    
    @Override
    public boolean doAction(String choice) {
        // changes all values to uppercase
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "C":
                this.createAntidote();
                break;
            case "B":
                this.sceneMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    
    private void createAntidote() {
        System.out.println("Attempting to create antidote...");
        System.out.println("FAILED");
        GameInstance game = LostTeam.getCurrentGame();
        game.setRemainingTime(game.getRemainingTime() - 15);
        return;
    }

    private void sceneMenu() {
        SceneMenuView sceneMenu = new SceneMenuView();
        sceneMenu.display();
    }
    
    /*
    public AntidoteMenuView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Antidote Menu                         |"
            + "\n-----------------------------------------"
            + "\nC - Create Antidote"
            + "\nB - Back to Scene Menu"
            + "\n----------------------------------------",
        null);
    }
    
    protected void beforeGetInput() {
        GameInstance game = LostTeam.getCurrentGame();
        ArrayList<InventoryItem> items = game.getInventory().getItems();
        int size = items.size();
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
            for (int i = 0; i < size; i++) {
                System.out.println("  " + items.get(i).getQuantity() + " - " + items.get(i).getItem().getName());
            }
        }
        return;
    }
    
    protected ReturnValue doAction(String choice) {
        ReturnValue value = ReturnValue.CONTINUE;
        boolean ignoreBreak = true;

        switch (choice) {
            case "C":
                value = this.createAntidote();
                break;
            case "B":
                value = ReturnValue.BREAK;
                ignoreBreak = false;
                break;
            case "Q":
                value = ReturnValue.EXIT;
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        // for certain sub-menus (like SceneMenuView), we don't want to
        // return to the main menu, but to stop here
        if (ignoreBreak == true && value == ReturnValue.BREAK) {
            value = ReturnValue.CONTINUE;
        }

        return value;
    }

    private ReturnValue createAntidote() {
        System.out.println("Attempting to create antidote...");
        System.out.println("FAILED");
        GameInstance game = LostTeam.getCurrentGame();
        game.setRemainingTime(game.getRemainingTime() - 15);
        return ReturnValue.CONTINUE;
    }
    */

}
