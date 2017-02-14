/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.control;

import java.util.ArrayList;
import java.util.List;
import byui.cit260.lostteam.model.Location;
import byui.cit260.lostteam.model.Player;
import byui.cit260.lostteam.model.Item;

/**
 *
 * @author adm-achina
 */
public class ItemControl {
    
int pocket;
    private Item prerequisite;
    private Location[][] location; 

    public int addToItem(int total, int amount) {

        if (total < 0 || total >= 101 || amount < 0 || amount >= 101) {
            return -1;
        }
        
        if ((total + amount) >= 101){
            return -1;
        }
        
        int newTotal = total + amount;
        
        return newTotal;
        
    }
    
    public int removeFromItem(int item, int amount) {

        if (item < 0 || item > 101 || amount < 0 || amount > 101) {
            return -1;
        }
        
        if (amount > item){
            return -1;
        }
        
        int total = item - amount;

        return total;
        
    }
    
    public int storeItem(int item, int amount, int cost, int pocket) {

        if (item < 0 || item > 101 || amount < 0 || amount > 101 || cost < 0 || cost > 50001 || pocket <= 0 || pocket > 1000001) {
            return -1;
        }
        
        cost = amount * cost;
        pocket = pocket - cost;

        return pocket;
        
    }
    
    public int sellItem(int item, int amount, int cost, int pocket) {

        if (item < 0 || item > 101 || amount < 0 || amount > 101 || cost < 0 || cost > 50001 || pocket <= 0 || pocket > 1000001) {
            return -1;
        }
        
        cost = (amount * cost) / 2;
        pocket = pocket + cost;
        
        if (pocket > 1000000){
            return -1;
        }

        return pocket;
    }
}
   