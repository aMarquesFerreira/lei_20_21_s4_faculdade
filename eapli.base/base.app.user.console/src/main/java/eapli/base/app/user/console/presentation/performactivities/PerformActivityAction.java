/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.user.console.presentation.performactivities;

import eapli.base.app.user.console.presentation.myservices.RequestServiceUI;
import eapli.framework.actions.Action;

/**
 *
 * @author andre
 */
public class PerformActivityAction implements Action {
    
    @Override
    public boolean execute() {
        return new PerformActivityUI().show();
    }
    
}
