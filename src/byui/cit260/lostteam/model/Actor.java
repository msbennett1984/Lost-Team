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
    
    
    Scientist       ("Scientist",        0, 0,"\nThe scientiest is distracted and confused. "
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
                                                + "\nHe wishes you well.",
                                                Item.Nothing.getName(0),Item.Mushroom.getRequiredAmount()),
    Senator         ("Idaho Senator",    1, 0,"\nThe senator is practicing a speech in the mirror"
                                                + "\nYou speak briefly and he hands you a paper with the words"
                                                + "\n 5 Mushrooms",
                                                Item.Mushroom.getName(0),Item.Mushroom.getRequiredAmount()),
    TicketSeller    ("Ticker Seller",    2, 0,"\nThe ticket seller is looking bored"
                                                + "\nand wastes 5 minutes of your time"
                                               	+ "\nshooting the breeze.",
                                                Item.Nothing.getName(0),Item.Nothing.getRequiredAmount()),
    StreetMusician  ("Street Musician",  3, 0,"\nThe Street Musician is only interested in tips."
                                                + "\nHe plays beautiful music but is no help."
                                                + "\nYou waste 5 minutes listening to him play.",
                                                Item.Nothing.getName(0),Item.Nothing.getRequiredAmount()),
    Beggar          ("Beggar",           4, 0,"\nHe is too busy talking to himself to talk with you."
                                                + "\nLose 5 minutes. ",
                                                Item.Nothing.getName(0),Item.Nothing.getRequiredAmount()),
    CabDriver       ("Cab Driver",       0, 1, "\nHe yells at you that you need 2 hot dogs.",
                                                Item.HotDog.getName(0),Item.HotDog.getRequiredAmount()),
    HomelessMan     ("Homeless Man",     1, 1,"\nThe homeless man is mumbling somehing to himself."
                                                + "\nHe is repeating over and over again you only need "
                                                + "2 deli meats.",
                                                Item.DeliMeat.getName(1),Item.DeliMeat.getRequiredAmount()),
    DrugDealer      ("Drug Dealer",      2, 1,"\nThe drug dealer is busy plying his trade. He tells you "
                                                + "\nto try using 10 aspirin.",
                                                Item.Aspirin.getName(0),Item.Aspirin.getRequiredAmount()),
    Child           ("Child",            3, 1,"\nThe is grateful for your help and tells you that there"
                                                + "\nis nothing in Bathroom 1, Paper Box, Stairs, Cab, "
                                                + "\nRepair Shop and Sunglass Hut that you can use.",
                                                Item.Nothing.getName(0),Item.Nothing.getRequiredAmount()),
    TeenageBoy      ("Teenage Boy",      4, 1,"\nA teenage boy is leaning against a paper box and talks "
                                                + "\nto you. He tells you he is hungry and wants food. "
                                                + "\nYou tell him you have no money. You realize that "
                                                + "\nhe has taken 5 minutes and still no clue.",
                                                Item.Nothing.getName(0),Item.Nothing.getRequiredAmount()),
    ShopOwner       ("Shop Owner",       0, 2,"\nCan I have a cup of water please? Then the Shop Owner "
                                                + "\nmakes me wait 5 minutes for the water. The Shop Owner "
                                                + "\ndoes not have a clue.",
                                                Item.Nothing.getName(0),Item.Nothing.getRequiredAmount()),
    Clerk           ("Clerk",            1, 2,"\nThe How long will it take for me to get to the nearest "
                                                + "\npolice station? The Clerk will let me wait 5 minutes"
                                                + "\n because he has no clue.",
                                                Item.Nothing.getName(0),Item.Nothing.getRequiredAmount()),
    Mechanic        ("Mechanic",         2, 2,"\nThe mechanice was happy that he has fixed the engine, "
                                                + "\nand he was so excited that he wants to show you how "
                                                + "\nhe did it. As you act interested, the mechanic tells "
                                                + "\nyou need 1 coconut. ",
                                                Item.Coconut.getName(0),Item.Coconut.getRequiredAmount()),
    TeenageGirl     ("Teenage Girl",     3, 2, "\nThe teenage girl stops you to ake which magazine you "
                                                + "\nare interested in. As you stop to make your enquiry, "
                                                + "\nshe left to attend another person. She has no clue and "
                                                + "\nyou waste 5 minutes.",
                                                Item.Nothing.getName(0),Item.Nothing.getRequiredAmount()),
    HotDogVendor    ("Hot Dog Vendor",   4, 2,"\nYou are not hungry but the vendor was forcing you to buy "
                                                + "\nsomething. You were polite to explain that is not why "
                                                + "\nyou came there. In the course of explaining yourself, "
                                                + "\n5 minutes is already gone.",
                                                Item.Nothing.getName(0),Item.Nothing.getRequiredAmount()),
    GovernmentAgent ("Government Agent", 0, 3,"\nYou look stranded, the agent walks towards you to assist "
                                                + "\nand also he tells you that you need 5 tic tacs.",
                                                Item.TicTac.getName(0),Item.TicTac.getRequiredAmount()),
    OldMan          ("Old Man",          1, 3,"\n'To say there is something for everyone in our Food Court "
                                                + "\nwould be an understatement.' said the old man as he "
                                                + "\nsmiles at you. As you smiled back, he tells "
                                                + "\nyou need TODO nutmilk.",Item.Mushroom.getName(0),Item.Mushroom.getRequiredAmount()),
    LostChild       ("Lost Child",       2, 3,"\nThe lost child is so grateful for your help and tells you ",
                                                Item.Nothing.getName(0),Item.Nothing.getRequiredAmount()),
    YoungCouple     ("Young Couple",     3, 3,"\nA young couple tell you all about their wedding plans"
                                                + "\n and how much they are in love. They end up making"
                                                + "\n you sick and wasting 5 mins of your time.",
                                                Item.Nothing.getName(0),Item.Nothing.getRequiredAmount()),
    Congressman     ("Congressman",      4, 3,"\nA Congress man ignores your greeting and practices his"
                                                + "\n speech in the mirror, you try several more times to "
                                                + "\n no avail, you lose 5 mins.",
                                                Item.Nothing.getName(0),Item.Nothing.getRequiredAmount()),
    DonaldTrump     ("Donald Trump",     0, 4,"\nDonald Trump walks by ignoring your question, costs"
                                                + "\n you 5 mins.",
                                                Item.Nothing.getName(0),Item.Nothing.getRequiredAmount()),
    Bellhop         ("Bellhop",          1, 4,"\nBellhop is getting peoples luggage, and he is too"
                                                + "\n busy to hear your question, you waste 5 mins "
                                                + "\n asking him.",
                                                Item.Nothing.getName(0),Item.Nothing.getRequiredAmount()),
    RacecarDriver   ("Racecar Driver",   2, 4,"\nA racecar driver is in the pits and when you ask for "
                                                + "\n help he tells you he has information about the potion."
                                                + "\n He tells you youll need 2  bottles of water.",
                                                Item.BottledWater.getName(0),Item.BottledWater.getRequiredAmount()),
    Waitress        ("Waitress",         3, 4,"\nA waitress is just getting off her shift and is eager"
                                                + "\n to get home to her little boy. She tells you she"
                                                + "\n doesn't have time to talk, costs you 5 mins.",
                                                Item.Nothing.getName(0),Item.Nothing.getRequiredAmount()),
    PoliceOfficer   ("Police Officer",   4, 4,"\nHe tells you he is busy, doesn't have any information.",
                                                Item.Nothing.getName(0),Item.Nothing.getRequiredAmount());
    
    //class instance variables
    private final String description;
    private final Point coordinates;
    private final String conversation;
    //private final Item item;
    //private final String brief;
    private final String itemName;
    private final int clueGiven;
    
    //default contructor function
    //modify constructor function to be an overloaded constructor
    //Point (1,1) is the starting point on the map 
    Actor(String description, int x, int y, String conversation, String itemName, int clueGiven) {
        this.description = description;
        this.coordinates = new Point(x, y);
        this.conversation = conversation;
        this.itemName = itemName;
        this.clueGiven = clueGiven;
    }
    
    // getters
    public Point getCoordinates() {
        return coordinates;
    }

    public String getDescription() {
        return description;
    }

    public String getConversation() {
        return conversation;
    }

    public String getItemName() {
        return itemName;
    }

    public int getClueGiven() {
        /*if (item == Item.Nothing) {
            return brief;
        }
        item.getName(0)*/
        return clueGiven;
    }

    @Override
    public String toString() {
        return "Actor{" + "description=" + description + ", coordinates=" + coordinates + ", clueGiven=" + clueGiven + '}';
    }

}
