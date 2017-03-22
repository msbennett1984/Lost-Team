/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.control.ClueControl;
import byui.cit260.lostteam.exception.ClueControlException;
import byui.cit260.lostteam.exception.NonPositiveHeightException;
import byui.cit260.lostteam.exception.NonPositiveRadiusException;
import byui.cit260.lostteam.exception.VolumeHighException;
import byui.cit260.lostteam.exception.VolumeLowException;
import byui.cit260.lostteam.model.Navigation;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 * Special thank you to Dallin Barlow for blazing the trail.
 */
public class CalcVolumeOfFlaskQuestionView extends MenuView {
    
    public CalcVolumeOfFlaskQuestionView() {
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

        return nav;
    } 

    private Navigation answerQuestion() {
        System.out.println("Please enter the height of the flask:");
        int height = getInputInteger();
        System.out.println("Please enter the radius of the flask:");
        int radius = getInputInteger();
        double volume = -1;
        try {
            volume = ClueControl.calcVolumeOfFlask((double)height, (double)radius);
        } catch (NonPositiveHeightException e) {
            System.out.println("Height must be positive, please try again");
            return Navigation.Continue;
        } catch (NonPositiveRadiusException e) {
            System.out.println("Radius must be positive, please try again");
            return Navigation.Continue;
        } catch (VolumeLowException e) {
            System.out.println("Volume of flask is too small, please try again");
            return Navigation.Continue;
        } catch (VolumeHighException e) {
            System.out.println("Volume of flask is too big, please try again");
            return Navigation.Continue;
        } catch (ClueControlException e) {
            System.out.println("Unknown error: " + e.getMessage() + " (please try again)");
            return Navigation.Continue;
        }
        System.out.println("Success! The flask volume of " + volume + " is just right!");
        return Navigation.ExitView;
    }
}
