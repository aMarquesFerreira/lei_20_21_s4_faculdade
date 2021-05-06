package eapli.base.app.backoffice.console.presentation.colaborator;

import eapli.framework.actions.Action;

/**
 * Menu action for adding a new user to the application. Created by nuno on
 * 22/03/16.
 */
public class RegisterColaboratorAction implements Action {

    @Override
    public boolean execute() {
        return new RegisterColaboratorUI().show();
    }
}
