/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.app.other.console;

//import eapli.base.app.activityflowengine.TcpServer;

/**
 *
 * @author Paulo Gandra Sousa
 */
@SuppressWarnings("squid:S106")
public final class OtherApp {

    /**
     * Empty constructor is private to avoid instantiation of this class.
     */
    private OtherApp() {
    }

    public static void main(final String[] args) {
        System.out.println("======================================");
        System.out.println("Executor Actividades");
        System.out.println("(C) 2016, 2017, 2018, 2019, 2020, 2021");
        System.out.println("======================================");
/*
        AuthzRegistry.configure(PersistenceContext.repositories().users(),
                new BasePasswordPolicy(), new PlainTextEncoder());

        // login and go to main menu
        if (new LoginAction(BaseRoles.CASHIER).execute()) {
            final MainMenu menu = new MainMenu();
            menu.mainLoop();
        }*/

       /* TcpServer tcpServer = new TcpServer();
        try {
            tcpServer.run();
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
            ex.printStackTrace();
        }*/

        // exiting the application, closing all threads
        System.exit(0);
    }
}
