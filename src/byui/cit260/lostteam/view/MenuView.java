/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.model.Navigation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import lostteam.LostTeam;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public abstract class MenuView implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = LostTeam.getInFile();
    protected final PrintWriter console = LostTeam.getOutFile();
    
    public MenuView(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public Navigation display() {
        Navigation nav = Navigation.Continue;
        do {
            // prompt for and get user's input
            String choice = this.getInput();
//            // user wants to quit
//            if (choice.equals("Q")) {
//                // exit the view
//                return Navigation.ExitView;
//            }
            // does the requested action and (possibly) displays the next view
            nav = this.doAction(choice);
        } while (nav == Navigation.Continue);
        // exit once nav does not equal continue
        return nav;
    }
    
    /**
     * Override this method in child classes to display something before
     * the displayMessage is shown while gathering input.
     */
    protected void beforeGetInput() {
        return;
    }
    
    @Override
    public String getInput() {
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop until a valid value is entered
            this.beforeGetInput();
            System.out.println(this.displayMessage);
            
            try {
                value = this.keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks
            } catch (IOException ex) {
                Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (value.isEmpty()) {
                System.out.println("Invalid input please input a correct character");
            } else {
                valid = true;
            }
        }
        
        return value.toUpperCase(); // return the value entered
    }
    
    public int getInputInteger() {
        String value = ""; // String value to be parsed
        int valueInteger = -1;
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop until a valid value is entered
            try {
                value = this.keyboard.readLine(); // get next line typed on keyboard
                value = value.trim(); // trim off leading and trailing blanks
            } catch (IOException ex) {
                Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (value.isEmpty()) {
                System.out.println("Invalid input, please input an integer");
            } else {
                try {
                    valueInteger = Integer.parseInt(value);
                    valid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input, please input an integer");
                    System.out.println(e.getMessage());
                }
            }
        }
        
        return valueInteger;
    }
}
