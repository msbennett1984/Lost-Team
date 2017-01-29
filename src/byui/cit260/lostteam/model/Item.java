/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class Item implements Serializable{
    
    //class instance variables
    private double noItems;
    private String name;
    private double requiredAmount;

    //default constructor
    public Item() {
    }
    
    //getters and setters
    public double getNoItems() {
        return noItems;
    }

    public void setNoItems(double noItems) {
        this.noItems = noItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    
    //hashcode function
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.noItems);
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.requiredAmount) ^ (Double.doubleToLongBits(this.requiredAmount) >>> 32));
        return hash;
    }

    //toString function
    @Override
    public String toString() {
        return "Item{" + "noItems=" + noItems + ", name=" + name + ", requiredAmount=" + requiredAmount + '}';
    }

    
    //equals funciton
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (Double.doubleToLongBits(this.requiredAmount) != Double.doubleToLongBits(other.requiredAmount)) {
            return false;
        }
        if (!Objects.equals(this.noItems, other.noItems)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    
    
    }
    
    
    
    
}
