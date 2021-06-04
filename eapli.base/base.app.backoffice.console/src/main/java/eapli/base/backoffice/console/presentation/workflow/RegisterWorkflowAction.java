/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.backoffice.console.presentation.workflow;

import eapli.framework.actions.Action;

/**
 *
 * @author andre
 */
public class RegisterWorkflowAction implements Action {
    
    @Override
    public boolean execute() {
        return new RegisterWorkflowUI().show();
    }
    
}
