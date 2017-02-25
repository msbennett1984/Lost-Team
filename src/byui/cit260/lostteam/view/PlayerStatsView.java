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
public class PlayerStatsView {
    
    // creates a string variable to store info in
    private String menu;
    
    // string variable given a value: Player Stat Menu
    public PlayerStatsView(){
        this.menu = "\n                                   " +
                "\n---------------------------------------" +
                "\n            | Player Stats |           " +
                "\n---------------------------------------" +
                "\n P - People Spoken To (Clues Given)    " +
                "\n I - Item Inventory                    " +
                "\n L - Locations Visited                 " +
                "\n T - Time Remaining                    " +
                "\n B - Back to Location Menu             " +
                "\n                                       " ;
    }
    
    // gets the imput from the player
    public String getInput(){
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        // while a valid name has not been retrieved
        while(!valid){
            
            // gets the value entered by the user
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            
        }
    }
}
