/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.app.activityflowengine.client;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.colaboratormanagement.domain.Colaborator;
import eapli.base.colaboratormanagement.repositories.ColaboratorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.sdp2021.Sdp2021;
import eapli.base.sdp2021.Sdp2021Message;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/**
 *
 * @author andre
 */
public class ClientSSL {
    //private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final ColaboratorRepository colabRepo = PersistenceContext.repositories().colaborators();
    private static ClientSSL instance;
    private SSLSocket executorTarefasClient;
    private DataOutputStream dos;
    private DataInputStream dis;

    private final String executorTarefasServerAddress;
    private Sdp2021 sdp;

    private ClientSSL(String executorTarefasServerAddress) {
        this.executorTarefasServerAddress = executorTarefasServerAddress;
    }

    static ClientSSL getInstance(String executorTarefasServerAddress) {
        if (instance == null) {
            instance = new ClientSSL(executorTarefasServerAddress);
        }

        return instance;
    }

    private static final String KEYSTORE_PASS = "forgotten";
    
    public void start() {
        
        // Trust these certificates provided by servers
        System.setProperty("javax.net.ssl.trustStore", "client_mfa.jks");
        System.setProperty("javax.net.ssl.trustStorePassword",KEYSTORE_PASS);

        // Use this certificate and private key for client certificate when requested by the server
        System.setProperty("javax.net.ssl.keyStore", "client_mfa.jks");
        System.setProperty("javax.net.ssl.keyStorePassword",KEYSTORE_PASS);

        try {

            SSLSocketFactory sf = (SSLSocketFactory) SSLSocketFactory.getDefault();

            executorTarefasClient = (SSLSocket) sf.createSocket(executorTarefasServerAddress, Sdp2021.SDP2021_PORT);

            executorTarefasClient.startHandshake();
        
            //inicia conexao Sdp
            dos = new DataOutputStream(executorTarefasClient.getOutputStream());
            dis = new DataInputStream(executorTarefasClient.getInputStream());

            sdp = new Sdp2021();
            

        } catch (IOException ex) {
            System.out.println("Error connecting to executorAutoServer");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Error in communication with executorAutoServer");
            ex.printStackTrace();
        }
        
    }

    public void stop() {

        try {
            System.out.println("Terminating SDP Client");
            sdp.writeEnd(dos);

            executorTarefasClient.close();
        } catch (Exception ex) {
            Logger.getLogger(ClientSSL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
  
}
