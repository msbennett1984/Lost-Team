/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.model;

import byui.cit260.lostteam.view.CalcVolumeOfFlaskQuestionView;
import byui.cit260.lostteam.view.ClueView;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adm-achina
 */
public class Scene implements Serializable {
    
    //class instance variables
    private String description;
    private String signSymbol;
    private int coordinates;
    private Actor actor;
    private Clue clue;
    //private String name;

   
     // constructor function
    Scene(String description, String signSymbol, int coordinates) {
        this.description = description;
        this.signSymbol = signSymbol;
        this.coordinates = coordinates;
    }

    public String getDescription() {
        return description;
    }

    public String getSignSymbol() {
        return signSymbol;
    }

    public int getCoordinates() {
        return coordinates;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSignSymbol(String signSymbol) {
        this.signSymbol = signSymbol;
    }

    public void setCoordinates(int coordinates) {
        this.coordinates = coordinates;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Clue getClue() {
        return clue;
    }

    public void setClue(Clue clue) {
        this.clue = clue;
    }
    
    public Navigation displayClueView() {
        if (clue == Clue.CalcVolumeOfFlask) {
            ClueView clueView = new CalcVolumeOfFlaskQuestionView(this.actor);
            return clueView.display();
        }
        return Navigation.Continue;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    public Scene() {
        
    }

    
}
