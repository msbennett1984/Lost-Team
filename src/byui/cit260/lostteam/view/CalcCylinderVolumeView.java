/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.control.ClueControl;
import byui.cit260.lostteam.control.GameControl;
import byui.cit260.lostteam.exception.ClueControlException;
import byui.cit260.lostteam.exception.NonPositiveHeightException;
import byui.cit260.lostteam.exception.NonPositiveRadiusException;
import byui.cit260.lostteam.exception.VolumeHighException;
import byui.cit260.lostteam.exception.VolumeLowException;
import byui.cit260.lostteam.model.Actor;
import byui.cit260.lostteam.model.Navigation;

/**
 *
 * @author Dallin Barlow
 */
public class CalcCylinderVolumeView extends ClueView {

    public CalcCylinderVolumeView(Actor actor) {
        super(
          "\n                                                       "
        + "\n-------------------------------------------------------"
        + "\nA police officer is investigating the scene of a crime "
        + "\nthat was committed. 'It was a murder,' he tells you.   "
        + "\nThe victim was shot with a 9 mm, we have a rough idea  "
        + "\nof the distance, but we need to find the TRAJECTORY of "
        + "\nthe bullet. Help us out and I will tell you something  "
        + "\nuseful. Will you help?                                 "
        + "\nY - Yes I will help                                    "
        + "\nN - No I will not help (back to Scene Menu             ",
            actor,
            100 // wrongAnswerTimeDeduction
        );
    }

    @Override
    public Navigation answerQuestion() {
        this.console.println("Please enter the height of the cylinder:");
        int height = getInputInteger();
        this.console.println("Please enter the radius of the cylinder:");
        int radius = getInputInteger();
        double volume = -1;
        try {
            volume = ClueControl.calcVolumeOfCylinder((double)height, (double)radius);
        } catch (NonPositiveHeightException e) {
            this.console.println("\n*** Height must be positive *** Try again");
            return Navigation.WrongAnswer;
        } catch (NonPositiveRadiusException e) {
            this.console.println("\n*** Radius must be positive *** Try again");
            return Navigation.WrongAnswer;
        } catch (VolumeLowException e) {
            this.console.println("\n*** Volume of cylinder is too small *** Try again");
            return Navigation.WrongAnswer;
        } catch (VolumeHighException e) {
            this.console.println("\n*** Volume of cylinder is too big *** Try again");
            return Navigation.WrongAnswer;
        } catch (ClueControlException e) {
            this.console.println("\n*** Unknown error: " + e.getMessage() + " *** Try again");
            return Navigation.Continue;
        }
        this.console.println("\n*** Success! *** The cylinder volume of " + volume + " is just right!"
                           + "\n*** The " + actor.getDescription() + " gives you a clue ***"
                           + "\n" + actor.getClueGiven());
        GameControl.addInteraction(actor);
        return Navigation.ExitView;
    }
}
