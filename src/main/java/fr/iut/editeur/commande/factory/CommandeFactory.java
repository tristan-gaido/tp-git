package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.*;
import fr.iut.editeur.document.Document;

/**
 * The type Commande factory.
 */
public class CommandeFactory {

    private static CommandeFactory instance;

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static CommandeFactory getInstance() {
        if(instance == null) {
            instance = new CommandeFactory();
        }
        return instance;
    }

    private CommandeFactory() {}

    /**
     * Create command commande.
     *
     * @param name       the name
     * @param document   the document
     * @param parameters the parameters
     * @return the commande
     */
    public Commande createCommand(String name, Document document, String[] parameters) {
        switch (name) {
            case "ajouter" : return new CommandeAjouter(document, parameters);
            case "remplacer" : return new CommandeRemplacer(document, parameters);
            case "majuscules" : return new CommandeMajuscules(document, parameters);
            case "clear": return new CommandeClear(document, parameters);
            case "effacer" : return new CommandeEffacer(document, parameters);
            case "inserer" : return new CommandeInserer(document, parameters);
            case "minuscules": return new CommandeMinuscules(document, parameters);
            default: return null;
        }
    }

}
