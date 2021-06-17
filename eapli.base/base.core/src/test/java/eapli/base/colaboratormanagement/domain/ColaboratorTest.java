package eapli.base.colaboratormanagement.domain;

import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.domain.model.*;
import org.junit.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ColaboratorTest {


    private final String aMecanographicNumber = "isep2021";
    private final String anotherMecanographicNumber = "isep2020";

    public static SystemUser dummyUser(final String username, final Role... roles) {
        // should we load from spring context?
        final SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
        return userBuilder.with(username, "duMMy1", "dummy", "dummy", "a@b.ro").withRoles(roles).build();
    }

    private  SystemUser getNewDummyUser() {
        return dummyUser("dummy", BaseRoles.ADMIN);
    }


    public  Colaborator dummyColaborator(MecanographicNumber id) {
        // should we load from spring context?
        final ColaboratorBuilder colaboratorBuilder = new ColaboratorBuilder();
        return colaboratorBuilder.withAll(getNewDummyUser(), id, new Address("dummy", "dummy"),
                new BirthDate(new Date(2020,05,13)),
                new Evaluation(7.3), new Contact(912255444)).build();
    }

    @Test
    public void ensureColaboratorEqualsPassesForTheSameMecanographicNumber() {

        final Colaborator aColaborator = new ColaboratorBuilder().withMecanographicNumber("DUMMY")
                .withSystemUser(getNewDummyUser()).withAddress("rua","cidade").
                        withContact(91542651).withEvaluation(7.3).
                        withBirthDate(new Date(2020,05,13)).build();

        final Colaborator anotherColaborator = new ColaboratorBuilder().withMecanographicNumber(new MecanographicNumber("DUMMY"))
                .withSystemUser(getNewDummyUser()).build();

        final boolean expected = aColaborator.equals(anotherColaborator);

        assertTrue(expected);
    }

    @Test
    public void ensureColaboratorUserEqualsFailsForDifferenteMecanographicNumber() {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);

        final Colaborator aColaborator = new ColaboratorBuilder().withMecanographicNumber(aMecanographicNumber)
                .withSystemUser(getNewDummyUser()).build();

        final Colaborator anotherColaborator = new ColaboratorBuilder()
                .withMecanographicNumber(anotherMecanographicNumber).withSystemUser(getNewDummyUser()).build();

        final boolean expected = aColaborator.equals(anotherColaborator);

        assertFalse(expected);
    }

    @Test
    public void ensureColaboratorEqualsAreTheSameForTheSameInstance() {
        final Colaborator aColaborator = new ColaboratorBuilder().withMecanographicNumber("DUMMY")
                .withSystemUser(getNewDummyUser()).build();

        final boolean expected = aColaborator.equals(aColaborator);

        assertTrue(expected);
    }

    @Test
    public void ensureColaboratorEqualsFailsForDifferenteObjectTypes() {

        final Colaborator aColaborator = new ColaboratorBuilder().withMecanographicNumber("DUMMY")
                .withSystemUser(getNewDummyUser()).build();

        final boolean expected = aColaborator.equals(getNewDummyUser());

        assertFalse(expected);
    }

    @Test
    public void ensureColaboratorIsTheSameAsItsInstance() {
        final Colaborator aColaborator = new ColaboratorBuilder().withMecanographicNumber("DUMMY")
                .withSystemUser(getNewDummyUser()).build();

        final boolean expected = aColaborator.sameAs(aColaborator);

        assertTrue(expected);
    }

    @Test
    public void ensureTwoColaboratorWithDifferentMecanographicNumbersAreNotTheSame() {

        final Colaborator aColaborator = new ColaboratorBuilder().withMecanographicNumber(aMecanographicNumber)
                .withSystemUser(getNewDummyUser()).build();

        final Colaborator anotherColaborator = new ColaboratorBuilder()
                .withMecanographicNumber(anotherMecanographicNumber).withSystemUser(getNewDummyUser()).build();

        final boolean expected = aColaborator.sameAs(anotherColaborator);

        assertFalse(expected);
    }

}