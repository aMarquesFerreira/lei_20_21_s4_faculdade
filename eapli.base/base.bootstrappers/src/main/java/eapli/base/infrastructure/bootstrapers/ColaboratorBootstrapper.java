package eapli.base.infrastructure.bootstrapers;

import eapli.base.clientusermanagement.application.AcceptRefuseSignupFactory;
import eapli.base.clientusermanagement.application.AcceptRefuseSignupRequestController;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.clientusermanagement.domain.SignupRequest;
import eapli.base.colaboratormanagement.application.RegisterColaboratorController;
import eapli.base.colaboratormanagement.domain.Address;
import eapli.base.colaboratormanagement.domain.BirthDate;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.domain.Name;
import eapli.base.myclientuser.application.SignupController;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class ColaboratorBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            ColaboratorBootstrapper.class);

    private final SignupController signupController = new SignupController();
    private final AcceptRefuseSignupRequestController acceptController = AcceptRefuseSignupFactory
            .build();
    private final RegisterColaboratorController registerColaboratorController = new RegisterColaboratorController();

    @Override
    public boolean execute() {
        signupAndApproveUser(TestDataConstants.USER_TEST1, "Password1", "John", "Smith",
                "john@smith.com", TestDataConstants.USER_TEST1);
        signupAndApproveUser("isep959", "Password1", "Mary", "Smith", "mary@smith.com", "isep959");
        return true;
    }

    private SignupRequest signupAndApproveUser(final String username, final String password,
                                           final String firstName, final String lastName, final String email,
                                           final String mecanographicNumber) {
        SignupRequest request = null;
        try {
            request = signupController.signup(username, password, firstName, lastName, email,
                    mecanographicNumber);
            acceptController.acceptSignupRequest(request);
        } catch (final ConcurrencyException | IntegrityViolationException e) {
            // ignoring exception. assuming it is just a primary key violation
            // due to the tentative of inserting a duplicated user
            LOGGER.warn("Assuming {} already exists (activate trace log for details)", username);
            LOGGER.trace("Assuming existing record", e);
        }
        return request;
    }

    /*private Colaborator registerColaborator(){
        SystemUser systemUser = new SystemUser("isep959", "Password1", "Mary Smith", "mary@smith.com", "isep959");
        registerColaboratorController.registerColaborator(systemUser, new MecanographicNumber("isep959"), new Name("Mary Smith"),
                new Address("Rua","Cidade"),
                new BirthDate(new Date(2005,12,12)),);

        return;
    }*/
}
