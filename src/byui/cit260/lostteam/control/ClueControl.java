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
}
