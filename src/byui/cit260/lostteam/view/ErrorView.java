/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import java.io.PrintWriter;
import lostteam.LostTeam;

/**
 *
 * @author adm-achina
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = LostTeam.getOutFile();
    private static final PrintWriter logFile = LostTeam.getLogFile();
    
    /**
     *
     * @param className
     * @param errorMessage
     */
    public static void display(String className, String errorMessage){
        errorFile.println(
                    "---------------------------------"
                  + "\n- ERROR -" + errorMessage
                  + "\n-------------------------------");
        logFile.println(className + " - " +errorMessage);
    
}
    
}
