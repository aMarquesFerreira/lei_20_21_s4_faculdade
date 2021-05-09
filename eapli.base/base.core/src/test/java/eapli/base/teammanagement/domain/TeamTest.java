package eapli.base.teammanagement.domain;


import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.general.domain.model.Designation;
import eapli.framework.infrastructure.authz.domain.model.*;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TeamTest {

    public static Team dummyTeam(final TeamCode code) {
        // should we load from spring context?
        final TeamBuilder teamBuilder = new TeamBuilder();
        return teamBuilder.withAll(code, Designation.valueOf("duMMy1"), new TeamAcronym("dummy")).build();
    }

    private Team getNewDummyTeam() {
        return dummyTeam(new TeamCode("dummy"));
    }

    private Team getNewDummyTeamTwo() {
        return dummyTeam(new TeamCode("dummy1"));
    }

    @Test
    public void ensureTeamEqualsPassesForTheSameTeamCode() throws Exception {

        final Team aTeam = getNewDummyTeam();

        final Team anotherTeam = getNewDummyTeam();

        final boolean expected = aTeam.equals(anotherTeam);

        assertTrue(expected);
    }

    @Test
    public void ensureTeamEqualsFailsForDifferenteTeamCode() throws Exception {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);

        final Team aTeam = getNewDummyTeam();

        final Team anotherTeam = getNewDummyTeamTwo();

        final boolean expected = aTeam.equals(anotherTeam);

        assertFalse(expected);
    }

    @Test
    public void ensureTeamEqualsAreTheSameForTheSameInstance() throws Exception {
        final Team aTeam = new Team();

        final boolean expected = aTeam.equals(aTeam);

        assertTrue(expected);
    }

    @Test
    public void ensureTeamEqualsFailsForDifferenteObjectTypes() throws Exception {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);

        final Team aTeam = getNewDummyTeam();

        final boolean expected = aTeam.equals(getNewDummyTeamTwo());

        assertFalse(expected);
    }

    @Test
    public void ensureTeamIsTheSameAsItsInstance() throws Exception {
        final Team aTeam = getNewDummyTeam();

        final boolean expected = aTeam.sameAs(aTeam);

        assertTrue(expected);
    }

    @Test
    public void ensureTwoTeamWithDifferentTeamCodesAreNotTheSame() throws Exception {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);
        final Team aTeam = getNewDummyTeam();

        final Team anotherTeam = getNewDummyTeamTwo();

        final boolean expected = aTeam.sameAs(anotherTeam);

        assertFalse(expected);
    }

}