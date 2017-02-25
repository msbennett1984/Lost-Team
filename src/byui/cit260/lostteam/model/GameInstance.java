/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.model;
import java.io.Serializable;
import java.util.Objects;

/**
 * A game instance object.
 * 
 * @author adm-achina
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class GameInstance implements Serializable{

    // instance variables
    private Player player;
    private Inventory inventory;
    private long remainingTime;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public Inventory getInventory() {
        return inventory;
    }
    
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
    public long getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(long remainingTime) {
        if (remainingTime < 0) {
            remainingTime = 0;
        }
        this.remainingTime = remainingTime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.player);
        hash = 29 * hash + Objects.hashCode(this.inventory);
        hash = 29 * hash + (int) (this.remainingTime ^ (this.remainingTime >>> 32));
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
        final GameInstance other = (GameInstance) obj;
        if (this.remainingTime != other.remainingTime) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GameInstance{" + "player=" + player + ", inventory=" + inventory + ", remainingTime=" + remainingTime + '}';
    }

}