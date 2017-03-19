/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.exception;

/**
 *
 * @author Dallin Barlow
 */
public class ClueControlException extends Exception {

    public ClueControlException() {
    }

    public ClueControlException(String string) {
        super(string);
    }

    public ClueControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public ClueControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public ClueControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
    
}
