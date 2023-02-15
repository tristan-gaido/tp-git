package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeEffacer extends CommandeDocument {


    public CommandeEffacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : effacer;depart;fin");
            description();
            return;
        }
        int depart = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        this.document.effacer(depart, fin);
        super.executer();
    }

    @Override
    public void description() {
        System.out.println("Efface le texte entre les positions depart et fin");
    }

}
