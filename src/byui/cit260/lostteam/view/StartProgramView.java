/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.control.GameControl;
import byui.cit260.lostteam.control.PlayerControl;
import byui.cit260.lostteam.model.Player;
import java.util.Scanner;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class StartProgramView {
    
    private String promptMessage;
    
    
    public StartProgramView() {
        
        // promptMessage = "Please enter your name"
        this.promptMessage = "\nPlease enter your name: ";
        
        //display the banner when view is created
        this.displayBanner();
        
    }

    private void displayBanner() {
        
        System.out.println(
              "\n************************************************"
            + "\n                                               *"
            + "\n* In this game, you will be taking on the role *"
            + "\n* of a person who has woken up with            *"
            + "\n* dissociative amenesia. You wake up in a      *"
            + "\n* laboratory subway car with no memory of who  *"
            + "\n* you are and how you got there. Your nose is  *"
            + "\n* broken and your wallet is missing. You have  *"
            + "\n* no coat, and despite it being winder, you    *"
            + "\n* seem to be sun burnt. After a brief,         *"
            + "\n* exploration, you discover that you have been *"
            + "\n* poisoned. You have a limited amount of time  *"
            + "\n* to solve your mystery and take the antidote  *"
            + "\n* before it is too late.                       *"
            + "\n*                                              *"
            + "\n* Everything that you need to solve the mystery*"
            + "\n* is found in your city within the locations   *"
            + "\n* on your map.                                 *"
            + "\n*                                              *"
            + "\n* The game begins as you wake up in the subway *"
            + "\n* car. During the game, you will need to       *"
            + "\n* explore the locations on your map, find and  *"
            + "\n* collect physical clues, and solve the        *"
            + "\n* mystery. You have successfully complete the  *"
            + "\n* game after you have recovered your memory    *"
            + "\n* and found the antidote.                      *"
            + "\n*                                              *"
            + "\n* Gook luck and have fun in this adventure!    *"
            + "\n                                               *"
            + "\n************************************************"
            );
    }
    
    /**
     * displays the start program view
     */
    public void displayStartProgramView() {
        /*
        do
            Prompt for and get the input value
            if (value == “Q”) then
                return

            do requested action and display the next view
        while the view is not done
        */
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) //user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(playersName);
            
        } while (!done);
    }

    private String getPlayersName() {
        /*
         WHILE a valid value has not been entered
            DISPLAY a message prompting the user to enter a value
            GET the value entered from keyboard
            Trim front and trailing blanks off of the value
 
            IF the length of the value is blank THEN
                DISPLAY “Invalid value: The value cannot be blank”
                CONTINUE
            ENDIF
 
            BREAK
 
            ENDWHILE
            RETURN value 
        */
    
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;     
            }
            
            break; // end the loop    
        }
        return value; // return the value entered
    }

    private boolean doAction(String playersName) {
        // if the length of the playersName < 2 characters
        if (playersName.length() < 2){
            System.out.println("\nInvalid players name: " +
                    "The name must be greater than one character in length");
            return false;
        }
        // call createPlayer() control function
        Player player = PlayerControl.createPlayer(playersName);
        
        // if unsuccessful
        if(player == null){
            System.out.println("\nError in creating the player.");
            return false;
        }
        
        // display next view
        this.displayNextView(player);
        
        // if successful
        return true;

    }

    private void displayNextView(Player player) {
        System.out.println("\n****************************************"
                + "\n Welcome to the game LOST "+ player.getName()
                + "\n We hope you have a great time in your adventure!!!"
                + "\n*****************************************"); 
        
        // Creates Main Menu Object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display Main Menu View
        mainMenuView.display();
    }

    
}
