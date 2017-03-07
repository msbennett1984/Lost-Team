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
public class CalcCylinderVolume extends MenuView {
    

    public CalcCylinderVolume(){
        super( "\n                                                 "
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
            case "S":
                this.answerQuestion();
                break;
            case "B":
                this.sceneMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void sceneMenu() {
        SceneMenuView sceneMenu = new SceneMenuView();
        sceneMenu.display();
    }

    private void answerQuestion() {
        System.out.println("\n*** AnswerQuestion Function called ***");
    }
}
