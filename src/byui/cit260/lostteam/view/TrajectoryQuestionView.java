/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.model.Navigation;

/**
 *
 * @author Dallin Barlow
 */
public class TrajectoryQuestionView extends MenuView {
    
    public TrajectoryQuestionView(){    
        super ( "\n                                                 "
        + "\n-------------------------------------------------------"
        + "\nA police officer is investigating the scene of a crime "
        + "\nthat was committed. 'It was a murder,' he tells you.   "
        + "\nThe victim was shot with a 9 mm, we have a rough idea  "
        + "\nof the distance, but we need to find the TRAJECTORY of "
        + "\nthe bullet. Help us out and I will tell you something  "
        + "\nuseful. Will you help?                                 "
        + "\nY - Yes I will help                                    "
        + "\nN - No I will not help (back to Scene Menu)            ");
    }
    
    @Override
    public Navigation doAction(String choice) {
        Navigation nav = Navigation.Continue;
        
        switch (choice) {
            case "Y":
                this.answerQuestion();
                break;
            case "N":
                // Back to Scene Menu (immediately)
                return Navigation.ExitView;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return nav;
    }
 
    private void answerQuestion() {
        System.out.println("\n*** AnswerQuestion Function called ***");
    }
}

