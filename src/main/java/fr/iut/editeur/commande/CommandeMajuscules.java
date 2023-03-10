package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * The type Commande majuscules.
 */
public class CommandeMajuscules extends CommandeDocument {


    /**
     * Instantiates a new Commande majuscules.
     *
     * @param document   the document
     * @param parameters the parameters
     */
    public CommandeMajuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : majuscules;depart;fin");
            description();
            return;
        }
        int depart = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.majuscules(depart, fin);
        super.executer();

    }

    @Override
    public void description() {
        System.out.println("Met en majuscules le texte entre les positions depart et fin");
    }
}
