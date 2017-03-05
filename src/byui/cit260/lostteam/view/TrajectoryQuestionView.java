/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

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
        + "\nN - No I will not help (back to Scene Menu             ");
    }
    
   @Override
    public boolean doAction(String choice) {
        // changes all values to uppercase
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "Y":
                this.answerQuestion();
                break;
            case "N":
                this.sceneMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    } 

/*
// two variables the user will input to guess the distance
    private double velocity;
    private double gravity;
    
    public String message1 = 
            "\nThank you. Put in a velocity and gravity to find     " +
            "\nthe trajectory. We don't know the exact distance,    " +
            "\nbut we need know to be between 1 and 300 feet.       " +
            "\n (Distance = Velocity^2 / Gravity)                     " ;
    public String message2 = "\n Please enter in a Velocity: ";
    public String message3 = "\n Please enter in a Gravity:  ";
    
    // the Display the user will see when deciding to answer the question
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
        + "\nN - No I will not help (back to Scene Menu             ",
        null);
    }
    protected ReturnValue doAction(String choice) {
        ReturnValue value = ReturnValue.CONTINUE;
        boolean ignoreBreak = true;
 
        switch (choice) {
            case "Y":
                    value = this.helpOfficer();
                break;               
            case "N":
                value = ReturnValue.BREAK;
                ignoreBreak = false;
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
                
        // for certain sub-menus (like SceneMenuView), we don't want to
        // return to the main menu, but to stop here
        if (ignoreBreak == true && value == ReturnValue.BREAK) {
            value = ReturnValue.CONTINUE;
        }

        return value;
    }
        private ReturnValue helpOfficer() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/

    private void answerQuestion() {
        System.out.println("\n*** AnswerQuestion Function called ***");
    }

    private void sceneMenu() {
        SceneMenuView sceneMenu = new SceneMenuView();
        sceneMenu.display();
    }
}

