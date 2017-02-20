/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import java.util.Scanner;
import lostteam.LostTeam;
import byui.cit260.lostteam.control.GameControl;
import byui.cit260.lostteam.model.GameLost;
import java.awt.Graphics;
import java.awt.Shape;
import javax.swing.text.BadLocationException;
import javax.swing.text.Position;
import javax.swing.text.View;




/**
 *
 * @author Dallin Barlow
 */

//public class MainMenuView {

   // void displayMainMenuView() {
       // System.out.println("\n**** displayMenu() function called ****"); //To change body of generated methods, choose Tools | Templates.
   // }
    

public class MainMenuView extends View {

    private String menu;
    
    public MainMenuView(){
            super("\n"
                  + "\n------------------------"
                  + "\n | Main Menu"
                  + "\n------------------------"
                  + "\nN - Start New Game"
                  + "\nO - Load Game"
                  + "\nH - Help"
                  + "\nS - Save Game"
                  + "\nE - Exit Game"
                  + "\n------------------------");
                 
    }
    @Override
    public boolean doAction(String value) {
        char selection = value.charAt(0);
        switch (selection) {

            case 'N':
                this.startNewGame();
                break;
            case 'S':
                saveGame();
                break;
            case 'O':
                openGame();
                break;
            case 'H':
                showHelpMenu();
                break;
            case 'E':
                exitGame();
                return true;

            default:
                ErrorView.display(this.getClass().getName(),"Invalid selection - Try again");
                break;
        }
        return false;
    }
    
    

   public void startNewGame() {
        GameControl.createNewGame(LostTeam.getPlayer());

        GameMenuView gameMenu = new GameMenuView() {};
        gameMenu.display();


    }

    private void saveGame() {
this.console.println("Enter the path where you want to save the game");
String filePath = this.getInput();

try{
    GameControl.saveGame(LostTeam.getCurrentGame(), filePath);
}catch(Exception ex){
    ErrorView.display("MainMenuView", ex.getMessage());
}
    }

    private void openGame() {
 this.console.println("Enter file path of saved game");
        
        String filePath = this.getInput();
         try{
             GameControl.openGame(filePath);
         }catch(Exception ex){
             ErrorView.display("MainMenuView",ex.getMessage());
         }
         
         GameMenuView gameMenu = new GameMenuView();
         gameMenu.display();    }

    private void showHelpMenu() {
    HelpMenuView helpMenu = new HelpMenuView();
    helpMenu.display();
    }

    private void exitGame() {
                ErrorView.display(this.getClass().getName(),"exit game");
    }

       
    
}
