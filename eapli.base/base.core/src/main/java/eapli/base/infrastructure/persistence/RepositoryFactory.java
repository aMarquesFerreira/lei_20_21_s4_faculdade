/**
 *
 */
package eapli.base.infrastructure.persistence;

import eapli.base.activitymanagement.repositories.ActivityExecutionRepository;
import eapli.base.activitymanagement.repositories.ActivityRepository;
import eapli.base.catalogue.repositories.CatalogueRepository;
import eapli.base.clientusermanagement.repositories.ClientUserRepository;
import eapli.base.clientusermanagement.repositories.SignupRequestRepository;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.formmanagement.repositories.FormAnswerRepository;
import eapli.base.formmanagement.repositories.FormParameterAnswerRepository;
import eapli.base.formmanagement.repositories.FormParameterRepository;
import eapli.base.formmanagement.repositories.FormRepository;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.base.ticketmanagement.repositories.TicketRepository;
import eapli.base.typeofteammanagement.repositories.TypeOfTeamRepository;
import eapli.base.workflowmanagement.repositories.WorkFlowRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;

/**
 * @author Paulo Gandra Sousa
 *
 */
public interface RepositoryFactory {

	/**
	 * factory method to create a transactional context to use in the repositories
	 *
	 * @return
	 */
	TransactionalContext newTransactionalContext();

	/**
	 *
	 * @param autoTx the transactional context to enrol
	 * @return
	 */
	UserRepository users(TransactionalContext autoTx);

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	UserRepository users();

	/**
	 *
	 * @param autoTx the transactional context to enroll
	 * @return
	 */
	ClientUserRepository clientUsers(TransactionalContext autoTx);

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	ClientUserRepository clientUsers();
        

	/**
	 *
	 * @param autoTx the transactional context to enroll
	 * @return
	 */
	SignupRequestRepository signupRequests(TransactionalContext autoTx);

	/**
	 * repository will be created in auto transaction mode
	 *
	 * @return
	 */
	SignupRequestRepository signupRequests();
        
        CatalogueRepository catalogues();
        
        ColaboratorRepository colaborators();
        
        TeamRepository teams();

        ServiceRepository services();
        
        FormRepository forms();
        
        TypeOfTeamRepository typesofteam();
        
        TicketRepository tickets();
        
        WorkFlowRepository workflows();
        
        ActivityRepository activities();
        
        FormParameterRepository formParameters();
        
        FormParameterAnswerRepository formParameterAnswers();
        
        FormAnswerRepository formAnswers();

        ActivityExecutionRepository activityExecutions();
}
