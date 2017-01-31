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
 * @author adm-achina
 */
public class GameLost implements Serializable{

    // class instance variable
    private String totalTime;
    private double LastPlayer;
    private Player player;

        
   
    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public double getLastPlayer() {
        return LastPlayer;
    }

    public void setLastPlayer(double LastPlayer) {
        this.LastPlayer = LastPlayer;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.totalTime);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.LastPlayer) ^ (Double.doubleToLongBits(this.LastPlayer) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.player);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GameLost other = (GameLost) obj;
        if (!Objects.equals(this.totalTime, other.totalTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.LastPlayer) != Double.doubleToLongBits(other.LastPlayer)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GameLost{" + "totalTime=" + totalTime + ", LastPlayer=" + LastPlayer + ", player=" + player + '}';
    }
    
    
    
}