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
public class Scene implements Serializable {
    
    
    //class instance variables
    private String description;
    private String signSymbol;
    private String name;

   
     // constructor function
    public Scene() {
    }

    
    
    // getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSignSymbol() {
        return signSymbol;
    }

    public void setSignSymbol(String signSymbol) {
        this.signSymbol = signSymbol;
    }
    
    
    //hasCode Func.

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + Objects.hashCode(this.signSymbol);
        return hash;
    }

        
    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", signSymbol=" + signSymbol + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.signSymbol, other.signSymbol)) {
            return false;
        }
        return true;
    }

        
    
    
    
}
