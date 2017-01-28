/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostteam;

import byui.cit260.lostteam.model.Actor;
import byui.cit260.lostteam.model.Item;
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
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintstone");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //Item test by S. Bennett
        Item itemOne = new Item();
        
        itemOne.setNoItems(5);
        itemOne.setName("mushroom");
        itemOne.setRequiredAmount(6);
        
        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);
        
        //Actor test by S. Bennett
        Actor actorOne = new Actor();
        
        actorOne.setName("Scientist");
        actorOne.setCooridinates("Subway");
        actorOne.setSpokenTo(Boolean.TRUE);
        actorOne.setClueGiven("See the Deli Owner");
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
    }
    
}
