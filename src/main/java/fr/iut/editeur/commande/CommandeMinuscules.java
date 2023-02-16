package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;
public class CommandeMinuscules extends CommandeDocument {


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