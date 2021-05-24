package eapli.base.infrastructure.bootstrapers;

import eapli.base.clientusermanagement.application.AcceptRefuseSignupFactory;
import eapli.base.clientusermanagement.application.AcceptRefuseSignupRequestController;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.clientusermanagement.domain.SignupRequest;
import eapli.base.colaboratormanagement.application.RegisterColaboratorController;
import eapli.base.colaboratormanagement.domain.Address;
import eapli.base.colaboratormanagement.domain.BirthDate;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.domain.Contact;
import eapli.base.colaboratormanagement.domain.Evaluation;
import eapli.base.colaboratormanagement.domain.Name;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.myclientuser.application.SignupController;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.infrastructure.authz.domain.model.Role;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.SystemUserBuilder;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

public class ColaboratorBootstrapper implements Action {
    private static final Logger LOGGER = LoggerFactory.getLogger(
            ColaboratorBootstrapper.class);

    private final SignupController signupController = new SignupController();
    private final AcceptRefuseSignupRequestController acceptController = AcceptRefuseSignupFactory
            .build();
    private final RegisterColaboratorController registerColaboratorController = new RegisterColaboratorController();

    UserRepository userRepository = PersistenceContext.repositories().users();
    
    @Override
    public boolean execute() {
        signupAndApproveUser(TestDataConstants.USER_TEST1, "Password1", "John", "Smith",
                "john@smith.com", TestDataConstants.USER_TEST1);
        
        signupAndApproveUser("isep959", "Password1", "Mary", "Smith", "mary@smith.com", "isep959");
        registerColaborator("isep959","Mary");
        
        signupAndApproveUser("isep960", "Password1", "Lamb", "Smith", "lamb@smith.com", "isep960");        
        registerColaborator("isep960","Lamb");
        
        signupAndApproveUser("isep961", "Password1", "Johnny", "Smith", "johnny@smith.com", "isep961");
        registerColaborator("isep961","Jhonny");
        
        signupAndApproveUser("isep962", "Password1", "Cash", "Smith", "cash@smith.com", "isep962");
        registerColaborator("isep962","Cash");
        
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

    public Colaborator registerColaborator(String number, String name){ 
        
        try {
            Thread.sleep(1000);   //se nao tiver um delay o systemuser nao é encontrado
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(ColaboratorBootstrapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        SystemUser systemUser = userRepository.ofIdentity(Username.valueOf(number)).get();
        
        Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.COLABORATOR);
        
        return registerColaboratorController.registerColaborator(
                systemUser, new MecanographicNumber(number), new Name(name),
                new Address("Rua","Cidade"),
                new BirthDate(new Date(105,12,12)), new Evaluation(5), new Contact(123456789),
                roles);
    }
}
