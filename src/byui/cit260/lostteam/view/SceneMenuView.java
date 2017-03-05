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
            + "\n----------------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        // changes all values to uppercase
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "M":
                this.moveMenu();
                break;
            case "C":
                this.createAntidote();
                break;
            case "S":
                this.searchLocation();
                break;
            case "T":
                this.talkToPerson();
                break;
            case "P":
                this.playerStats();
                break;
            case "B":
                this.gameMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    private void moveMenu() {
        MoveView moveMenu = new MoveView();
        moveMenu.display();
    }

    private void createAntidote() {
        AntidoteMenuView antidoteView = new AntidoteMenuView();
        antidoteView.display();
    }

    private void searchLocation() {
        // SearchLocationView searchLocation = new SearchLocationView();
        // searchLocation
        System.out.println("\n SearchLocation Function called ");
    }

    private void talkToPerson() {
        System.out.println("\n TalktoPerson Function called ");
    }

    private void playerStats() {
        PlayerStatsView playerStats = new PlayerStatsView();
        playerStats.display();
    }

    private void gameMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*  
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
    */
}
