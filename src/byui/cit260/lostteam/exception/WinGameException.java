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
public class WinGameException extends Exception {

    public WinGameException() {
    }

    public WinGameException(String string) {
        super(string);
    }

    public WinGameException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public WinGameException(Throwable thrwbl) {
        super(thrwbl);
    }

    public WinGameException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
