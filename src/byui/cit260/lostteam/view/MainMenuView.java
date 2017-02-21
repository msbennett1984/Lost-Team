/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import java.util.Scanner;
import lostteam.LostTeam;
import byui.cit260.lostteam.control.GameControl;

/**
 *
 * @author Dallin Barlow
 */
public class MainMenuView {

    private String menu;
    
    public MainMenuView() {
        this.menu = "\n"
                  + "\n-----------------------------------------"
                  + "\n| Main Menu                             |"
                  + "\n-----------------------------------------"
                  + "\nN - Start New Game"
                  + "\nO - Load Game"
                  + "\nH - Get help on how to play the game"
                  + "\nS - Save Game"
                  + "\nE - Exit Game"
                  + "\n----------------------------------------";
    }
    
    /**
     * displays the start program view
     */
    public void displayMainMenuView() {
        int returnValue = 0; // loop while non-negative
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("E")) // user wants to quit
                return; // exit the game
            // do the requested action and display the next view
            returnValue = this.doAction(menuOption);
        } while (returnValue >= 0);
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
        int returnValue = 0; // exit if non-zero
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "O":
                this.startExistingGame();
                break;
            case "H":
                returnValue = this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            case "E":
                returnValue = -1; // exit the game
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return returnValue;
    }

    private void startNewGame() {
        GameControl.createNewGame(LostTeam.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView() {};
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("\n*** startExistingGame stub function called ***");
    }

    private int displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        return helpMenu.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("\n*** saveGame stub function called ***");
    }
    
}
