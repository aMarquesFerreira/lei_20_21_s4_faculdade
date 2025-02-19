package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.activitymanagement.repositories.ActivityExecutionRepository;
import eapli.base.activitymanagement.repositories.ActivityRepository;
import eapli.base.catalogue.repositories.CatalogueRepository;
import eapli.base.clientusermanagement.repositories.SignupRequestRepository;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.formmanagement.repositories.FormAnswerRepository;
import eapli.base.formmanagement.repositories.FormParameterAnswerRepository;
import eapli.base.formmanagement.repositories.FormParameterRepository;
import eapli.base.formmanagement.repositories.FormRepository;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.servicemanagement.repositories.ServiceRepository;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.base.ticketmanagement.repositories.TicketRepository;
import eapli.base.typeofteammanagement.repositories.TypeOfTeamRepository;
import eapli.base.workflowmanagement.repositories.WorkFlowRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import eapli.framework.infrastructure.authz.repositories.impl.JpaAutoTxUserRepository;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

/**
 *
 * Created by nuno on 21/03/16.
 */
public class JpaRepositoryFactory implements RepositoryFactory {

	@Override
	public UserRepository users(final TransactionalContext autoTx) {
		return new JpaAutoTxUserRepository(autoTx);
	}

	@Override
	public UserRepository users() {
		return new JpaAutoTxUserRepository(Application.settings().getPersistenceUnitName(),
				Application.settings().getExtendedPersistenceProperties());
	}


	@Override
	public JpaClientUserRepository clientUsers(final TransactionalContext autoTx) {
		return new JpaClientUserRepository(autoTx);
	}

	@Override
	public JpaClientUserRepository clientUsers() {
		return new JpaClientUserRepository(Application.settings().getPersistenceUnitName());
	}

	@Override
	public SignupRequestRepository signupRequests(final TransactionalContext autoTx) {
		return new JpaSignupRequestRepository(autoTx);
	}

	@Override
	public SignupRequestRepository signupRequests() {
		return new JpaSignupRequestRepository(Application.settings().getPersistenceUnitName());
	}


	@Override
	public TransactionalContext newTransactionalContext() {
		return JpaAutoTxRepository.buildTransactionalContext(Application.settings().getPersistenceUnitName(),
				Application.settings().getExtendedPersistenceProperties());
	}

    @Override
    public CatalogueRepository catalogues() {
        return new JpaCatalogueRepository(Application.settings().getPersistenceUnitName());
    }
    
    @Override
    public ColaboratorRepository colaborators() {
        return new JpaColaboratorRepository(Application.settings().getPersistenceUnitName());
    }
    
    @Override
    public TeamRepository teams() {
        return new JpaTeamRepository(Application.settings().getPersistenceUnitName());
    }
    
    @Override
    public ServiceRepository services() {
        return new JpaServiceRepository(Application.settings().getPersistenceUnitName());
    }
    
    @Override
    public FormRepository forms() {
        return new JpaFormRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public TypeOfTeamRepository typesofteam() {
        return new JpaTypeOfTeamRepository(Application.settings().getPersistenceUnitName());
    }
    
    @Override
    public TicketRepository tickets() {
        return new JpaTicketRepository(Application.settings().getPersistenceUnitName());
    }

    
    @Override
    public WorkFlowRepository workflows() {
        return new JpaWorkFlowRepository(Application.settings().getPersistenceUnitName());
    }

    
    @Override
    public ActivityRepository activities() {
        return new JpaActivityRepository(Application.settings().getPersistenceUnitName());
    }
    
    @Override
    public FormParameterRepository formParameters() {
        return new JpaFormParameterRepository(Application.settings().getPersistenceUnitName());
    }
    
    @Override
    public FormParameterAnswerRepository formParameterAnswers() {
        return new JpaFormParameterAnswerRepository(Application.settings().getPersistenceUnitName());
    }
    
    @Override
    public FormAnswerRepository formAnswers() {
        return new JpaFormAnswerRepository(Application.settings().getPersistenceUnitName());
    }
    
    @Override
    public ActivityExecutionRepository activityExecutions() {
        return new JpaActivityExecutionRepository(Application.settings().getPersistenceUnitName());
    }

}
