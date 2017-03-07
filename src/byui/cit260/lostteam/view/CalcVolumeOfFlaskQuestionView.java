/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 * Special thank you to Dallin Barlow for blazing the trail.
 */
public class CalcVolumeOfFlaskQuestionView extends MenuView {
    
    public CalcVolumeOfFlaskQuestionView(){
         super ( "\n                                                 "
        + "\n-------------------------------------------------------"
        + "\nA child ask you to make a flask for his friend, the    "
        + "\nscientist, that is not too big and not too small.      "
        + "\nCreate the flask by inputtig the dimensions (height and"
        + "\nradius). The child will let you know if the flask you  "
        + "\ncreate is too big or two small (the volume of the      "
        + "\nflask). If it is either too big or too small, you will "
        + "\nneed to create another. Will you help                  "
        + "\nY - Yes I will help                                    "
        + "\nN - No I will not help (back to Scene Menu)            ");
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

    private void answerQuestion() {
        System.out.println("\n*** AnswerQuestion Function called ***");
    }

    private void sceneMenu() {
        SceneMenuView sceneMenu = new SceneMenuView();
        sceneMenu.display();
    }
}
