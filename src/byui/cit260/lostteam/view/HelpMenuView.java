/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

// import byui.cit260.lostteam.view.MenuView.ReturnValue;

import byui.cit260.lostteam.model.Navigation;


/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class HelpMenuView extends MenuView {
    
    public HelpMenuView(){
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Help Menu                             |"
            + "\n-----------------------------------------"
            + "\nG - Goal of Game"
            + "\nH - How to Move"
            + "\nF - Finding Clues"
            + "\nB - Back to Main Menu"
            + "\nE - Exit Game"
            + "\n----------------------------------------");
    }
    
    @Override
    public Navigation doAction(String choice) {
        Navigation nav = Navigation.Continue;
        
        switch (choice) {
            case "G":
                nav = this.goalOfGame();
                break;
            case "H":
                nav = this.howToMove();
                break;
            case "F":
                nav = this.findingClues();
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
    
    private Navigation goalOfGame() {
        System.out.println("\n*** goalOfGame function called ***");
        return Navigation.Continue;
    }

    private Navigation howToMove() {
        System.out.println("\n*** howToMove function called ***");
        return Navigation.Continue;
    }

    private Navigation findingClues() {
        System.out.println("\n*** findingClues function called ***");
        return Navigation.Continue;
    }
}
