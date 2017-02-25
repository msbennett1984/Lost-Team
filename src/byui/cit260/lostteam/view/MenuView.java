/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import java.util.Scanner;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class MenuView {

    public enum ReturnValue {
        CONTINUE,
        BREAK,
        EXIT
    }
    
    private String menu;
    private final String exit;

    public MenuView(String menu, String exit) {
        this.menu = menu;
        this.exit = exit;
    }
    
    public ReturnValue displayMenu() {
        ReturnValue value = ReturnValue.CONTINUE;
        do {
            String choice = this.getInput();
            if (this.exit != null && choice.equals(this.exit)) {
                value = ReturnValue.EXIT;
                return value;
            }
            value = this.doAction(choice);
        } while (value == ReturnValue.CONTINUE);
        return value;
    }
    
    protected void beforeGetInput() {
        return;
    }
    
    private String getInput() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            this.beforeGetInput();
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            valid = true;
            break; // end the loop
        }
        
        return value.toUpperCase(); // return the value entered
    }
    
    protected ReturnValue doAction(String choice) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
}
