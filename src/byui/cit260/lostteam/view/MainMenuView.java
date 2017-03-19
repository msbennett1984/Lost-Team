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
            + "\nN - Start New Game"
            + "\nO - Load Game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save Game"
            + "\nE - Exit Game"
            + "\n----------------------------------------");
    }
    
    @Override
    public Navigation doAction(String choice) {
        Navigation nav = Navigation.Continue;
        
        switch (choice) {
            case "N":
                nav = this.startNewGame();
                break;
            case "O":
                nav = this.startExistingGame();
                break;
            case "H":
                nav = this.displayHelpMenu();
                break;
            case "S":
                nav = this.saveGame();
                break;
            case "E":
                // Exit Game (immediately)
                return Navigation.ExitGame;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        // Stop exiting view and continue with this view
        if (nav == Navigation.ExitView) {
            nav = Navigation.Continue;
        }
      
        return nav;
    }

    private Navigation startNewGame() {
        GameControl.createNewGame(LostTeam.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        return gameMenu.display();
    }

    private Navigation startExistingGame() {
        System.out.println("\n*** startExistingGame function called ***");
        return Navigation.Continue;
    }

    private Navigation displayHelpMenu() {
        HelpMenuView helpmenu = new HelpMenuView();
        return helpmenu.display();
    }

    private Navigation saveGame() {
        System.out.println("\n*** saveGame function called ***");
        return Navigation.Continue;
    }
}
