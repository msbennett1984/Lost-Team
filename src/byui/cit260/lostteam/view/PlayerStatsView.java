/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.model.Actor;
import byui.cit260.lostteam.model.ActorType;
import byui.cit260.lostteam.model.Game;
import byui.cit260.lostteam.model.InventoryItem;
import byui.cit260.lostteam.model.Navigation;
import java.util.Scanner;
import lostteam.LostTeam;

/**
 *
 * @author Dallin Barlow
 */
public class PlayerStatsView extends MenuView {

   public PlayerStatsView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n|             Player Stats              |"
            + "\n-----------------------------------------"
            + "\nP - People Spoken To (Clues)             "
            + "\nI - Item Inventory                       "
            + "\nL - Locations Visited                    "
            + "\nT - Time Remaining                       "
            + "\nB - Back to Scene Menu                   "
            + "\n-----------------------------------------");
   }
   
    @Override
    public Navigation doAction(String choice) {
        Navigation nav = Navigation.Continue;
        
        switch (choice) {
            case "P":
                this.peopleSpokenTo();
                break;
            case "I":
                this.itemInventory();
                break;
            case "L":
                this.locationsVisited();
                break;
            case "T":
                this.timeRemaining();
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
    
    private void peopleSpokenTo() {
        //declare the variable for StringBuilder type
        StringBuilder sentence;
        
        // variable game is assigned the value of getting the current game
        Game game = LostTeam.getCurrentGame();
        ActorType[] type = game.getType();
        
        System.out.println          ("\n          Actors           ");
        //45 spots
        sentence = new StringBuilder("                                       ");
        sentence.insert(0, "Person");
        sentence.insert(20, "Clue Given");
        
        //For each loop Actor
        for (Actor actor : Actor.values()){
            
            sentence = new StringBuilder("                                       ");
            sentence.insert(0, actor.getDescription());
            sentence.insert(20, actor.getClueGiven());
            
            System.out.println(sentence.toString());
            
        }
        System.out.println("Total number of actors is " + Actor.values().length);
    }

    private void itemInventory() {
        StringBuilder line;
        
        Game game = LostTeam.getCurrentGame();
        InventoryItem[] inventory = game.getInventory();
        
        System.out.println("\n                  Item Inventory   ");
        line = new StringBuilder("                                       ");
        line.insert(0, "Description");
        line.insert(20, "In Stock");
        System.out.println(line.toString());
        
        // for each inventory item
        for (InventoryItem item : inventory){
            
            line = new StringBuilder("                                    ");
            line.insert(0, item.getItemName());
            line.insert(20, item.getQuantity());
            
            //displays it to the line
            System.out.println(line.toString());
        }
        
    }

    private void locationsVisited() {
        System.out.println("*** LocationsVisited function called ***");
    }

    private void timeRemaining() {
        System.out.println("*** TimeRemaining function called ***");
    }
}
