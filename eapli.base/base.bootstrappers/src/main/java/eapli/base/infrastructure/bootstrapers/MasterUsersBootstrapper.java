/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.infrastructure.bootstrapers;

import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.actions.Action;
import eapli.framework.infrastructure.authz.domain.model.Role;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Paulo Gandra Sousa
 */

//nao usar esta class
public class MasterUsersBootstrapper extends UsersBootstrapperBase implements Action {

    @Override
    public boolean execute() {
        registerAdmin("admin", TestDataConstants.PASSWORD1, "Jane", "Doe Admin",
                "jane.doe@email.local");
        /*registerAdmin("andreFe", TestDataConstants.PASSANDRE, "Andre", "Ferreira",
                "andre.rangel.ferreira.123@gmail.com");*/
        return true;
    }

    /**
     *
     */
    private void registerAdmin(final String username, final String password, final String firstName,
            final String lastName, final String email) {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);

        registerUser(username, password, firstName, lastName, email, roles);
    }
}
