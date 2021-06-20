package eapli.base.ticketmanagement.domain;


import eapli.base.activitymanagement.domain.Activity;
import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueId;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.colaboratormanagement.domain.*;
import eapli.base.formmanagement.domain.Form;
import eapli.base.formmanagement.domain.FormAnswer;
import eapli.base.formmanagement.domain.FormAnswerId;
import eapli.base.formmanagement.domain.FormId;
import eapli.base.servicemanagement.domain.Service;
import eapli.base.servicemanagement.domain.ServiceBuilder;
import eapli.base.servicemanagement.domain.ServiceCode;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.base.workflowmanagement.domain.WorkFlow;
import eapli.base.workflowmanagement.domain.WorkFlowExecution;
import eapli.base.workflowmanagement.domain.WorkFlowExecutionId;
import eapli.base.workflowmanagement.domain.WorkFlowId;
import eapli.framework.general.domain.model.Description;
import eapli.framework.general.domain.model.Designation;
import eapli.framework.infrastructure.authz.domain.model.*;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TicketTest {

    private List<Activity> activityList = new ArrayList<>();

    public Ticket dummyTicket(final TicketId id) {
        // should we load from spring context?
        final TicketBuilder TicketBuilder = new TicketBuilder();
        return TicketBuilder.withAll(id, dummyColaborator(new MecanographicNumber("123")),
                new FormAnswer(new FormAnswerId("2"), new Form(new FormId("1"), Designation.valueOf("Designation")),dummyColaborator(new MecanographicNumber("123"))),
                getNewDummyService(), new WorkFlowExecution(new WorkFlowExecutionId("123"), new WorkFlow(new WorkFlowId("123")))).build();
    }

    public static Service dummyService(final ServiceCode code) {
        // should we load from spring context?
        final ServiceBuilder ServiceBuilder = new ServiceBuilder();
        return ServiceBuilder.withAll(code, Description.valueOf("dummy1"), Designation.valueOf("duMMy1"),
                new Catalogue(new Colaborator(getNewDummyUser(), new MecanographicNumber("1191526"), new Address("street","city"),
                        new BirthDate (new Date("22/06/2021")),
                        new Evaluation(5.9),
                        new Contact (912345678)),
                        new CatalogueId("id"), Description.valueOf("description"), Designation.valueOf("Designation"))).build();
    }

    private Service getNewDummyService() {
        return dummyService(new ServiceCode("dummy"));
    }


    public Colaborator dummyColaborator(MecanographicNumber id) {
        // should we load from spring context?
        final ColaboratorBuilder colaboratorBuilder = new ColaboratorBuilder();
        return colaboratorBuilder.withAll(getNewDummyUser(), id, new Address("dummy", "dummy"),
                new BirthDate(new Date(2020,05,13)),
                new Evaluation(7.3), new Contact(912255444)).build();
    }

    public static SystemUser dummyUser(final String username, final Role... roles) {
        // should we load from spring context?
        final SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
        return userBuilder.with(username, "duMMy1", "dummy", "dummy", "a@b.ro").withRoles(roles).build();
    }

    private static SystemUser getNewDummyUser() {
        return dummyUser("dummy", BaseRoles.ADMIN);
    }

    private Ticket getNewDummyTicket() {
        return dummyTicket(new TicketId(2020,1));
    }

    private Ticket getNewDummyTicketTwo() {
        return dummyTicket(new TicketId(2020,2));
    }

    @Test
    public void ensureTicketEqualsPassesForTheSameTicketID() {

        final Ticket aTicket = getNewDummyTicket();

        final Ticket anotherTicket = getNewDummyTicket();

        final boolean expected = aTicket.equals(anotherTicket);

        assertTrue(expected);
    }

    @Test
    public void ensureTicketEqualsFailsForDifferenteTicketCode() {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);

        final Ticket aTicket = getNewDummyTicket();

        final Ticket anotherTicket = getNewDummyTicketTwo();

        final boolean expected = aTicket.equals(anotherTicket);

        assertFalse(expected);
    }

    @Test
    public void ensureTicketEqualsAreTheSameForTheSameInstance() {
        final Ticket aTicket = new Ticket();

        final boolean expected = aTicket.equals(aTicket);

        assertTrue(expected);
    }

    @Test
    public void ensureTicketEqualsFailsForDifferenteObjectTypes() {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);

        final Ticket aTicket = getNewDummyTicket();

        final boolean expected = aTicket.equals(getNewDummyTicketTwo());

        assertFalse(expected);
    }

    @Test
    public void ensureTicketIsTheSameAsItsInstance() {
        final Ticket aTicket = getNewDummyTicket();

        final boolean expected = aTicket.sameAs(aTicket);

        assertTrue(expected);
    }

    @Test
    public void ensureTwoTicketWithDifferentTicketIDAreNotTheSame() {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);
        final Ticket aTicket = getNewDummyTicket();

        final Ticket anotherTicket = getNewDummyTicketTwo();

        final boolean expected = aTicket.sameAs(anotherTicket);

        assertFalse(expected);
    }
}