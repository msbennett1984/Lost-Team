/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.lostteam.view;

import byui.cit260.lostteam.model.Navigation;

/**
 *
 * @author Dallin Barlow
 */
public interface ViewInterface {

    public Navigation display();
    public String getInput();
    public Navigation doAction(String value);

}
