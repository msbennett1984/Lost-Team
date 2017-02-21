/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import java.util.Scanner;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class HelpMenuView {
   
    private String menu;
    
    public HelpMenuView() {
        this.menu = "\n"
                  + "\n-----------------------------------------"
                  + "\n| Help Menu                             |"
                  + "\n-----------------------------------------"
                  + "\nG - Goal of Game"
                  + "\nH - How to Move"
                  + "\nF - Finding Clues"
                  + "\nB - Back to Main Menu"
                  + "\nE - Exit Game"
                  + "\n----------------------------------------";
    }
    
    /**
     * displays the help program view
     */
    public int displayHelpMenuView() {
        int returnValue = 0; // loop while 0
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("E")) // user wants to quit
                return -1; // exit the game
            // do the requested action and display the next view
            returnValue = this.doAction(menuOption);
        } while (returnValue == 0);
        return returnValue;
    }
    
    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }
    
    private int doAction(String choice) {
        int returnValue = 0; // return to main menu or game if non-zero
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "G":
                this.displayGoalOfGame();
                break;
            case "H":
                this.displayHowToMove();
                break;
            case "F":
                this.displayFindingClues();
                break;
            case "B":
                returnValue = 1;
                break;
            case "E":
                returnValue = -1;
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return returnValue;
    }

    private void displayGoalOfGame() {
        System.out.println("\n*** displayGoalOfGame stub function called ***");
    }

    private void displayHowToMove() {
        System.out.println("\n*** displayHowToMove stub function called ***");
    }

    private void displayFindingClues() {
        System.out.println("\n*** displayFindingClues stub function called ***");
    }
}
