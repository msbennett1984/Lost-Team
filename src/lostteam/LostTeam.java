/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostteam;


import byui.cit260.lostteam.model.Clue;
import byui.cit260.lostteam.model.Location;
import byui.cit260.lostteam.model.Map;

import byui.cit260.lostteam.model.Actor;
import byui.cit260.lostteam.model.Item;

import byui.cit260.lostteam.model.GameLost;
import byui.cit260.lostteam.model.Scene;

import byui.cit260.lostteam.model.Player;
import byui.cit260.lostteam.view.StartProgramView;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class LostTeam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    // create StartProgramViewOrig and display the start program view
    StartProgramView startProgramView = new StartProgramView();
    startProgramView.displayStartProgramView();
    }
    
}
