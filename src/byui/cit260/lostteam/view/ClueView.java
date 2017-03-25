/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.control.GameControl;
import byui.cit260.lostteam.exception.LoseGameException;
import byui.cit260.lostteam.model.Actor;
import byui.cit260.lostteam.model.Navigation;

/**
 *
 * @author Dallin Barlow
 */
public abstract class ClueView extends MenuView implements ClueViewInterface {

    private final Actor actor;
    private final long wrongAnswerTimeDeduction;
    
    public ClueView(String message, Actor actor, long wrongAnswerTimeDeduction) {
        super(message);
        this.actor = actor;
        this.wrongAnswerTimeDeduction = wrongAnswerTimeDeduction;
    }
    
    @Override
    public Navigation doAction(String choice) {
        Navigation nav = Navigation.Continue;
        
        switch (choice) {
            case "Y":
                nav = this.answerQuestion();
                break;
            case "N":
                // Back to Scene Menu (immediately)
                return Navigation.ExitView;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        if (nav == Navigation.WrongAnswer) {
            nav = Navigation.Continue;
            try {
                GameControl.decrementRemainingTime(wrongAnswerTimeDeduction);
            } catch (LoseGameException e) {
                nav = Navigation.LostGame;
            }
        }
        
        if (nav == Navigation.ExitView) {
            System.out.println("\nMy clue is:\n\n" + actor.getClueGiven());
            GameControl.addInteraction(actor);
        }

        return nav;
    }

}
