package eapli.base.formmanagement.domain;

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

import java.util.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FormTest {


    /*private static List<FormParameter> lfP = new ArrayList<>();

    public static SystemUser dummyUser(final String username, final Role... roles) {
        // should we load from spring context?
        final SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
        return userBuilder.with(username, "duMMy1", "dummy", "dummy", "a@b.ro").withRoles(roles).build();
    }

    private static SystemUser getNewDummyUser() {
        return dummyUser("dummy", BaseRoles.ADMIN);
    }


    public static Form dummyForm(final FormId formId) {
        // should we load from spring context?
        final FormBuilder FormBuilder = new FormBuilder();
        return FormBuilder.withAll(formId,Designation.valueOf("3"), new Service(new ServiceCode("1"),Description.valueOf("2"),Designation.valueOf("3"),
                        new Catalogue(new Colaborator(dummyUser("dummy", BaseRoles.ADMIN),
                                new MecanographicNumber("duMMy1"),
                                new Address("dummy","bothDummy"),
                                new BirthDate(new Date(2020,12,1)),
                                new Evaluation(2.2), new Contact(912365478)), new CatalogueId("1"),Description.valueOf("2"),Designation.valueOf("3"))),
                                new FormParameter( "parameterData", "variableName", "label", "description")).build();
    }

    private Form getNewDummyForm() {
        return dummyForm(new FormId("dummy"));
    }

    private Form getNewDummyFormTwo() {
        return dummyForm(new FormId("dummy1"));
    }

    @Test
    public void ensureFormEqualsPassesForTheSameFormCode() throws Exception {

        final Form aForm = getNewDummyForm();

        final Form anotherForm = getNewDummyForm();

        final boolean expected = aForm.equals(anotherForm);

        assertTrue(expected);
    }

    @Test
    public void ensureFormEqualsFailsForDifferenteFormCode() throws Exception {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);

        final Form aForm = getNewDummyForm();

        final Form anotherForm = getNewDummyFormTwo();

        final boolean expected = aForm.equals(anotherForm);

        assertFalse(expected);
    }

    @Test
    public void ensureFormEqualsAreTheSameForTheSameInstance() throws Exception {
        final Form aForm = new Form();

        final boolean expected = aForm.equals(aForm);

        assertTrue(expected);
    }

    @Test
    public void ensureFormEqualsFailsForDifferenteObjectTypes() throws Exception {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);

        final Form aForm = getNewDummyForm();

        final boolean expected = aForm.equals(getNewDummyFormTwo());

        assertFalse(expected);
    }

    @Test
    public void ensureFormIsTheSameAsItsInstance() throws Exception {
        final Form aForm = getNewDummyForm();

        final boolean expected = aForm.sameAs(aForm);

        assertTrue(expected);
    }

    @Test
    public void ensureTwoFormWithDifferentFormCodesAreNotTheSame() throws Exception {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);
        final Form aForm = getNewDummyForm();

        final Form anotherForm = getNewDummyFormTwo();

        final boolean expected = aForm.sameAs(anotherForm);

        assertFalse(expected);
    }*/
}