package eapli.base.typeofteammanagement.domain;

import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.general.domain.model.Description;
import eapli.framework.infrastructure.authz.domain.model.Role;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TypeOfTeamTest {


    public static TypeOfTeam dummyTypeOfTeam(String color) {
        // should we load from spring context?
        final TypeOfTeamBuilder typeOfTypeOfTeamBuilder = new TypeOfTeamBuilder();
        return typeOfTypeOfTeamBuilder.withAll(new Color(color), Description.valueOf("Cor")).build();
    }

    private TypeOfTeam getNewDummyTypeOfTeam() {
        return dummyTypeOfTeam("azul");
    }

    private TypeOfTeam getNewDummyTypeOfTeamTwo() {
        return dummyTypeOfTeam("vermelho");
    }

    @Test
    public void ensureTypeOfTeamEqualsPassesForTheSameTypeOfTeamCode() throws Exception {

        final TypeOfTeam aTypeOfTeam = getNewDummyTypeOfTeam();

        final TypeOfTeam anotherTypeOfTeam = getNewDummyTypeOfTeam();

        final boolean expected = aTypeOfTeam.equals(anotherTypeOfTeam);

        assertTrue(expected);
    }

    @Test
    public void ensureTypeOfTeamEqualsFailsForDifferenteTypeOfTeamCode() throws Exception {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);

        final TypeOfTeam aTypeOfTeam = getNewDummyTypeOfTeam();

        final TypeOfTeam anotherTypeOfTeam = getNewDummyTypeOfTeamTwo();

        final boolean expected = aTypeOfTeam.equals(anotherTypeOfTeam);

        assertFalse(expected);
    }

    @Test
    public void ensureTypeOfTeamEqualsAreTheSameForTheSameInstance() throws Exception {
        final TypeOfTeam aTypeOfTeam = getNewDummyTypeOfTeam();

        final boolean expected = aTypeOfTeam.equals(aTypeOfTeam);

        assertTrue(expected);
    }

    @Test
    public void ensureTypeOfTeamEqualsFailsForDifferenteObjectTypes() throws Exception {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);

        final TypeOfTeam aTypeOfTeam = getNewDummyTypeOfTeam();

        final boolean expected = aTypeOfTeam.equals(getNewDummyTypeOfTeamTwo());

        assertFalse(expected);
    }

    @Test
    public void ensureTypeOfTeamIsTheSameAsItsInstance() throws Exception {
        final TypeOfTeam aTypeOfTeam = getNewDummyTypeOfTeam();

        final boolean expected = aTypeOfTeam.sameAs(aTypeOfTeam);

        assertTrue(expected);
    }

    @Test
    public void ensureTwoTypeOfTeamWithDifferentTypeOfTeamCodesAreNotTheSame() throws Exception {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);
        final TypeOfTeam aTypeOfTeam = getNewDummyTypeOfTeam();

        final TypeOfTeam anotherTypeOfTeam = getNewDummyTypeOfTeamTwo();

        final boolean expected = aTypeOfTeam.sameAs(anotherTypeOfTeam);

        assertFalse(expected);
    }


}