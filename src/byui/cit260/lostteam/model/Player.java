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
public class Player implements Serializable {
    // instance variables
    private final String name;
    private long bestTime;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getBestTime() {
        return bestTime;
    }

    public void setBestTime(long bestTime) {
        if (bestTime < this.bestTime) {
            this.bestTime = bestTime;
        }
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bestTime=" + bestTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + (int) (this.bestTime ^ (this.bestTime >>> 32));
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
        final Player other = (Player) obj;
        if (this.bestTime != other.bestTime) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

}
