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
public enum Item implements Serializable {
    
    Mushroom("Mushroom", "Mushrooms", 1),
    Coconut("Coconut", "Coconuts", 1),
    TicTac("Tic-Tac", "Tic-Tacs", 5),
    HotDog("Hot Dog", "Hot Dogs", 2),
    Aspirin("Aspirin", "Aspirin", 10),
    DeliMeat("Deli Meat", "Deli Meat", 2),
    BottledWater("Bottled Water", "Bottles of Water", 2),
    Nutmilk("Nutmilk", "Nutmilk", 2);
    
    // class instance variables
    private final String singularName;
    private final String pluralName;
    private final int requiredAmount;
    
    Item(String singularName, String pluralName, int requiredAmount) {
        this.singularName = singularName;
        this.pluralName = pluralName;
        if (requiredAmount < 0) {
            requiredAmount = 0;
        }
        this.requiredAmount = requiredAmount;
    }
    
    public String getName(int quantity) {
        if (quantity == 1) {
            return singularName;
        } else {
            return pluralName;
        }
    }

    public String getSingularName() {
        return singularName;
    }
    
    public String getPluralName() {
        return pluralName;
    }
    
    public int getRequiredAmount() {
        return requiredAmount;
    }

    @Override
    public String toString() {
        return "Item{" + "singularName=" + singularName + ", pluralName=" + pluralName + ", requiredAmount=" + requiredAmount + '}';
    }
}
