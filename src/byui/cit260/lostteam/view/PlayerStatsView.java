/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import java.util.Scanner;

/**
 *
 * @author Dallin Barlow
 */
public class PlayerStatsView {
    
    
    // creates a string variable to store info in
    private String menu;
    
    // string variable given a value: Player Stat Menu
    public void displayPlayerStats(){
        this.menu = "\n                                   " +
                "\n---------------------------------------" +
                "\n            | Player Stats |           " +
                "\n---------------------------------------" +
                "\n P - People Spoken To (Clues Given)    " +
                "\n I - Item Inventory                    " +
                "\n L - Locations Visited                 " +
                "\n T - Time Remaining                    " +
                "\n B - Back to Location Menu             " +
                "\n                                       " ;
    }
    
    // gets the imput from the player
    public String getInput(){
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        // while a valid name has not been retrieved
        while(!valid){
            
            // gets the value entered by the user
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            // if the selection is less than one character
            if (selection.length() < 1){
                System.out.println("\n******* Invalid selection ** Try Again *******");
                continue;
            }
            break;  
        }
        
        // returns the name
        return selection;
    }
    
    // switch statement function to know where to go based on user's input
    public void doAction(char choice){
        
        switch (choice) {
            case 'P':
                this.peopleSpokenTo();
                break;   
            case 'I':
                this.itemInventory();
                break;
            case 'L':
                this.locationsVisited();
                break;
            case 'T':
                this.timeRemaining();
                break;
            case 'B':
                this.backToSceneMenu();
                break;
            default:
                System.out.println("\n******* Invalid selection - Try Again *******");
        }
    }

    private void peopleSpokenTo() {
        System.out.println("\n*** People Spoken To stub function called ***");
    }

    private void itemInventory() {
        System.out.println("\n*** Item Inventory stub function called ***");
    }

    private void locationsVisited() {
        System.out.println("\n*** Locations Visited stub function called ***"); 
    }

    private void timeRemaining() {
        System.out.println("\n*** Time Remaining stub function called ***"); //To change body of generated methods, choose Tools | Templates.
    }

    private void backToSceneMenu() {
        SceneMenuView back = new SceneMenuView();
        back.displayMenu();
    }
}
