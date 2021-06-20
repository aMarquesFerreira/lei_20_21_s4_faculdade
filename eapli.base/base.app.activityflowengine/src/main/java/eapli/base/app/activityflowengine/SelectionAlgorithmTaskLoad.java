/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.activityflowengine;

import eapli.base.app.activityflowengine.algorithms.ServerSelectionAlgorithm;

/**
 *
 * @author andre
 */
public class SelectionAlgorithmTaskLoad implements ServerSelectionAlgorithm {

    private final String[] servers;
    private int next = -1;
    
    
    public SelectionAlgorithmTaskLoad(String[] srvs) {
        this.servers = srvs;
    }
    
    @Override
    public String getServer() {
        next = next+1;
        if (next==servers.length)
            next=0;
        return servers[next];
    }

}
