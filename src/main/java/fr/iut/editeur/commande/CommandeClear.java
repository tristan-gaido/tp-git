package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * The type Commande clear.
 */
public class CommandeClear extends CommandeDocument {

    /**
     * Instantiates a new Commande clear.
     *
     * @param document   the document
     * @param parameters the parameters
     */
    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 1) {
            System.err.println("Format attendu : clear;");
            description();
            return;
        }
        this.document.clear();
        super.executer();
    }

    @Override
    public void description() {
        System.out.println("Efface le texte du document");
    }

}
