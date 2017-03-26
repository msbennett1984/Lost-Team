/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.control;

import byui.cit260.lostteam.exception.ClueControlException;
import byui.cit260.lostteam.exception.NonPositiveHeightException;
import byui.cit260.lostteam.exception.NonPositiveRadiusException;
import byui.cit260.lostteam.exception.VolumeHighException;
import byui.cit260.lostteam.exception.VolumeLowException;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class ClueControl {
    
    public static double calcVolumeOfCylinder(double height, double radius) throws ClueControlException {
        if (height <= 0) {
            throw new NonPositiveHeightException(); // height is negative
        } else if (radius <= 0) {
            throw new NonPositiveRadiusException(); // radius is negative
        }
        
        double volume = (height * Math.PI * Math.pow(radius, 2));
        
        if (volume < 50) {
            throw new VolumeLowException(); // volume is too low
        } else if (volume > 125) {
            throw new VolumeHighException(); // volume is too high
        } else {
            return volume;
        }
    }
    
    public static double calcVolumeOfFlask(double height, double radius) throws ClueControlException {
        if (height <= 0) {
            throw new NonPositiveHeightException(); // height is negative
        } else if (radius <= 0) {
            throw new NonPositiveRadiusException(); // radius is negative
        }
        
        double volume = (height / 3.0 * Math.PI * Math.pow(radius, 2));
        
        if (volume < 15) {
            throw new VolumeLowException(); // volume is too low
        } else if (volume > 25) {
            throw new VolumeHighException(); // volume is too high
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
