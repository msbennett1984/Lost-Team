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
 * @author Dallin Barlow
 */
public class ActorType implements Serializable {

    private final Actor actor;
    
    
    public ActorType(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }
    
    public String getDescription() {
        return actor.getDescription();
    }
    public int getClueGiven() {
        return actor.getClueGiven();
    }

    public String getItemName() {
        return actor.getItemName();
    }
    
    public String getConversation() {
        return actor.getConversation();
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.actor);
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
        final ActorType other = (ActorType) obj;
        if (this.actor != other.actor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ActorType{" + "actor=" + actor + '}';
    }
   
    
}
