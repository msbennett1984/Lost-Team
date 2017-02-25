/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class Inventory implements Serializable {
    private ArrayList<InventoryItem> items;
    
    public Inventory() {
        this.items = new ArrayList<>();
    }
    
    public ArrayList<InventoryItem> getItems() {
        return items;
    }
    
    public void setItems(ArrayList<InventoryItem> items) {
        this.items = items;
    }
    
    public boolean isEmpty() {
        return items.isEmpty();
    }
    
    public void addItem(InventoryItem item) {
        items.add(item);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.items);
        return hash;
    }

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
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "items=" + items + '}';
    }

}
