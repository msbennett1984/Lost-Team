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
public class SceneMenuView extends MenuView {
    
    private final AntidoteMenuView antidoteMenuView;
    private final PlayerStatsView playerStatsView;
    
    public SceneMenuView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Scene Menu                            |"
            + "\n-----------------------------------------"
            + "\nM - Move: change Location"
            + "\nC - Create Antidote"
            + "\nS - Search Location"
            + "\nT - Talk to Person"
            + "\nP - Player Stats"
            + "\nB - Back to Game Menu"
            + "\n----------------------------------------",
        null);
        this.antidoteMenuView = new AntidoteMenuView();
        this.playerStatsView = new PlayerStatsView();
    }

    protected ReturnValue doAction(String choice) {
        ReturnValue value = ReturnValue.CONTINUE;
        boolean ignoreBreak = true;
 
        switch (choice) {
            case "M":
                value = this.movePlayer();
                break;
            case "C":
                value = this.antidoteMenuView.displayMenu();
                break;
            case "S":
                value = this.searchLocation();
                break;
            case "T":
                value = this.talkToPerson();
                break;                
            case "P":
                this.playerStatsView.displayMenu();
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

    private ReturnValue movePlayer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ReturnValue searchLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ReturnValue talkToPerson() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
