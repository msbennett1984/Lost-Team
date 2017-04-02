/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.control.MapControl;
import byui.cit260.lostteam.model.Game;
import byui.cit260.lostteam.model.Location;
import byui.cit260.lostteam.model.Map;
import byui.cit260.lostteam.model.Navigation;
import lostteam.LostTeam;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class GameMenuView extends MenuView {

    public GameMenuView(){
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Game Menu                             |"
            + "\n-----------------------------------------"
            + "\nD - Display Map                          "
            + "\nP - Player Stats"
            + "\nS - Scene menu"
            + "\nB - Back to Main Menu"
            + "\nE - Exit Game"
            + "\n----------------------------------------");
    }
    
    @Override
    public Navigation doAction(String choice) {
        Navigation nav = Navigation.Continue;
        
        switch (choice) {
            case "D":
                this.displayMap();
                break;
            case "P":
                nav = this.playerStats();
                break;
            case "M":
                nav = this.moveMenu();
                break;
            case "S":
                nav = this.sceneMenu();
                break;
            case "B":
                // Back to Main Menu (immediately)
                return Navigation.ExitView;
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
    
    private Navigation playerStats() {
        PlayerStatsView playerStats = new PlayerStatsView();
        return playerStats.display();
    }
    
    private Navigation sceneMenu() {
        SceneMenuView sceneMenu = new SceneMenuView();
        return sceneMenu.display();
    }
    
    private Navigation moveMenu() {
        MoveView moveMenu = new MoveView("Game Menu");
        Navigation nav = moveMenu.display();
        if (nav == Navigation.ExitView) {
            displayMap();
        }
        return nav;
    }
    
    private void displayMap() {
        Game game = LostTeam.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        MapControl.displayMap(map, console);
        
    }
}
