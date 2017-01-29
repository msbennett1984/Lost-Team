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
public class Clue implements Serializable {
    
    // the variable that the description of each clue is stored
    private String description;
    // the variable that tells whether the player has received each clue is stored
    private boolean received;
    // the variable that tells whether the clue being given requires an answer to a math problem or not is stored
    private boolean type;

    // default constructor function
    public Clue() {
    }

    
    // getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isReceived() {
        return received;
    }

    public void setReceived(boolean received) {
        this.received = received;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    
    // hash and equals code
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + (this.received ? 1 : 0);
        hash = 17 * hash + (this.type ? 1 : 0);
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
        final Clue other = (Clue) obj;
        if (this.received != other.received) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    // to string code
    @Override
    public String toString() {
        return "Clue{" + "description=" + description + ", received=" + received + ", type=" + type + '}';
    }
    
    
}
