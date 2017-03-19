/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.model.Game;
import byui.cit260.lostteam.model.Location;
import byui.cit260.lostteam.model.Map;
import byui.cit260.lostteam.model.Navigation;
import lostteam.LostTeam;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class GameMenuView extends MenuView {

    public GameMenuView(){
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Game Menu View                        |"
            + "\n-----------------------------------------"
            + "\nD - Display Map                          "
            + "\nM - Move to new Location"
            + "\nS - Scene menu"
            + "\nB - Back to Main Menu"
            + "\nE - Exit Game"
            + "\n----------------------------------------");
    }
    
    @Override
    public Navigation doAction(String choice) {
        Navigation nav = Navigation.Continue;
        
        switch (choice) {
            case "D":
                this.displayMap();
                break;
            case "M":
                nav = this.moveMenu();
                break;
            case "S":
                nav = this.sceneMenu();
                break;
            case "B":
                // Back to Main Menu (immediately)
                return Navigation.ExitView;
            case "E":
                // Exit Game (immediately)
                return Navigation.ExitGame;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        // Stop exiting view and continue with this view
        if (nav == Navigation.ExitView) {
            nav = Navigation.Continue;
        }
      
        return nav;
    }
    
    private Navigation sceneMenu() {
        SceneMenuView sceneMenu = new SceneMenuView();
        return sceneMenu.display();
    }
    
    private Navigation moveMenu() {
        MoveView moveMenu = new MoveView("Game Menu");
        Navigation nav = moveMenu.display();
        if (nav == Navigation.ExitView) {
            displayMap();
        }
        return nav;
    }

    public void displayMap() {
  String leftIndicator;
  String rightIndicator;

  Game game = LostTeam.getCurrentGame(); // retreive the game
  Map map = game.getMap(); // retreive the map from game
  Location[][] locations = map.getLocations(); // retreive the locations from map
    // Build the heading of the map
    System.out.print("  |");
    for( int column = 0; column < locations[0].length; column++){
      // print col numbers to side of map
      System.out.print("  " + column + " |"); 
    }
    // Now build the map.  For each row, show the column information
    System.out.println();
    for( int row = 0; row < locations.length; row++){
     System.out.print(row + " "); // print row numbers to side of map
      for( int column = 0; column < locations[row].length; column++){
        // set default indicators as blanks
        leftIndicator = " ";
        rightIndicator = " ";
        if(locations[row][column] == map.getCurrentLocation()){
          // Set star indicators to show this is the current location.
          leftIndicator = "*"; 
          rightIndicator = "*"; 
        } 
        else if(locations[row][column].isVisited()){
           // Set < > indicators to show this location has been visited.
           leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
           rightIndicator = "<"; // same as above
        }
       System.out.print("|"); // start map with a |
        if(locations[row][column].getScene() == null)
        {
             // No scene assigned here so use ?? for the symbol
             System.out.print(leftIndicator + "??" + rightIndicator);
        }
        else
          System.out.print(leftIndicator
             + locations[row][column].getScene().getSignSymbol()
             + rightIndicator);
      }
     System.out.println("|");
    }
 }
}
