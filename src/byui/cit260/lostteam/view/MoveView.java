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
import lostteam.LostTeam;

/**
 *
 * @author adm-achina
 */
    
public class MoveView extends MenuView{
    //private final String promptMessage;
    //private final String menu;
    
    public MoveView() {
         super("\n"
            + "\n-----------------------------------------"
            + "\n|          Movement                      |"
            + "\n-----------------------------------------"
            + "\n   N - North"
            + "\n   S - South"
            + "\n   E - East"
            + "\n   W - West"    
            + "\n   E - Return to Game Menu"
            + "\n----------------------------------------");     
    }
    
  
    @Override
    public boolean doAction(String Menu) {
        Menu = Menu.toUpperCase(); //convert to uppercase
        
        switch (Menu) {
            case "N": //North
                return this.north();
            case "S": //South
                return this.south();
            case "E": //East
               return this.east();
            case "W": //West
                return this.west();
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
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
