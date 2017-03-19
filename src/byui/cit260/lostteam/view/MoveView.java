/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.control.MapControl;
import byui.cit260.lostteam.model.Game;
import byui.cit260.lostteam.model.Location;
import byui.cit260.lostteam.model.Map;
import byui.cit260.lostteam.model.Navigation;
import lostteam.LostTeam;

/**
 *
 * @author adm-achina
 */
    
public class MoveView extends MenuView{
    //private final String promptMessage;
    //private final String menu;
    
    public MoveView(String parentName) {
         super("\n"
            + "\n-----------------------------------------"
            + "\n|          Movement                      |"
            + "\n-----------------------------------------"
            + "\n   N - North"
            + "\n   S - South"
            + "\n   E - East"
            + "\n   W - West"    
            + "\n   B - Back to " + parentName
            + "\n----------------------------------------");     
    }
    
  
    @Override
    public Navigation doAction(String choice) {
        Navigation nav = Navigation.Continue;
        boolean moved = false;
        
        switch (choice) {
            case "N": //North
                moved = this.north();
                break;
            case "S": //South
                moved = this.south();
                break;
            case "E": //East
                moved = this.east();
                break;
            case "W": //West
                moved = this.west();
                break;
            case "B":
                // Back to Game or Scene Menu (immediately)
                return Navigation.ExitView;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }

        if (moved) {
            return Navigation.ExitView;
        }
        
        return nav;
    }

    private boolean north() {     
        Game game = LostTeam.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        
        if(map.getCurrentRow() == 0){
            System.out.println("Cannot go any further North, must choose alternate direction");
            return false;
        }else{
            MapControl.movePlayer(map, map.getCurrentRow() - 1, map.getCurrentColumn());
        }
       return true;
    }
    private boolean south() {
        Game game = LostTeam.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        
        if(map.getCurrentRow() == map.getRowCount()-1){
            System.out.println("Cannot go any further South, must choose alternate direction");
            return false;
        }else{
            MapControl.movePlayer(map, map.getCurrentRow() + 1, map.getCurrentColumn());
        }
        return true;
    }
     private boolean east() {
        Game game = LostTeam.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        
        if(map.getCurrentColumn() == map.getColumnCount()-1){
            System.out.println("Cannot go any further East, must choose alternate direction");
            return false;
        }else{
            MapControl.movePlayer(map, map.getCurrentRow(), map.getCurrentColumn() + 1);
        }
        return true;
    }

    private boolean west() {
        Game game = LostTeam.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        
        if(map.getCurrentColumn() == 0){
            System.out.println("Cannot go any further West, must choose alternate direction");
            return false;
        }else{
            MapControl.movePlayer(map, map.getCurrentRow(), map.getCurrentColumn() - 1);
        }
        return true;
    }
    
}
