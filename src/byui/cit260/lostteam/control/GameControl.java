/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.control;

import byui.cit260.lostteam.model.Actor;
import byui.cit260.lostteam.model.Game;
import byui.cit260.lostteam.model.InventoryItem;
import byui.cit260.lostteam.model.Item;
import byui.cit260.lostteam.model.Location;
import byui.cit260.lostteam.model.Map;
import byui.cit260.lostteam.model.Player;
import byui.cit260.lostteam.model.Scene;
import byui.cit260.lostteam.model.SceneType;
import java.util.LinkedHashSet;
import java.util.Set;
import lostteam.LostTeam;

/**
 *
 * @author Dallin Barlow
 */
public class GameControl {

    public static void createNewGame(Player player) {
        Game game = new Game(); // create new game
        LostTeam.setCurrentGame(game); // save in LostTeam
        
        game.setPlayer(player); // save player in game
        
        // create the inventory and save in the game
        InventoryItem[] inventory = GameControl.createInventory();
        game.setInventory(inventory);
        
        // create the interactions set and save in the game
        Set<Actor> interactions = GameControl.createInteractions();
        game.setInteractions(interactions);
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // save map in game
        
        // set remaining time to 120 minutes
        game.setRemainingTime(120);
    }
    
    
    public static InventoryItem[] createInventory() {
        InventoryItem[] inventory = new InventoryItem[8];
        
        inventory[Item.Aspirin.ordinal()] = new InventoryItem(Item.Aspirin);
        inventory[Item.BottledWater.ordinal()] = new InventoryItem(Item.BottledWater);
        inventory[Item.Coconut.ordinal()] = new InventoryItem(Item.Coconut);
        inventory[Item.DeliMeat.ordinal()] = new InventoryItem(Item.DeliMeat);
        inventory[Item.HotDog.ordinal()] = new InventoryItem(Item.HotDog);
        inventory[Item.Mushroom.ordinal()] = new InventoryItem(Item.Mushroom);
        inventory[Item.Nutmilk.ordinal()] = new InventoryItem(Item.Nutmilk);
        inventory[Item.TicTac.ordinal()] = new InventoryItem(Item.TicTac);
        
        // used for testing inventory
//        inventory[Item.Mushroom.ordinal()].setQuantity(1);
//        inventory[Item.TicTac.ordinal()].setQuantity(10);
        
        return inventory;
    }
    
    private static Scene[] createScene(){
        Scene[] scenes = new Scene[SceneType.values().length];
        
        // Scene 1
        Scene subLabratory = new Scene();
        subLabratory.setDescription("Subway Car Lab");
        subLabratory.setSignSymbol("  SL  ");
        scenes[SceneType.Subway_Car_Lab.ordinal()] = subLabratory;
        
        // Scene 2
        Scene bathroom1 = new Scene();
        bathroom1.setDescription("Bathroom 1");
        subLabratory.setSignSymbol("  B1  ");
        scenes[SceneType.Bathroom1.ordinal()] = bathroom1;
        
        // Scene 3
        Scene ticketBooth = new Scene();
        ticketBooth.setDescription("TicketBooth");
        ticketBooth.setSignSymbol("  TB  ");
        scenes[SceneType.Ticket_Booth.ordinal()] = ticketBooth;
        
        // Scene 4
        Scene trainPlatform = new Scene();
        trainPlatform.setDescription("Train Platform");
        trainPlatform.setSignSymbol("  TP  ");
        scenes[SceneType.Train_Platform.ordinal()] = trainPlatform;
        
        // Scene 5
        Scene stairs = new Scene();
        stairs.setDescription("Stairs");
        stairs.setSignSymbol("  ST  ");
        scenes[SceneType.Stairs.ordinal()] = stairs;
        
        // Scene 6
        Scene cab = new Scene();
        cab.setDescription("Cab");
        cab.setSignSymbol("  CB  ");
        scenes[SceneType.Cab.ordinal()] = cab;
        
        // Scene 7
        Scene gutter = new Scene();
        gutter.setDescription("Gutter");
        gutter.setSignSymbol("  GT  ");
        scenes[SceneType.Gutter.ordinal()] = gutter;
        
        // Scene 8
        Scene lightPost = new Scene();
        lightPost.setDescription("Light Post");
        lightPost.setSignSymbol("  LP  ");
        scenes[SceneType.Light_Post.ordinal()] = lightPost;
        
        // Scene 9
        Scene stopSign = new Scene();
        stopSign.setDescription("Stop Sign");
        stopSign.setSignSymbol("  SS  ");
        scenes[SceneType.Stop_Sign.ordinal()] = stopSign;
        
        // Scene 10
        Scene paperBox = new Scene();
        paperBox.setDescription("Paper Box");
        paperBox.setSignSymbol("  PB  ");
        scenes[SceneType.Subway_Car_Lab.ordinal()] = paperBox;
        
        // Scene 11
        Scene sandwichShop = new Scene();
        sandwichShop.setDescription("Sandwich Shop");
        sandwichShop.setSignSymbol("  SP  ");
        scenes[SceneType.Sandwich_Shop.ordinal()] = sandwichShop;
        
        // Scene 12
        Scene convientStore = new Scene();
        convientStore.setDescription("Convient Store");
        convientStore.setSignSymbol("  CS  ");
        scenes[SceneType.Convient_Store.ordinal()] = convientStore;
        
        // Scene 13
        Scene repairShop = new Scene();
        repairShop.setDescription("Repair Shop");
        repairShop.setSignSymbol("  RS  ");
        scenes[SceneType.Repair_Shop.ordinal()] = repairShop;
        
        // Scene 14
        Scene magazineStore = new Scene();
        magazineStore.setDescription("Magazine Shop");
        magazineStore.setSignSymbol("  MS  ");
        scenes[SceneType.Magazine_Shop.ordinal()] = magazineStore;
        
        // Scene 15
        Scene hotdogCart = new Scene();
        hotdogCart.setDescription("Hotdog Cart");
        hotdogCart.setSignSymbol("  HC  ");
        scenes[SceneType.Hotdog_Cart.ordinal()] = hotdogCart;
        
        // Scene 16
        Scene sunglassHut = new Scene();
        sunglassHut.setDescription("Sunglass Hut");
        sunglassHut.setSignSymbol("  SH  ");
        scenes[SceneType.Sunglass_Hut.ordinal()] = sunglassHut;
        
        // Scene 17
        Scene foodCourt = new Scene();
        foodCourt.setDescription("Food Court");
        foodCourt.setSignSymbol("  FC  ");
        scenes[SceneType.Food_Court.ordinal()] = foodCourt;
        
        // Scene 18
        Scene departmentStore = new Scene();
        departmentStore.setDescription("Department Store");
        departmentStore.setSignSymbol("  DS  ");
        scenes[SceneType.Department_Store.ordinal()] = departmentStore;
        
        // Scene 19
        Scene jewelery = new Scene();
        jewelery.setDescription("Jewelery Store");
        jewelery.setSignSymbol("  JS  ");
        scenes[SceneType.Jewelery_Store.ordinal()] = jewelery;
        
        // Scene 20
        Scene bathroom2 = new Scene();
        bathroom2.setDescription("Bathroom 2");
        bathroom2.setSignSymbol("  B2  ");
        scenes[SceneType.Bathroom2.ordinal()] = bathroom2;
        
        // Scene 21
        Scene cigarStore = new Scene();
        cigarStore.setDescription("Cigar Store");
        cigarStore.setSignSymbol("  CR  ");
        scenes[SceneType.Cigar_Store.ordinal()] = cigarStore;
        
        // Scene 22
        Scene hotel = new Scene();
        hotel.setDescription("Hotel");
        hotel.setSignSymbol("  HT  ");
        scenes[SceneType.Hotel.ordinal()] = hotel;
        
        // Scene 23
        Scene valet = new Scene();
        valet.setDescription("Valet Station");
        valet.setSignSymbol("  VS  ");
        scenes[SceneType.Valet_Station.ordinal()] = valet;
        
        // Scene 24
        Scene restaurant = new Scene();
        restaurant.setDescription("Restaurant");
        restaurant.setSignSymbol("  RT  ");
        scenes[SceneType.Restautrant.ordinal()] = restaurant;
        
        // Scene 25
        Scene concierge = new Scene();
        concierge.setDescription("Concierge");
        concierge.setSignSymbol("  CG  ");
        scenes[SceneType.Concierge.ordinal()] = concierge;
        
        
        return scenes;
    }

    // assigns the scene to a location
    public static void assignScenesToLocations(Map map, Scene[] scenes){
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[SceneType.Subway_Car_Lab.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Bathroom1.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Ticket_Booth.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Train_Platform.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Stairs.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Cab.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Gutter.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Light_Post.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Stop_Sign.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Paper_Box.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Sandwich_Shop.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Convient_Store.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Repair_Shop.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Magazine_Shop.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Hotdog_Cart.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Sunglass_Hut.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Food_Court.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Department_Store.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Jewelery_Store.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Cigar_Store.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Hotel.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Valet_Station.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Restautrant.ordinal()]);
        locations[0][0].setScene(scenes[SceneType.Concierge.ordinal()]);
    }
    
    public static Set<Actor> createInteractions() {
        LinkedHashSet<Actor> interactions = new LinkedHashSet<>();        
        return interactions;
    }
}
