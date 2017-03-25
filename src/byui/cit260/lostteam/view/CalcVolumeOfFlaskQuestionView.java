/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.control.ClueControl;
import byui.cit260.lostteam.control.GameControl;
import byui.cit260.lostteam.exception.ClueControlException;
import byui.cit260.lostteam.exception.LoseGameException;
import byui.cit260.lostteam.exception.NonPositiveHeightException;
import byui.cit260.lostteam.exception.NonPositiveRadiusException;
import byui.cit260.lostteam.exception.VolumeHighException;
import byui.cit260.lostteam.exception.VolumeLowException;
import byui.cit260.lostteam.model.Actor;
import byui.cit260.lostteam.model.Navigation;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 * Special thank you to Dallin Barlow for blazing the trail.
 */
public class CalcVolumeOfFlaskQuestionView extends ClueView {
    
    public CalcVolumeOfFlaskQuestionView(Actor actor) {
        super(
          "\n                                                       "
        + "\n-------------------------------------------------------"
        + "\nA child ask you to make a flask for his friend, the    "
        + "\nscientist, that is not too big and not too small.      "
        + "\nCreate the flask by inputtig the dimensions (height and"
        + "\nradius). The child will let you know if the flask you  "
        + "\ncreate is too big or two small (the volume of the      "
        + "\nflask). If it is either too big or too small, you will "
        + "\nneed to create another. Will you help                  "
        + "\nY - Yes I will help                                    "
        + "\nN - No I will not help (back to Scene Menu)            ",
            actor,
            100 // wrongAnswerTimeDeduction
        );
    }

    @Override
    public Navigation answerQuestion() {
        System.out.println("Please enter the height of the flask:");
        int height = getInputInteger();
        System.out.println("Please enter the radius of the flask:");
        int radius = getInputInteger();
        double volume = -1;
        try {
            volume = ClueControl.calcVolumeOfFlask((double)height, (double)radius);
        } catch (NonPositiveHeightException e) {
            System.out.println("\n*** Height must be positive *** Try again");
            return Navigation.WrongAnswer;
        } catch (NonPositiveRadiusException e) {
            System.out.println("\n*** Radius must be positive *** Try again");
            return Navigation.WrongAnswer;
        } catch (VolumeLowException e) {
            System.out.println("\n*** Volume of flask is too small *** Try again");
            return Navigation.WrongAnswer;
        } catch (VolumeHighException e) {
            System.out.println("\n*** Volume of flask is too big *** Try again");
            return Navigation.WrongAnswer;
        } catch (ClueControlException e) {
            System.out.println("\n*** Unknown error: " + e.getMessage() + " *** Try again");
            return Navigation.Continue;
        }
        System.out.println("\n*** Success! *** The flask volume of " + volume + " is just right!");
        return Navigation.ExitView;
    }
}
