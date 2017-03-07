/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.model;

import java.io.Serializable;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public enum Actor implements Serializable {
    
    Scientist       ("Scientist",        1, 1, "TODO: An ingredient list, a list of ingredients without the quantity"),
    Senator         ("Idaho Senator",    2, 1, "TODO: senator clue"),
    TicketSeller    ("Ticker Seller",    3, 1, "TODO: ticket clue"),
    StreetMusician  ("Street Musician",  4, 1, "TODO: street musician clue"),
    Beggar          ("Beggar",           5, 1, "TODO: beggar clue"),
    CabDriver       ("Cab Driver",       1, 2, "TODO: cab driver clue"),
    HomelessMan     ("Homeless Man",     2, 2, "TODO: homeless man clue"),
    DrugDealer      ("Drug Dealer",      3, 2, "TODO: drug dealer clue"),
    Child           ("Child",            4, 2, "TODO: child clue"),
    TeenageBoy      ("Teenage Boy",      5, 2, "TODO: teenage boy clue"),
    ShopOwner       ("Shop Owner",       1, 3, "TODO: shop owner clue"),
    Clerk           ("Clerk",            2, 3, "TODO: clerk clue"),
    Mechanic        ("Mechanic",         3, 3, "TODO: mechanic clue"),
    TeenageGirl     ("Teenage Girl",     4, 3, "TODO: teenage girl clue"),
    HotDogVendor    ("Hot Dog Vendor",   5, 3, "TODO: hot dog vendor clue"),
    GovernmentAgent ("Government Agent", 1, 4, "TODO: government agent clue"),
    OldMan          ("Old Man",          2, 4, "TODO: old man clue"),
    LostChild       ("Lost Child",       3, 4, "TODO: lost child clue"),
    YoungCouple     ("Young Couple",     4, 4, "TODO: young couple clue"),
    Congressman     ("Congressman",      5, 4, "TODO: congressman clue"),
    DonaldTrump     ("Donald Trump",     1, 5, "TODO: donald trump clue"),
    Bellhop         ("Bellhop",          2, 5, "TODO: bellhop clue"),
    RacecarDriver   ("Racecar Driver",   3, 5, "TODO: racecar driver clue"),
    Waitress        ("Waitress",         4, 5, "TODO: witress clue"),
    PoliceOfficer   ("Police Officer",   5, 5, "TODO: police officer clue");
    
    //class instance variables
    private final String description;
    private final Point coordinates;
    private final String clueGiven;
    
    //default contructor function
    //modify constructor function to be an overloaded constructor
    //Point (1,1) is the starting point on the map 
    Actor(String description, int x, int y, String clueGiven) {
        this.description = description;
        this.coordinates = new Point(x, y);
        this.clueGiven = clueGiven;
    }
    
    // getters
    public Point getCoordinates() {
        return coordinates;
    }

    public String getDescription() {
        return description;
    }

    public String getClueGiven() {
        return clueGiven;
    }

    @Override
    public String toString() {
        return "Actor{" + "description=" + description + ", coordinates=" + coordinates + ", clueGiven=" + clueGiven + '}';
    }
}
