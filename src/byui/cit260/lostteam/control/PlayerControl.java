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
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class PlayerControl {
    public static Player createPlayer(String name) {
        // creates an object of the Player class
        Player player = new Player(name);
        
        // saves the player
        LostTeam.setPlayer(player);

        return player;
    }
}
