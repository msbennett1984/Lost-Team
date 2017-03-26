/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.control.GameControl;
import byui.cit260.lostteam.model.Actor;
import byui.cit260.lostteam.model.Game;
import byui.cit260.lostteam.model.Navigation;
import byui.cit260.lostteam.model.Scene;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lostteam.LostTeam;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class SceneMenuView extends MenuView {
    
    public SceneMenuView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Scene Menu                            |"
            + "\n-----------------------------------------"
            + "\nM - Move: change Location"
            + "\nC - Create Antidote"
            + "\nS - Search Location"
            + "\nT - Talk to Person"
            + "\nP - Player Stats"
            + "\nB - Back to Game Menu"
            + "\n----------------------------------------");
    }
    
    @Override
    public Navigation doAction(String choice) {
        Navigation nav = Navigation.Continue;
        
        switch (choice) {
            case "M":
                nav = this.moveMenu();
                break;
            case "C":
                nav = this.createAntidote();
                break;
            case "S":
                nav = this.searchLocation();
                break;
            case "T":
                nav = this.talkToPerson();
                break;
            case "P":
                nav = this.playerStats();
                break;
            case "B":
                // Back to Game Menu (immediately)
                return Navigation.ExitView;
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
    
    private Navigation moveMenu() {
        MoveView moveMenu = new MoveView("Scene Menu");
        return moveMenu.display();
    }

    private Navigation createAntidote() {
        AntidoteMenuView antidoteView = new AntidoteMenuView();
        return antidoteView.display();
    }

    private Navigation searchLocation() {
        SearchLocationView searchLocationView = new SearchLocationView();
        return searchLocationView.display();
    }

    private Navigation talkToPerson() {
        Scene scene = GameControl.getCurrentScene();
        return scene.displayClueView();
    }

    private Navigation playerStats() {
        PlayerStatsView playerStats = new PlayerStatsView();
        return playerStats.display();
    }
}
