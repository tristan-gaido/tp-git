package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument {

    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : inserer;3;texte");
            description();
            return;
        }
        this.document.inserer(Integer.valueOf(parameters[1]), parameters[2]);
        super.executer();
    }

    @Override
    public void description() {
        System.out.println("Insère le texte à la position indiquée");
    }

}