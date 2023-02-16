package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * The type Commande document.
 */
public abstract class CommandeDocument implements Commande {

    /**
     * The Document.
     */
    protected Document document;

    /**
     * The Parameters.
     */
    protected String[]parameters;

    /**
     * Instantiates a new Commande document.
     *
     * @param document   the document
     * @param parameters the parameters
     */
    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }

    @Override
    public void executer() {
        System.out.println(this.document);
    }


}
