package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : remplacer;depart;fin;chaine");
            description();
            return;
        }
        int depart = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        String remplacement = "";
        if(parameters.length > 3) {
            remplacement = parameters[3];
        }
        this.document.remplacer(depart, fin, remplacement);
        super.executer();

    }

    @Override
    public void description() {
        System.out.println("Remplace le texte entre les positions depart et fin par la chaine");
    }

}
