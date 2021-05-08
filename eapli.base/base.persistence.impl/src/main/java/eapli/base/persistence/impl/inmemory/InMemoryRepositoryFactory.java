package eapli.base.persistence.impl.inmemory;

import eapli.base.catalogue.repositories.CatalogueRepository;
import eapli.base.clientusermanagement.repositories.ClientUserRepository;
import eapli.base.clientusermanagement.repositories.SignupRequestRepository;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.infrastructure.bootstrapers.BaseBootstrapper;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.teammanagement.repositories.TeamRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import eapli.framework.infrastructure.authz.repositories.impl.InMemoryUserRepository;

/**
 *
 * Created by nuno on 20/03/16.
 */
public class InMemoryRepositoryFactory implements RepositoryFactory {

	static {
		// only needed because of the in memory persistence
		new BaseBootstrapper().execute();
	}

	@Override
	public UserRepository users(final TransactionalContext tx) {
		return new InMemoryUserRepository();
	}

	@Override
	public UserRepository users() {
		return users(null);
	}


	@Override
	public ClientUserRepository clientUsers(final TransactionalContext tx) {

		return new InMemoryClientUserRepository();
	}

	@Override
	public ClientUserRepository clientUsers() {
		return clientUsers(null);
	}

	@Override
	public SignupRequestRepository signupRequests() {
		return signupRequests(null);
	}

	@Override
	public SignupRequestRepository signupRequests(final TransactionalContext tx) {
		return new InMemorySignupRequestRepository();
	}


	@Override
	public TransactionalContext newTransactionalContext() {
		// in memory does not support transactions...
		return null;
	}

    @Override
    public CatalogueRepository catalogues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public TeamRepository teams() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ColaboratorRepository colaborators() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
