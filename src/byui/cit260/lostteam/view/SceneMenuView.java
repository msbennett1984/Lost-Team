/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.model.Navigation;

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
            + "\nU - Test CalcVolumeOfFlaskQuestionView"
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
            case "U":
                nav = this.calcVolumeOfFlaskQuestion();
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
        // SearchLocationView searchLocation = new SearchLocationView();
        // searchLocation
        System.out.println("\n SearchLocation Function called ");
        return Navigation.Continue;
    }

    private Navigation talkToPerson() {
        System.out.println("\n TalktoPerson Function called ");
        return Navigation.Continue;
    }

    private Navigation playerStats() {
        PlayerStatsView playerStats = new PlayerStatsView();
        return playerStats.display();
    }

    private Navigation calcVolumeOfFlaskQuestion() {
        CalcVolumeOfFlaskQuestionView calcVolumeOfFlaskQuestion = new CalcVolumeOfFlaskQuestionView();
        return calcVolumeOfFlaskQuestion.display();
    }
}
