/*
 * Copyright (c) 2013-2019 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package eapli.base.cataloguemanagement.domain;

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

/**
 * Created by andre
 */
public class CatalogueTest {

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

    @Test
    public void ensureCatalogueEqualsPassesForTheSameCatalogueID() {

        final Catalogue aCatalogue = new CatalogueBuilder().withColaborator(getNewColaborator()).withCatalogueId("DUMMY")
                .withDescription(shortDescription).withDesignation(catalogueTitle).build();

        final Catalogue anotherCatalogue = new CatalogueBuilder().withColaborator(getNewColaboratorTwo()).withCatalogueId("DUMMY")
                .withDescription(shortDescription).withDesignation(catalogueTitle).build();

        final boolean expected = aCatalogue.equals(anotherCatalogue);

        assertTrue(expected);
    }

    @Test
    public void ensureCatalogueUserEqualsFailsForDifferenteCatalogueID() {

        final boolean expected = getNewCatalogue().equals(getNewCatalogueTwo());

        assertFalse(expected);
    }

    @Test
    public void ensureCatalogueEqualsAreTheSameForTheSameInstance() {
        final Catalogue aCatalogue = new Catalogue();

        final boolean expected = aCatalogue.equals(aCatalogue);

        assertTrue(expected);
    }

    @Test
    public void ensureCatalogueEqualsFailsForDifferenteObjectTypes() {
        final Catalogue aCatalogue = new CatalogueBuilder().withColaborator(getNewColaborator()).withCatalogueId("DUMMY").
                withDescription(shortDescription).withDesignation(catalogueTitle).build();

        final boolean expected = aCatalogue.equals(getNewCatalogueTwo());

        assertFalse(expected);
    }

    @Test
    public void ensureCatalogueIsTheSameAsItsInstance() {
        final Catalogue aCatalogue = new CatalogueBuilder().withColaborator(getNewColaborator()).withCatalogueId("DUMMY").
                withDescription(shortDescription).withDesignation(catalogueTitle).build();

        final boolean expected = aCatalogue.sameAs(aCatalogue);

        assertTrue(expected);
    }

    @Test
    public void ensureTwoCatalogueWithDifferentCatalogueIDAreNotTheSame() {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);
        final Catalogue aCatalogue = new CatalogueBuilder().withColaborator(getNewColaborator()).withCatalogueId("DUMMY").
                withDescription(shortDescription).withDesignation(catalogueTitle).build();

        final Catalogue anotherCatalogue = new CatalogueBuilder().withColaborator(getNewColaborator()).withCatalogueId("DUMMY1").
                withDescription(shortDescription).withDesignation(catalogueTitle).build();

        final boolean expected = aCatalogue.sameAs(anotherCatalogue);

        assertFalse(expected);
    }

}
