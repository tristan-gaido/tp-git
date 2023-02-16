package fr.iut.editeur.commande.invoker;

import fr.iut.editeur.commande.Commande;

import java.util.Stack;

/**
 * The type Commande invoker.
 */
public class CommandeInvoker {

    private static CommandeInvoker instance;

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static synchronized CommandeInvoker getInstance() {
        if(instance == null) {
            instance = new CommandeInvoker();
        }
        return instance;
    }

    private CommandeInvoker() {}

    /**
     * Executer.
     *
     * @param commande the commande
     */
    public void executer(Commande commande) {
        commande.executer();
    }
}
