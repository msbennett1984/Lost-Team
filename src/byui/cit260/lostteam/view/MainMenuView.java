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
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
      
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(LostTeam.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("\n*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpmenu = new HelpMenuView();
        helpmenu.display();
    }

    private void saveGame() {
        System.out.println("\n*** saveGame function called ***");
    }
    
    
    /*
    private final HelpMenuView helpMenuView;
    
    public MainMenuView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Main Menu                             |"
            + "\n-----------------------------------------"
            + "\nN - Start New Game"
            + "\nO - Load Game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save Game"
            + "\nQ - Quit Game"
            + "\n----------------------------------------",
        "Q");
        this.helpMenuView = new HelpMenuView();
    }
    
    protected ReturnValue doAction(String choice) {
        ReturnValue value = ReturnValue.CONTINUE;
        
        switch (choice) {
            case "N":
                value = this.startNewGame();
                break;
            case "O":
                value = this.startExistingGame();
                break;
            case "H":
                value = this.helpMenuView.displayMenu();
                break;
            case "S":
                value = this.saveGame();
                break;
            case "E":
                value = ReturnValue.EXIT; // exit the game
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        // sub-menu returned "BREAK", but we're the main menu,
        // so continue the main loop
        if (value == ReturnValue.BREAK) {
            value = ReturnValue.CONTINUE;
        }
        
        return value;
    }

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
}
    */
}
