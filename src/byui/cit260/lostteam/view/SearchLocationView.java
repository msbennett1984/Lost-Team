/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.model.Navigation;

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
        + "\nN - No (No return to Scene Menu)"
        + "\n");
    }
    
    @Override
    public Navigation doAction(String choice) {
        Navigation nav = Navigation.Continue;
        
        switch (choice) {
            case "Y":
                nav = this.searchLocation();
                break;
            case "N":
                // Back to Scene Menu (immediately)
                return Navigation.ExitView;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return nav;
    }

    private Navigation searchLocation() {
        System.out.println("\n SearchLocation function found ");
        return Navigation.Continue;
    }
}
