/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.view.MenuView.ReturnValue;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class HelpMenuView extends MenuView {
    
    public HelpMenuView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Help Menu                             |"
            + "\n-----------------------------------------"
            + "\nG - Goal of Game"
            + "\nH - How to Move"
            + "\nF - Finding Clues"
            + "\nB - Back to Main Menu"
            + "\nQ - Quit Game"
            + "\n----------------------------------------",
        "Q");
    }
    
    protected ReturnValue doAction(String choice) {
        ReturnValue value = ReturnValue.CONTINUE;
        
        switch (choice) {
            case "G":
                value = this.displayGoalOfGame();
                break;
            case "H":
                value = this.displayHowToMove();
                break;
            case "F":
                value = this.displayFindingClues();
                break;
            case "B":
                value = ReturnValue.BREAK;
                break;
            case "E":
                value = ReturnValue.EXIT;
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return value;
    }

    private ReturnValue displayGoalOfGame() {
        System.out.println("\n*** displayGoalOfGame stub function called ***");
        return ReturnValue.CONTINUE;
    }

    private ReturnValue displayHowToMove() {
        System.out.println("\n*** displayHowToMove stub function called ***");
        return ReturnValue.CONTINUE;
    }

    private ReturnValue displayFindingClues() {
        System.out.println("\n*** displayFindingClues stub function called ***");
        return ReturnValue.CONTINUE;
    }
}
