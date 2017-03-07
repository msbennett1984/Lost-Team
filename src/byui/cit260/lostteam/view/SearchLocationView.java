/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

/**
 *
 * @author Dallin Barlow
 */
public class SearchLocationView extends MenuView {
    
    SearchLocationView(){
        super("\n"
        + "\n----------------------------------------------"
        + "\nWould you like to search your current location"
        + "\n                 for Items?"
        + "\nY - Yes (search for Items)"
        +"\nN - No (No return to Scene Menu)"
        + "\n");
    }
    
    
    @Override
    public boolean doAction(String choice) {
        // changes all values to uppercase
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "Y":
                this.searchLocation();
                break;
            case "N":
                this.sceneMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void searchLocation() {
        System.out.println("\n SearchLocation function found ");
    }

    private void sceneMenu() {
        SceneMenuView sceneMenu = new SceneMenuView();
        sceneMenu.display();
    }
}
