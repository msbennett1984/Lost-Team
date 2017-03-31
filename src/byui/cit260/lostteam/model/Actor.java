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
    
    
    Scientist       ("Scientist",        0, 0, "\nThe scientiest is distracted and confused. "
                                                + "\nHe tells you that you have been poisoned"
                                                + "\nand need an antidote. He does not have the antidote, "
                                                + "\nthe Scientist has a list of ingredients:"
                                                + "\n   mushrooms"
                                                + "\n   tic tacs"
                                                + "\n   hot dogs"
                                                + "\n   aspirin"
                                                + "\n   deli meat"
                                                + "\n   bottled water"
                                                + "\n   coconut"
                                                + "\n   nutmilk"
                                                + "\nYou have have 2 hours to search for clues to find "
                                                + "\nthe ingredients along with the quanity of ingredients."
                                                + "\nHe wishes you well."),
    Senator         ("Idaho Senator",    1, 0, "\nThe senator is practicing a speech in the mirror"
                                                + "\nYou speak briefly and he hands you a paper with the words"
                                                + "\n Five Mushrooms"),
    TicketSeller    ("Ticker Seller",    2, 0, "\nThe ticket seller is looking bored"
                                                + "\n and wastes 5 minutes of your time"
                                                + "\nshooting the breeze."),
    StreetMusician  ("Street Musician",  3, 0, "\nThe Street Musician is only interested in tips."
                                                + "\nHe plays beautiful music but is no help."
                                                + "\nYou waste 5 minutes listening to him play."),
    Beggar          ("Beggar",           4, 0, "\nHe is too busy talking to himself to talk with you."
                                                + "\nLoose 5 minutes. "),
    CabDriver       ("Cab Driver",       0, 1, "\nHe yells at you that you need TODO hot dogs."),
    HomelessMan     ("Homeless Man",     1, 1, "\nThe homeless man is mumbling somehing to himself."
                                                + "\nHe is repeating over and over again TODO deli meat."),
    DrugDealer      ("Drug Dealer",      2, 1, "\nThe drug dealer is busy plying his trade. He tells you "
                                                + "\nto try TODO aspirin."),
    Child           ("Child",            3, 1, "The is grateful for your help and tells you that there"
                                                + "\nis nothing in Bathroom 1, Paper Box, Stairs, Cab, "
                                                + "\nRepair Shop and Sunglass Hut that you can use."),
    TeenageBoy      ("Teenage Boy",      4, 1, "\nA teenage boy is leaning against a paper box and talks "
                                                + "\nto you. He tells you he is hungry and wants food. "
                                                + "\nYou tell him you have no money. You realize that "
                                                + "\nhe has taken 5 minutes and still no clue."),
    ShopOwner       ("Shop Owner",       0, 2, "\nCan I have a cup of water please? Then the Shop Owner "
                                                + "\nmakes me wait 5 minutes for the water. The Shop Owner "
                                                + "\ndoes not have a clue."),
    Clerk           ("Clerk",            1, 2, "\nThe How long will it take for me to get to the nearest "
                                                + "\npolice station? The Clerk will let me wait 5 minutes"
                                                + "\nbecause he has no clue."),
    Mechanic        ("Mechanic",         2, 2, "\nThe mechanice was happy that he has fixed the engine, "
                                                + "\nand he was so excited that he wants to show you how "
                                                + "\nhe did it. As you act interested, the mechanic tells "
                                                + "\nyou need 1 coconut. "),
    TeenageGirl     ("Teenage Girl",     3, 2, "\nThe teenage girl stops you to ake which magazine you "
                                                + "\nare interested in. As you stop to make your enquiry, "
                                                + "\nshe left to attend another person. She has no clue and "
                                                + "\nyou waste 5 minutes."),
    HotDogVendor    ("Hot Dog Vendor",   4, 2, "\nYou are not hungry but the vendor was forcing you to buy "
                                                + "\nsomething. You were polite to explain that is not why "
                                                + "\nyou came there. In the course of explaining yourself, "
                                                + "\n5 minutes is already gone."),
    GovernmentAgent ("Government Agent", 0, 3, "\nYou look stranded, the agent walks towards you to assist "
                                                + "\nand also he tells you that you need TODO tic tacs."),
    OldMan          ("Old Man",          1, 3, "\n'To say there is something for everyone in our Food Court "
                                                + "\nwould be an understatement.' said the old man as he "
                                                + "\nsmiles at you. As you smiled back, he tells "
                                                + "\nyou need TODO nutmilk."),
    LostChild       ("Lost Child",       2, 3, "\nThe lost child is so grateful for your help and tells you "
                                                + "\nthat you need to stir the antidote TODO times."),
    YoungCouple     ("Young Couple",     3, 3, "\nLooking at a display case of engagement rings, the young "
                                                + "\ncouple eagerly talks with you about their future plans. "
                                                + "\nThey also tell you that you need TODO amount of nutmilk. "),
    Congressman     ("Congressman",      4, 3, "\nThe congressman is practicing his next speech in front "
                                                + "\nof the mirror. Now he has you as his audience. He has "
                                                + "\nno clue for you and wastes 5 minutes of your time."),
    DonaldTrump     ("Donald Trump",     0, 4, "\nYou are surprised to meet the President of the United States. "
                                                + "\nHe is purchaing some of his favorite Cuban cigars. "
                                                + "\nHe use 5 minutes of your time educating you on the "
                                                + "\ndifference between the different cigars in the store. "
                                                + "\nWhere did the time go?"),
    Bellhop         ("Bellhop",          1, 4, "\nThe bellhop has his hand held towards you as if "
                                                + "\nexpecting a tip of some kind. He tells you how his "
                                                + "\nincome is based on the number of cars he parks and "
                                                + "\nhow the amount of the tips he receives affects his "
                                                + "\nincome also. He wastes 5 minutes of your time."),
    RacecarDriver   ("Racecar Driver",   2, 4, "\nA race car greets you and tells you that you need "
                                                + "\nTODO amount of bottle water. TODO: racecar driver clue"),
    Waitress        ("Waitress",         3, 4, "\nThe waitress gladly seats you at a table. She tels "
                                                + "\nyou how slow business has been recently and she is "
                                                + "\nconcerned about her job. As she talks you realize "
                                                + "\nthat she does not have a clue and "
                                                + "\nyou have lost 5 minutes."),
    PoliceOfficer   ("Police Officer",   4, 4, "\nThe police officer is grateful for your help. He tells "
                                                + "\nyou to avoid talking to people in the Restaurant, "
                                                + "\nHotel, Cigar Store, Bathroom 2, Hot Dog Cart, "
                                                + "\nand Magazine Store.");
    
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
