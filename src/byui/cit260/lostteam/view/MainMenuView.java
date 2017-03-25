/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import lostteam.LostTeam;
import byui.cit260.lostteam.control.GameControl;
import byui.cit260.lostteam.model.Navigation;

/**
 *
 * @author Dallin Barlow
 */
public class MainMenuView extends MenuView {

    
    public MainMenuView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Main Menu                             |"
            + "\n-----------------------------------------"
            + "\nN - Start new game"
            + "\nG - Get and start saved game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nQ - Quit"
            + "\n----------------------------------------");
    }
    
    @Override
    public Navigation doAction(String choice) {
        Navigation nav = Navigation.Continue;
        
        switch (choice) {
            case "N":
                nav = this.startNewGame();
                break;
            case "G":
                nav = this.startSavedGame();
                break;
            case "H":
                nav = this.displayHelpMenu();
                break;
            case "S":
                nav = this.saveGame();
                break;
            case "Q":
                // Quit (immediately)
                return Navigation.ExitGame;
            default:
                ErrorView.display("MainMenuView",
                        "*** Invalid selection *** Try again");
                break;
        }
        
        // Stop exiting view and continue with this view
        if (nav == Navigation.ExitView) {
            nav = Navigation.Continue;
        }
        
        if (nav == Navigation.LostGame) {
            System.out.println("\n*** Game Over ***\n");
            nav = Navigation.Continue;
        }
      
        return nav;
    }

    private Navigation startNewGame() {
        GameControl.createNewGame(LostTeam.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        return gameMenu.display();
    }

    private Navigation startSavedGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game"
                           + "is to be saved.");

        String filePath = this.getInput();
        
        try {
            // start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(),
                    ex.getMessage());
        }
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        return gameMenu.display();
    }

    private Navigation displayHelpMenu() {
        HelpMenuView helpmenu = new HelpMenuView();
        return helpmenu.display();
    }

    private Navigation saveGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for the file where the game "
                           + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            // save the game to the specified file
            GameControl.saveGame(LostTeam.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        return Navigation.Continue;
    }
}
