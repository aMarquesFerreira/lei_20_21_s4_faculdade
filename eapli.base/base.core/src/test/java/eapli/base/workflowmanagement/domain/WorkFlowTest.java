package eapli.base.workflowmanagement.domain;


import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueId;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.colaboratormanagement.domain.*;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceCode;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.general.domain.model.Description;
import eapli.framework.general.domain.model.Designation;
import eapli.framework.infrastructure.authz.domain.model.*;

import org.junit.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WorkFlowTest {


    public WorkFlow dummyWorkflow(final WorkFlowId id) {
        // should we load from spring context?
        final WorkflowBuilder workflowBuilder = new WorkflowBuilder();
        return workflowBuilder.withAll(id, new Service(new ServiceCode("2"),
                Description.valueOf("description"),
                Designation.valueOf("designation"), new Catalogue(new Colaborator(getNewDummyUser(),
                new MecanographicNumber("duMMy1"),
                new Address("dummy","bothDummy"),
                new BirthDate(new Date(2020,12,1)),
                new Evaluation(2.2), new Contact(912365478)), new CatalogueId("1"),
                Description.valueOf("Description"),
                Designation.valueOf("Designation")))).build();
    }

    public static SystemUser dummyUser(final String username, final Role... roles) {
        // should we load from spring context?
        final SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
        return userBuilder.with(username, "duMMy1", "dummy", "dummy", "a@b.ro").withRoles(roles).build();
    }

    private SystemUser getNewDummyUser() {
        return dummyUser("dummy", BaseRoles.ADMIN);
    }

    private WorkFlow getNewDummyWorkflow() {
        return dummyWorkflow(new WorkFlowId("dummy"));
    }

    private WorkFlow getNewDummyWorkflowTwo() {
        return dummyWorkflow(new WorkFlowId("dummy1"));
    }

    @Test
    public void ensureWorkflowEqualsPassesForTheSameWorkflowCode() {

        final WorkFlow aWorkflow = getNewDummyWorkflow();

        final WorkFlow anotherWorkflow = getNewDummyWorkflow();

        final boolean expected = aWorkflow.equals(anotherWorkflow);

        assertTrue(expected);
    }

    @Test
    public void ensureWorkflowEqualsFailsForDifferenteWorkflowCode() {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);

        final WorkFlow aWorkflow = getNewDummyWorkflow();

        final WorkFlow anotherWorkflow = getNewDummyWorkflowTwo();

        final boolean expected = aWorkflow.equals(anotherWorkflow);

        assertFalse(expected);
    }

    @Test
    public void ensureWorkflowEqualsAreTheSameForTheSameInstance() {
        final WorkFlow aWorkflow = new WorkFlow();

        final boolean expected = aWorkflow.equals(aWorkflow);

        assertTrue(expected);
    }

    @Test
    public void ensureWorkflowEqualsFailsForDifferenteObjectTypes() {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);

        final WorkFlow aWorkflow = getNewDummyWorkflow();

        final boolean expected = aWorkflow.equals(getNewDummyWorkflowTwo());

        assertFalse(expected);
    }

    @Test
    public void ensureWorkflowIsTheSameAsItsInstance() {
        final WorkFlow aWorkflow = getNewDummyWorkflow();

        final boolean expected = aWorkflow.sameAs(aWorkflow);

        assertTrue(expected);
    }

    @Test
    public void ensureTwoWorkflowWithDifferentWorkflowCodesAreNotTheSame() {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);
        final WorkFlow aWorkflow = getNewDummyWorkflow();

        final WorkFlow anotherWorkflow = getNewDummyWorkflowTwo();

        final boolean expected = aWorkflow.sameAs(anotherWorkflow);

        assertFalse(expected);
    }


}