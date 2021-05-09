/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.colaboratormanagement.domain;

import eapli.base.cataloguemanagement.domain.Catalogue;
import eapli.base.clientusermanagement.domain.ClientUser;
import eapli.base.clientusermanagement.domain.ClientUserBuilder;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.framework.domain.model.DomainFactory;
import eapli.framework.infrastructure.authz.domain.model.NilPasswordPolicy;
import eapli.framework.infrastructure.authz.domain.model.PlainTextEncoder;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.util.Date;

/**
 *
 * @author andre
 */
public class ColaboratorBuilder implements DomainFactory<Colaborator> {

    private SystemUser systemUser;
    private MecanographicNumber mecanographicNumber;
    private Address address;
    private BirthDate birthdate;
    private Evaluation evaluation;
    private Contact contact;

    public ColaboratorBuilder withAll(SystemUser systemUser, MecanographicNumber mecanographicNumber, Address address,
                                      BirthDate birthdate, Evaluation evaluation, Contact contact) {
        this.systemUser = systemUser;
        this.mecanographicNumber = mecanographicNumber;
        this.address = address;
        this.birthdate = birthdate;
        this.evaluation = evaluation;
        this.contact = contact;
        return this;
    }

    public ColaboratorBuilder withSystemUser(SystemUser systemUser) {
        this.systemUser = systemUser;
        return this;
    }

    public ColaboratorBuilder withMecanographicNumber(MecanographicNumber mecanographicNumber) {
        this.mecanographicNumber = mecanographicNumber;
        return this;
    }

    public ColaboratorBuilder withMecanographicNumber(String mecanographicNumber) {
        this.mecanographicNumber = new MecanographicNumber(mecanographicNumber);
        return this;
    }

    public ColaboratorBuilder withAddress(String street,String city) {
        this.address = new Address(street, city);
        return this;
    }

    public ColaboratorBuilder withBirthDate(Date date) {
        this.birthdate = new BirthDate(date);
        return this;
    }

    public ColaboratorBuilder withEvaluation(double evaluation) {
        this.evaluation = new Evaluation(evaluation);
        return this;
    }

    public ColaboratorBuilder withContact(long contact) {
        this.contact = new Contact(contact);
        return this;
    }

    @Override
    public Colaborator build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new Colaborator(this.systemUser, this.mecanographicNumber, this.address, this.birthdate, this.evaluation, this.contact);
    }
}
