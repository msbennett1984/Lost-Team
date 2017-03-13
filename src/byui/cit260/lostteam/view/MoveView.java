/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

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
            + "\n   V - View Map"     
            + "\n   Q - Quit Game"
            + "\n----------------------------------------");     
    }
    
  
    @Override
    public boolean doAction(String Menu) {
        Menu = Menu.toUpperCase(); //convert to uppercase
        
        switch (Menu) {
            case "N": //North
                this.north();
                break;
            case "S": //South
                this.south();
                break;
            case "E": //East
                this.east();
                break;
            case "W": //West
                this.west();
                break;
            case "V": //View Map
                this.viewMap();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
                break;
        }
        return false;
    }

    private void north() {     
        
        System.out.println("***You have chosen North***");
        open();
    }
    private void south() {
        
        System.out.println("***You have chosen South***");
        open();
    }
     private void east() {
        
        System.out.println("***You have chosen East***");
        open();
    }
      private void west() {
        
        System.out.println("***You have chosen West***");
        open();
    }
      
      private void open() {
        GameControl();
      }

    private void GameControl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewMap() {
        StringBuilder line;
        
        Game game = LostTeam.getCurrentGame();
        Map map = game.getMap();

        
        System.out.println("***                   Map                    ***");
        line = new StringBuilder("                                          ");
       
        //
        //for(Location location : map){
            
        //}
    }

      
}
