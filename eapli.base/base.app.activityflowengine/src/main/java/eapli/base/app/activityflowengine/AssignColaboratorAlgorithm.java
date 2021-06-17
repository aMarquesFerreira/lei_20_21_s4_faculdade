/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.activityflowengine;

import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.teammanagement.domain.Team;

/**
 *
 * @author andre
 */
public interface AssignColaboratorAlgorithm {
    public Colaborator next();
    
    public Colaborator nextLowestWork(Team team);
}
