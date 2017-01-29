/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostteam;

import byui.cit260.lostteam.model.Clue;
import byui.cit260.lostteam.model.Location;
import byui.cit260.lostteam.model.Map;
import byui.cit260.lostteam.model.Player;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class LostTeam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Player class test
        Player playerOne = new Player();
        
        playerOne.setName("Wilma Flintstone");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        // Clue Class Test
        Clue clueOne = new Clue();
        
        clueOne.setDescription("Level One");
        clueOne.setReceived(true);
        clueOne.setType(true);
        
        String clueInfo = clueOne.toString();
        System.out.println(clueInfo);
        
        
        // Location Class Test
        Location locationOne = new Location();
        
        locationOne.setRow(1);
        locationOne.setColumn(3);
        locationOne.setVisited(true);
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        
        // Map Class Test
        Map mapOne = new Map();
        
        mapOne.setRowCount(5);
        mapOne.setColumnCount(5);
        mapOne.setCurrentRow(2);
        mapOne.setCurrentColumn(3);
        mapOne.setCurrentScene("Level 8");
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
         
    }
    
}
