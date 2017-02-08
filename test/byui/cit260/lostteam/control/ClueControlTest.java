/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sherry Bennett <msbennett84@gmail.com>
 */
public class ClueControlTest {
    
    public ClueControlTest() {
    }

    /**
     * Test of calcVolumeOfFlask method, of class ClueControl.
     */
    @Test
    public void testCalcVolumeOfFlask() {
        System.out.println("calcVolumeOfFlask");
        
        /************************
         * Test case #1
         ************************/
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        double height = 2;
        double radius = 3;
        
        double expResult = 18.85; // expected output returned value
        
        // create instance of ClueControl class
        ClueControl instance = new ClueControl();
        
        // call function to run test
        double result = instance.calcVolumeOfFlask(height, radius);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.01);
        
        /************************
         * Test case #2
         ************************/
        System.out.println("\tTest case #2");
        
        // input values for test case 2
        height = -1;
        radius = 3;
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.calcVolumeOfFlask(height, radius);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 1);
        
        /************************
         * Test case #3
         ************************/
        System.out.println("\tTest case #3");
        
        // input values for test case 3
        height = 2;
        radius = -1;
        
        expResult = -2; // expected output returned value
        
        // call function to run test
        result = instance.calcVolumeOfFlask(height, radius);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 1);
        
        
        /************************
         * Test case #4
         ************************/
        System.out.println("\tTest case #4");
        
        // input values for test case 4
        height = 1;
        radius = 3;
        
        expResult = -3; // expected output returned value
        
        // call function to run test
        result = instance.calcVolumeOfFlask(height, radius);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 1);
        
        
        /************************
         * Test case #5
         ************************/
        System.out.println("\tTest case #5");
        
        // input values for test case 5
        height = 2;
        radius = 4;
        
        expResult = -4; // expected output returned value
        
        // call function to run test
        result = instance.calcVolumeOfFlask(height, radius);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 1);
    }
    
}
