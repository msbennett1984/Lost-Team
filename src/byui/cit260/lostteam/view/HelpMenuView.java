/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

// import byui.cit260.lostteam.view.MenuView.ReturnValue;

import byui.cit260.lostteam.model.Navigation;


/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class HelpMenuView extends MenuView {
    
    public HelpMenuView(){
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Help Menu                             |"
            + "\n-----------------------------------------"
            + "\nG - Goal of Game"
            + "\nH - How to Move"
            + "\nF - Finding Clues"
            + "\nB - Back to Main Menu"
            + "\nE - Exit Game"
            + "\n----------------------------------------");
    }
    
    @Override
    public Navigation doAction(String choice) {
        Navigation nav = Navigation.Continue;
        
        switch (choice) {
            case "G":
                nav = this.goalOfGame();
                break;
            case "H":
                nav = this.howToMove();
                break;
            case "F":
                nav = this.findingClues();
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
    
    private Navigation goalOfGame() {
        System.out.println(
              "\n          *** Goal of the Game ***"
            + "\n************************************************"
            + "\n*                                              *"
            + "\n* In this game, you will be taking on the role *"
            + "\n* of a person who has woken up with            *"
            + "\n* dissociative amenesia. You wake up in a      *"
            + "\n* laboratory subway car with no memory of who  *"
            + "\n* you are and how you got there. Your nose is  *"
            + "\n* broken and your wallet is missing. You have  *"
            + "\n* no coat, and despite it being winder, you    *"
            + "\n* seem to be sun burnt. After a brief,         *"
            + "\n* exploration, you discover that you have been *"
            + "\n* poisoned. You have a limited amount of time  *"
            + "\n* to solve your mystery and take the antidote  *"
            + "\n* before it is too late.                       *"
            + "\n*                                              *"                      
            + "\n* You have 120 minutes.                        *"
            + "\n*                                              *"
            + "\n* Time maybe lost as you search scenes, talk to*"
            + "\n* people, solve problems or try to create the  *"
            + "\n* needed antidote. Talk to people for clues    *"
            + "\n* that will save you time.                     *"
            + "\n*                                              *"
            + "\n* Everything that you need to solve the mystery*"
            + "\n* is found in your city within the locations   *"
            + "\n* on your map.                                 *"
            + "\n*                                              *"
            + "\n* The game begins as you wake up in the subway *"
            + "\n* car. During the game, you will need to       *"
            + "\n* explore the locations on your map, find and  *"
            + "\n* collect physical clues, and solve the        *"
            + "\n* mystery. You have successfully complete the  *"
            + "\n* game after you have recovered your memory    *"
            + "\n* and found the antidote.                      *"
            + "\n*                                              *"
            + "\n* Gook luck and have fun in this adventure!    *"
            + "\n*                                              *"
            + "\n************************************************"
            );
        return Navigation.Continue;
    }

    private Navigation howToMove() {
        System.out.println(
            "\n             *** How To Move ***"
            + "\n************************************************"
            + "\n*                                              *"
            + "\n* Display the map by selecting D - Display Map *"
            + "\n* from the Game Menu. The map will display as a*"
            + "\n* 5 x 5 grid. On the grid >??< will indicate   *"
            + "\n* a scene visited and *??* will indicate your  *"
            + "\n* current location.                            *"
            + "\n*                                              *"
            + "\n* From the Scene Menu select, M - Move: Change *"
            + "\n* Location. The Movement menu give you 5       *"
            + "\n* options:                                     *"
            + "\n* N - North                                    *"
            + "\n* S - South                                    *"
            + "\n* E - East                                     *"
            + "\n* W - West                                     *"
            + "\n* B - Back to Scene Menu                       *"
            + "\n*                                              *"
            + "\n* Choose either N, S, E, W until you reach the *"
            + "\n* For example moving from SL to TP would       *"
            + "\n* require the following moves                  *"
            + "\n* East, East, East, South South                *"
            + "\n* or E, E, E, S, S                             *"
            + "\n*          Good Luck!                          *"
            + "\n************************************************"
            );
        return Navigation.Continue;
    }

    private Navigation findingClues() {
        System.out.println(
            "\n             *** Finding Clues ***"
            + "\n************************************************"
            + "\n*                                              *"
            + "\n* As you move from location to location, you   *"
            + "\n* will have the choice to talk to a person at  *"
            + "\n* the location. Some people will have clues to *"
            + "\n* help you know the amount of each ingredient  *"
            + "\n* is needed for the antidote, clues about      *"
            + "\n* people talk to, or clues about where to look *"
            + "\n* for ingredient                               *"
            + "\n*                                              *"
            + "\n* Some people you talk to will have math       *"
            + "\n* problems to solve before they will give you  *"
            + "\n* a clue.                                      *"
            + "\n*                                              *"
            + "\n* Beware! Talking to people who do not have    *"
            + "\n* a clue will cost you precious time!          *" 
            + "\n************************************************"
        );
        return Navigation.Continue;
    }
}
