/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.control;

import byui.cit260.lostteam.model.Actor;
import byui.cit260.lostteam.model.Location;
import byui.cit260.lostteam.model.Map;
import byui.cit260.lostteam.model.Scene;
import byui.cit260.lostteam.model.SceneType;

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

    public static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];

        // Scene 1
        Scene subLabratory = new Scene();
        subLabratory.setDescription("Subway Car Lab");
        subLabratory.setSignSymbol("SL");
        subLabratory.setActor(Actor.Scientist);
        scenes[SceneType.Subway_Car_Lab.ordinal()] = subLabratory;
        

        // Scene 2
        Scene bathroom1 = new Scene();
        bathroom1.setDescription("Bathroom 1");
        bathroom1.setSignSymbol("B1");
        scenes[SceneType.Bathroom1.ordinal()] = bathroom1;

        // Scene 3
        Scene ticketBooth = new Scene();
        ticketBooth.setDescription("TicketBooth");
        ticketBooth.setSignSymbol("TB");
        scenes[SceneType.Ticket_Booth.ordinal()] = ticketBooth;

        // Scene 4
        Scene trainPlatform = new Scene();
        trainPlatform.setDescription("Train Platform");
        trainPlatform.setSignSymbol("TP");
        scenes[SceneType.Train_Platform.ordinal()] = trainPlatform;

        // Scene 5
        Scene stairs = new Scene();
        stairs.setDescription("Stairs");
        stairs.setSignSymbol("ST");
        scenes[SceneType.Stairs.ordinal()] = stairs;

        // Scene 6
        Scene cab = new Scene();
        cab.setDescription("Cab");
        cab.setSignSymbol("CB");
        scenes[SceneType.Cab.ordinal()] = cab;

        // Scene 7
        Scene gutter = new Scene();
        gutter.setDescription("Gutter");
        gutter.setSignSymbol("GT");
        scenes[SceneType.Gutter.ordinal()] = gutter;

        // Scene 8
        Scene lightPost = new Scene();
        lightPost.setDescription("Light Post");
        lightPost.setSignSymbol("LP");
        scenes[SceneType.Light_Post.ordinal()] = lightPost;

        // Scene 9
        Scene stopSign = new Scene();
        stopSign.setDescription("Stop Sign");
        stopSign.setSignSymbol("SS");
        scenes[SceneType.Stop_Sign.ordinal()] = stopSign;

        // Scene 10
        Scene paperBox = new Scene();
        paperBox.setDescription("Paper Box");
        paperBox.setSignSymbol("PB");
        scenes[SceneType.Paper_Box.ordinal()] = paperBox;

        // Scene 11
        Scene sandwichShop = new Scene();
        sandwichShop.setDescription("Sandwich Shop");
        sandwichShop.setSignSymbol("SP");
        scenes[SceneType.Sandwich_Shop.ordinal()] = sandwichShop;

        // Scene 12
        Scene convientStore = new Scene();
        convientStore.setDescription("Convient Store");
        convientStore.setSignSymbol("CS");
        scenes[SceneType.Convient_Store.ordinal()] = convientStore;

        // Scene 13
        Scene repairShop = new Scene();
        repairShop.setDescription("Repair Shop");
        repairShop.setSignSymbol("RS");
        scenes[SceneType.Repair_Shop.ordinal()] = repairShop;

        // Scene 14
        Scene magazineStore = new Scene();
        magazineStore.setDescription("Magazine Shop");
        magazineStore.setSignSymbol("MS");
        scenes[SceneType.Magazine_Shop.ordinal()] = magazineStore;

        // Scene 15
        Scene hotdogCart = new Scene();
        hotdogCart.setDescription("Hotdog Cart");
        hotdogCart.setSignSymbol("HC");
        scenes[SceneType.Hotdog_Cart.ordinal()] = hotdogCart;

        // Scene 16
        Scene sunglassHut = new Scene();
        sunglassHut.setDescription("Sunglass Hut");
        sunglassHut.setSignSymbol("SH");
        scenes[SceneType.Sunglass_Hut.ordinal()] = sunglassHut;

        // Scene 17
        Scene foodCourt = new Scene();
        foodCourt.setDescription("Food Court");
        foodCourt.setSignSymbol("FC");
        scenes[SceneType.Food_Court.ordinal()] = foodCourt;

        // Scene 18
        Scene departmentStore = new Scene();
        departmentStore.setDescription("Department Store");
        departmentStore.setSignSymbol("DS");
        scenes[SceneType.Department_Store.ordinal()] = departmentStore;

        // Scene 19
        Scene jewelery = new Scene();
        jewelery.setDescription("Jewelery Store");
        jewelery.setSignSymbol("JS");
        scenes[SceneType.Jewelery_Store.ordinal()] = jewelery;

        // Scene 20
        Scene bathroom2 = new Scene();
        bathroom2.setDescription("Bathroom 2");
        bathroom2.setSignSymbol("B2");
        scenes[SceneType.Bathroom2.ordinal()] = bathroom2;

        // Scene 21
        Scene cigarStore = new Scene();
        cigarStore.setDescription("Cigar Store");
        cigarStore.setSignSymbol("CR");
        scenes[SceneType.Cigar_Store.ordinal()] = cigarStore;

        // Scene 22
        Scene hotel = new Scene();
        hotel.setDescription("Hotel");
        hotel.setSignSymbol("HT");
        scenes[SceneType.Hotel.ordinal()] = hotel;

        // Scene 23
        Scene valet = new Scene();
        valet.setDescription("Valet Station");
        valet.setSignSymbol("VS");
        scenes[SceneType.Valet_Station.ordinal()] = valet;

        // Scene 24
        Scene restaurant = new Scene();
        restaurant.setDescription("Restaurant");
        restaurant.setSignSymbol("RT");
        scenes[SceneType.Restautrant.ordinal()] = restaurant;

        // Scene 25
        Scene concierge = new Scene();
        concierge.setDescription("Concierge");
        concierge.setSignSymbol("CG");
        scenes[SceneType.Concierge.ordinal()] = concierge;

        return scenes;
    }

    // assigns the scene to a location
    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

        //start point
        locations[0][0].setScene(scenes[SceneType.Subway_Car_Lab.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.Bathroom1.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.Ticket_Booth.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.Train_Platform.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.Stairs.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.Cab.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.Gutter.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.Light_Post.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.Stop_Sign.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.Paper_Box.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.Sandwich_Shop.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.Convient_Store.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.Repair_Shop.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.Magazine_Shop.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.Hotdog_Cart.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.Sunglass_Hut.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.Food_Court.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.Department_Store.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.Jewelery_Store.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.Cigar_Store.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.Hotel.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.Valet_Station.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.Restautrant.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.Bathroom2.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.Concierge.ordinal()]);
    }

    public static void movePlayerToStartingLocation(Map map) {
        // If starting location is not supposed to be 0,0 then use the correct values here.
        movePlayer(map, 0, 0);
    }

    public static void movePlayer(Map map, int row, int column) {
        map.setCurrentLocation(map.getLocations()[row][column]);
        map.getCurrentLocation().setVisited(true);
        map.setCurrentRow(row);
        map.setCurrentColumn(column);
    }
}
