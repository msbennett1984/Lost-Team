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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class LostTeam {
    
    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;
    
    public static void main(String[] args) {
        // create StartProgramView
        StartProgramView startProgramView = new StartProgramView();
        try {
            // open character stream files for end user input and output
            LostTeam.inFile = new BufferedReader(new InputStreamReader(System.in));
            LostTeam.outFile = new PrintWriter(System.out, true);

            // open log file
            String filePath = "log.txt";
            LostTeam.logFile = new PrintWriter(filePath);
            
            // display the start program view
            startProgramView.display();
        } catch (Throwable e) {
            System.out.println("Exception: " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage());
            e.printStackTrace();
            startProgramView.display();
        } finally {
            try {
                if (LostTeam.inFile != null) {
                    LostTeam.inFile.close();
                }
                if (LostTeam.outFile != null) {
                    LostTeam.outFile.close();
                }
                if (LostTeam.logFile != null) {
                    LostTeam.logFile.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(LostTeam.class.getName()).log(Level.SEVERE, null, ex);
            }
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
    
    public static PrintWriter getOutFile() {
        return outFile;
    }
    
    public static void setOutFile(PrintWriter outFile) {
        LostTeam.outFile = outFile;
    }
    
    public static BufferedReader getInFile() {
        return inFile;
    }
    
    public static void setInFile(BufferedReader inFile) {
        LostTeam.inFile = inFile;
    }
    
    public static PrintWriter getLogFile() {
        return logFile;
    }
    
    public static void setLogFile(PrintWriter logFile) {
        LostTeam.logFile = logFile;
    }
}

