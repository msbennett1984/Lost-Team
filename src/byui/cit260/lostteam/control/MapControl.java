/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.control;

import byui.cit260.lostteam.model.Location;
import byui.cit260.lostteam.model.Map;
import byui.cit260.lostteam.model.Scene;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class MapControl {
    public static Map createMap() {
        // create the map
        Map map = new Map(5, 5);
        
        // create the scenes for the game
        Scene[] scenes = createScenes();
        
        // assign scenes to locations
        assignScenesToLocations(map, scenes);
        
        return map;
    }
    
    private static Scene[] createScenes() {
        // TODO: page 28
        Scene[] scenes = new Scene[0];
        return scenes;
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        // TODO: page 29
        return;
    }
}
