/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import lostteam.LostTeam;
import byui.cit260.lostteam.control.GameControl;

/**
 *
 * @author Dallin Barlow
 */
public class MainMenuView extends MenuView  {

    
    public MainMenuView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Main Menu                             |"
            + "\n-----------------------------------------"
            + "\nN - Start New Game"
            + "\nO - Load Game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save Game"
            + "\nE - Exit Game"
            + "\n----------------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        // changes all values to uppercase
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N":
                this.startNewGame();
                break;
            case "O":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            case "E":
                this.EXIT; // exit the game
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
      
        return false;
    }

    
    /*
    private ReturnValue startNewGame() {
        GameControl.createNewGame(LostTeam.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        return gameMenu.displayMenu();
    }

    private ReturnValue startExistingGame() {
        System.out.println("\n*** startExistingGame stub function called ***");
        return ReturnValue.CONTINUE;
    }

    private ReturnValue saveGame() {
        System.out.println("\n*** saveGame stub function called ***");
        return ReturnValue.CONTINUE;
    }
    */

    private void startNewGame() {
        Gamecontrol.createNewGame();
    }

    private void startExistingGame() {
        System.out.println("\n*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("\n*** displayHelpMenu function called ***");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame function called ***");
    }
}
