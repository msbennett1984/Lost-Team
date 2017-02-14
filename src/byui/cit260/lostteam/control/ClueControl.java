/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.control;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class ClueControl {
    
    public double calcVolumeOfCylinder(double height, double radius) {
        if (height <= 0) {
            return -1; // height is negative
        } else if (radius <= 0) {
            return -2; // radius is negative
        }
        
        double volume = (height * Math.PI * Math.pow(radius, 2));
        
        if (volume < 50) {
            return -3; // volume is too low
        } else if (volume > 125) {
            return -4; // volume is too high
        } else {
            return volume;
        }
    }
    
    public double calcVolumeOfFlask(double height, double radius) {
        if (height <= 0) {
            return -1; // height is negative
        } else if (radius <= 0) {
            return -2; // radius is negative
        }
        
        double volume = (height / 3.0 * Math.PI * Math.pow(radius, 2));
        
        if (volume < 15) {
            return -3; // volume is too low
        } else if (volume > 25) {
            return -4; // volume is too high
        } else {
            return volume;
        }
    }
    
    
    // Calculate Trajectory Distance of a bullet function (Dallin Barlow)
    public double calcTrajectoryDistance(double velocity, double gravity) {
        
        // if user inputs a zero or a negative number in for velocity
        if (velocity <= 0){
            return -1;
        }
        // if user inputs a zero or a negative number in for gravity
        else if (gravity <= 0){
            return -2;
        }
       
        // the distance is calculated based on user's input for velocity and gravity
        double distance = Math.round(Math.pow(velocity, 2) / gravity) ;       
        
        // if the calculated distance is too small
        if (distance < 1){
            return -3;
        }
        // if the calculated distance is too large
        else if (distance > 300){
            return -4;
        }
        // if the distance is in the allowed range
        else {
            return distance;
        }
    }
}
