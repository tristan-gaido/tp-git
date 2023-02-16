package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * The type Commande minuscules.
 */
public class CommandeMinuscules extends CommandeDocument {


    /**
     * Instantiates a new Commande minuscules.
     *
     * @param document   the document
     * @param parameters the parameters
     */
    public CommandeMinuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            description();
            return;
        }

        this.document.minuscules(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]));
        super.executer();
    }

    @Override
    public void description() {
        System.out.println("majuscules;0;5");
    }

}