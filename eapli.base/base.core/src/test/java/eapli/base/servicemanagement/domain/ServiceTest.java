package eapli.base.servicemanagement.domain;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.cataloguemanagement.domain.CatalogueBuilder;
import eapli.base.cataloguemanagement.domain.CatalogueId;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.colaboratormanagement.domain.*;
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

public class ServiceTest {

    Description shortDescription = Description.valueOf("Description");
    Designation catalogueTitle = Designation.valueOf("Designation");

    public static SystemUser dummyUser(final String username, final Role... roles) {
        // should we load from spring context?
        final SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
        return userBuilder.with(username, "duMMy1", "dummy", "dummy", "a@b.ro").withRoles(roles).build();
    }

    private static SystemUser getNewDummyUser() {
        return dummyUser("dummy", BaseRoles.ADMIN);
    }

    public Colaborator dummyColaborator(MecanographicNumber id) {
        // should we load from spring context?
        final ColaboratorBuilder colaboratorBuilder = new ColaboratorBuilder();
        return colaboratorBuilder.withAll(getNewDummyUser(), id, new Address("dummy", "dummy"),
                new BirthDate(new Date(2020, 05, 13)),
                new Evaluation(7.3), new Contact(912255444)).build();
    }

    public Catalogue dummyCatalogue(String id) {
        // should we load from spring context?
        final CatalogueBuilder catalogueBuilder = new CatalogueBuilder();
        return catalogueBuilder.withColaborator(getNewColaborator()).withCatalogueId(id).
                withDescription(shortDescription).withDesignation(catalogueTitle).build();
    }

    private Colaborator getNewColaborator() {
        return dummyColaborator(new MecanographicNumber("dummy-one"));
    }

    private Colaborator getNewColaboratorTwo() {
        return dummyColaborator(new MecanographicNumber("dummy-two"));
    }

    private Catalogue getNewCatalogue() {
        return dummyCatalogue("DUMMY");
    }

    private Catalogue getNewCatalogueTwo() {
        return dummyCatalogue("DUMMY1");
    }

    Catalogue catalogue = getNewCatalogue();

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

    private Service getNewDummyServiceTwo() {
        return dummyService(new ServiceCode("dummy1"));
    }

    @Test
    public void ensureServiceEqualsPassesForTheSameServiceCode() throws Exception {

        final Service aService = getNewDummyService();

        final Service anotherService = getNewDummyService();

        final boolean expected = aService.equals(anotherService);

        assertTrue(expected);
    }

    @Test
    public void ensureServiceEqualsFailsForDifferenteServiceCode() throws Exception {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);

        final Service aService = getNewDummyService();

        final Service anotherService = getNewDummyServiceTwo();

        final boolean expected = aService.equals(anotherService);

        assertFalse(expected);
    }

    @Test
    public void ensureServiceEqualsAreTheSameForTheSameInstance() throws Exception {
        final Service aService = new Service();

        final boolean expected = aService.equals(aService);

        assertTrue(expected);
    }

    @Test
    public void ensureServiceEqualsFailsForDifferenteObjectTypes() throws Exception {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);

        final Service aService = getNewDummyService();

        final boolean expected = aService.equals(getNewDummyServiceTwo());

        assertFalse(expected);
    }

    @Test
    public void ensureServiceIsTheSameAsItsInstance() throws Exception {
        final Service aService = getNewDummyService();

        final boolean expected = aService.sameAs(aService);

        assertTrue(expected);
    }

    @Test
    public void ensureTwoServiceWithDifferentServiceCodesAreNotTheSame() throws Exception {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);
        final Service aService = getNewDummyService();

        final Service anotherService = getNewDummyServiceTwo();

        final boolean expected = aService.sameAs(anotherService);

        assertFalse(expected);
    }
}