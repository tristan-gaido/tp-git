package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * The type Commande ajouter.
 */
public class CommandeAjouter extends CommandeDocument {


    /**
     * Instantiates a new Commande ajouter.
     *
     * @param document   the document
     * @param parameters the parameters
     */
    public CommandeAjouter(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : ajouter;texte");
            description();
            return;
        }
        String texte = parameters[1];
        this.document.ajouter(texte);
        super.executer();
    }

    @Override
    public void description() {
        System.out.println("Ajoute le texte à la fin du document");
    }

}
