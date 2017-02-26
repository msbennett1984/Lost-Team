/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import java.util.Scanner;

/**
 *
 * @author Dallin Barlow
 */
public class PlayerStatsView extends MenuView {

      
    public PlayerStatsView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n|             Player Stats              |"
            + "\n-----------------------------------------"
            + "\nP - People Spoken To (Clues)             "
            + "\nI - Item Inventory                       "
            + "\nL - Locations Visited                    "
            + "\nT - Time Remaining                       "
            + "\nB - Back to Scene Menu                   "
            + "\n-----------------------------------------",
        null);
    }

    protected ReturnValue doAction(String choice) {
        ReturnValue value = ReturnValue.CONTINUE;
        boolean ignoreBreak = true;
 
        switch (choice) {
            case "P":
                    value = this.peopleSpokenTo();
                break;
            case "I":
                value = this.itemInventory();
                break;
            case "L":
                value = this.locationsVisited();
                break;
            case "T":
                value = this.timeRemaining();
                break;                
            case "B":
                value = ReturnValue.BREAK;
                ignoreBreak = false;
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        // for certain sub-menus (like PlayerStatsMenu), we don't want to
        // return to the main menu, but to stop here
        if (ignoreBreak == true && value == ReturnValue.BREAK) {
            value = ReturnValue.CONTINUE;
        }
        
        return value;
    }  

    private ReturnValue locationsVisited() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ReturnValue timeRemaining() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ReturnValue itemInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ReturnValue peopleSpokenTo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
