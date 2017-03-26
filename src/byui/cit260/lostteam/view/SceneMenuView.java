/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.control.GameControl;
import byui.cit260.lostteam.control.MapControl;
import byui.cit260.lostteam.exception.LoseGameException;
import byui.cit260.lostteam.model.Actor;
import byui.cit260.lostteam.model.Clue;
import byui.cit260.lostteam.model.Game;
import byui.cit260.lostteam.model.InventoryItem;
import byui.cit260.lostteam.model.Location;
import byui.cit260.lostteam.model.Map;
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
            + "\nX - Cheat (fill inventory)"
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
            case "X":
                nav = this.cheat();
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
        Navigation nav = moveMenu.display();
        if (nav == Navigation.ExitView) {
            displayMap();
        }
        return nav;
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
        Game game = LostTeam.getCurrentGame();
        Scene scene = GameControl.getCurrentScene();
        Clue clue = scene.getClue();
        Actor actor = scene.getActor();
        if (clue == Clue.None) {
            if (actor == null) {
                this.console.println("\n*** There is nobody to talk to ***");
            } else {
                this.console.println("\n*** There is a " + actor.getDescription() + ", but they don't want to talk with you ***");
                GameControl.addInteraction(actor);
            }
        } else if (clue == Clue.CalcVolumeOfFlask) {
            ClueView clueView = new CalcVolumeOfFlaskQuestionView(scene.getActor());
            return clueView.display();
        } else if (clue == Clue.CalcCylinderVolume) {
            ClueView clueView = new CalcVolumeOfFlaskQuestionView(scene.getActor());
            return clueView.display();
        } else { // GivenByActor, Wastes5Minutes, Wastes10Minutes, or Gains5Minutes
            this.console.println("\n*** You speak with a " + actor.getDescription() + " ***"
                               + "\n" + actor.getClueGiven());
            GameControl.addInteraction(actor);
            long timeChange = 0;
            if (clue == Clue.Wastes5Minutes) {
                this.console.println("\n*** They waste 5 minutes of your time ***");
                timeChange = -5;
            } else if (clue == Clue.Wastes10Minutes) {
                this.console.println("\n*** They waste 10 minutes of your time ***");
                timeChange = -10;
            } else if (clue == Clue.Gains5Minutes) {
                this.console.println("\n*** You gain 5 minutes of time ***");
                timeChange = 5;
            }
            if (timeChange < 0) {
                try {
                    GameControl.decrementRemainingTime(-1 * timeChange);
                } catch (LoseGameException ex) {
                    return Navigation.LostGame;
                }
            } else if (timeChange > 0) {
                try {
                    GameControl.incrementRemainingTime(timeChange);
                } catch (LoseGameException ex) {
                    return Navigation.LostGame;
                }
            }
        }
        return Navigation.Continue;
    }

    private Navigation playerStats() {
        PlayerStatsView playerStats = new PlayerStatsView();
        return playerStats.display();
    }
    
    private void displayMap() {
        Game game = LostTeam.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        MapControl.displayMap(map, console);
    }
    
    private Navigation cheat() {
        Game game = LostTeam.getCurrentGame();
        InventoryItem[] inventory = game.getInventory();
        for (InventoryItem i : inventory) {
            while (i.getQuantity() < i.getItem().getRequiredAmount()) {
                game.addItemToInventory(i.getItem(), 1);
            }
        }
        for (Actor actor : Actor.values()) {
            GameControl.addInteraction(actor);
        }
        Location[][] locations = game.getMap().getLocations();
        for (int column = 0; column < locations.length; column++) {
            for (int row = 0; row < locations[column].length; row++) {
                locations[column][row].setVisited(true);
            }
        }
        return Navigation.Continue;
    }
}
