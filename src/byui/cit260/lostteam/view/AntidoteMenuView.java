/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class AntidoteMenuView extends MenuView {
    
    public AntidoteMenuView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Antidote Menu                         |"
            + "\n-----------------------------------------"
            + "\nC - Create Antidote"
            + "\nB - Back to Scene Menu"
            + "\n----------------------------------------",
        null);
    }
    
    protected ReturnValue doAction(String choice) {
        ReturnValue value = ReturnValue.CONTINUE;
        boolean ignoreBreak = true;

        switch (choice) {
            case "C":
                value = this.createAntidote();
                break;
            case "B":
                value = ReturnValue.BREAK;
                ignoreBreak = false;
                break;
            case "Q":
                value = ReturnValue.EXIT;
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        // for certain sub-menus (like SceneMenuView), we don't want to
        // return to the main menu, but to stop here
        if (ignoreBreak == true && value == ReturnValue.BREAK) {
            value = ReturnValue.CONTINUE;
        }

        return value;
    }

    private ReturnValue createAntidote() {
        System.out.println("\n*** createAntidote stub function called ***");
        return ReturnValue.CONTINUE;
    }
    
}
