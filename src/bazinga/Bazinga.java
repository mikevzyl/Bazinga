/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bazinga;

import environment.ApplicationStarter;

/**
 *
 * @author Michael
 */
public class Bazinga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();
    }

    private static void start() {
    ApplicationStarter.run("Michael's Project", new BazingaEnvironment());
    }
}
