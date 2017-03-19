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

import byui.cit260.lostteam.model.Game;
import byui.cit260.lostteam.model.Scene;

import byui.cit260.lostteam.model.Player;
import byui.cit260.lostteam.view.StartProgramView;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class LostTeam {
    
    private static Game currentGame = null;
    private static Player player = null;

    public static void main(String[] args) {
        // create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        try {
            startProgramView.displayStartProgramView();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.displayStartProgramView();
        }
    }

    //Getters and Setters
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        LostTeam.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        LostTeam.player = player;
    }

}

