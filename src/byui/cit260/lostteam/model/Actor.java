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
public class Actor implements Serializable{
    
    //class instance variables
    private String name;
    private String cooridinates;
    private Boolean spokenTo;
    private String clueGiven;
    
    //default contructor function
    public Actor() {
    }
    
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCooridinates() {
        return cooridinates;
    }

    public void setCooridinates(String cooridinates) {
        this.cooridinates = cooridinates;
    }

    public Boolean getSpokenTo() {
        return spokenTo;
    }

    public void setSpokenTo(Boolean spokenTo) {
        this.spokenTo = spokenTo;
    }

    public String getClueGiven() {
        return clueGiven;
    }

    public void setClueGiven(String clueGiven) {
        this.clueGiven = clueGiven;
    }

    //hashCode functions
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + Objects.hashCode(this.cooridinates);
        hash = 11 * hash + Objects.hashCode(this.spokenTo);
        hash = 11 * hash + Objects.hashCode(this.clueGiven);
        return hash;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", cooridinates=" + cooridinates + ", spokenTo=" + spokenTo + ", clueGiven=" + clueGiven + '}';
    }

    
    
    //equals functions
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
        final Actor other = (Actor) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.cooridinates, other.cooridinates)) {
            return false;
        }
        if (!Objects.equals(this.clueGiven, other.clueGiven)) {
            return false;
        }
        if (!Objects.equals(this.spokenTo, other.spokenTo)) {
            return false;
        }
        return true;
    }
    
    
    
}
