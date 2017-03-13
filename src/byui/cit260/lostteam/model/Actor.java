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
    
    Scientist       ("Scientist",        0, 0, "TODO: An ingredient list, a list of ingredients without the quantity"),
    Senator         ("Idaho Senator",    1, 0, "TODO: senator clue"),
    TicketSeller    ("Ticker Seller",    2, 0, "TODO: ticket clue"),
    StreetMusician  ("Street Musician",  3, 0, "TODO: street musician clue"),
    Beggar          ("Beggar",           4, 0, "TODO: beggar clue"),
    CabDriver       ("Cab Driver",       0, 1, "TODO: cab driver clue"),
    HomelessMan     ("Homeless Man",     1, 1, "TODO: homeless man clue"),
    DrugDealer      ("Drug Dealer",      2, 1, "TODO: drug dealer clue"),
    Child           ("Child",            3, 1, "TODO: child clue"),
    TeenageBoy      ("Teenage Boy",      4, 1, "TODO: teenage boy clue"),
    ShopOwner       ("Shop Owner",       0, 2, "TODO: shop owner clue"),
    Clerk           ("Clerk",            1, 2, "TODO: clerk clue"),
    Mechanic        ("Mechanic",         2, 2, "TODO: mechanic clue"),
    TeenageGirl     ("Teenage Girl",     3, 2, "TODO: teenage girl clue"),
    HotDogVendor    ("Hot Dog Vendor",   4, 2, "TODO: hot dog vendor clue"),
    GovernmentAgent ("Government Agent", 0, 3, "TODO: government agent clue"),
    OldMan          ("Old Man",          1, 3, "TODO: old man clue"),
    LostChild       ("Lost Child",       2, 3, "TODO: lost child clue"),
    YoungCouple     ("Young Couple",     3, 3, "TODO: young couple clue"),
    Congressman     ("Congressman",      4, 3, "TODO: congressman clue"),
    DonaldTrump     ("Donald Trump",     0, 4, "TODO: donald trump clue"),
    Bellhop         ("Bellhop",          1, 4, "TODO: bellhop clue"),
    RacecarDriver   ("Racecar Driver",   2, 4, "TODO: racecar driver clue"),
    Waitress        ("Waitress",         3, 4, "TODO: witress clue"),
    PoliceOfficer   ("Police Officer",   4, 4, "TODO: police officer clue");
    
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
