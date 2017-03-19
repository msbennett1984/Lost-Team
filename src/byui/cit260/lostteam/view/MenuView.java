/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.model.Navigation;
import java.util.Scanner;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public abstract class MenuView implements ViewInterface {
    
    protected String displayMessage;
    
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
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop until a valid value is entered
            this.beforeGetInput();
            System.out.println(this.displayMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.isEmpty()) {
                System.out.println("Invalid input please input a correct character");
            } else {
                valid = true;
            }
        }
        
        return value.toUpperCase(); // return the value entered
    }
}
