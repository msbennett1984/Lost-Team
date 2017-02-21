/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.control;

import byui.cit260.lostteam.model.Player;
import lostteam.LostTeam;

/**
 *
 * @author Dallin Barlow
 */
public class GameControl {
    
    // creates a new player
    public static Player createPlayer(String playerName){
        
        if (playerName == null){
            return null;
        }
        // creates an object of the Player class
        Player player = new Player();
        player.setName(playerName);
        
        // saves the player
        LostTeam.setPlayer(player);
        
        return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame stub function called ***");
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
