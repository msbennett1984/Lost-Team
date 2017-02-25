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
public class GameMenuView extends MenuView {

    private final SceneMenuView sceneMenuView;
    
    public GameMenuView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Game Menu View                        |"
            + "\n-----------------------------------------"
            + "\nS - Scene menu"
            + "\nB - Back to Main Menu"
            + "\nQ - Quit game"
            + "\n----------------------------------------",
        "Q");
        this.sceneMenuView = new SceneMenuView();
    }
    
    protected ReturnValue doAction(String choice) {
        ReturnValue value = ReturnValue.CONTINUE;
        boolean ignoreBreak = true;

        switch (choice) {
            case "S":
                value = this.sceneMenuView.displayMenu();
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

}
