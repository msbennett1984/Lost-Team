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
        + "\nA lost child has his finger in a leaking pipe and ask  "
        + "\nyou to help him by making a plug for the hole. As you  "
        + "\nstudy the problem you realize that you will need a     "
        + "\ncylinder. But what size? If you calculate the volume of"
        + "\na cylinder and create that size then you will have the "
        +  "\nperfect plug. Create the cylinder by entering height   "
        + "\nand radius. If it is either too big or too small,      "
        + "\nyou will need to create another. Will you help         "
        + "\nY - Yes I will help                                    "
        + "\nN - No I will not help (back to Scene Menu)            ",
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
