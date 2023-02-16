package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = this.texte.substring(0, start);
        String rightPart = this.texte.substring(end);
        this.texte = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        String leftPart = this.texte.substring(0, start);
        String rightPart = this.texte.substring(end);
        String middlePart = this.texte.substring(start, end).toUpperCase();
        this.texte = leftPart + middlePart + rightPart;
    }

    public void minuscules(int start, int end) {
        String leftPart = this.texte.substring(0, start);
        String middlePart = this.texte.substring(start, end).toLowerCase();
        String rightPart = this.texte.substring(end);
        this.texte = leftPart + middlePart + rightPart;
    }
    
    public void clear() {
        this.texte = "";
    }

    public void effacer(int start, int end) {
        String leftPart = this.texte.substring(0, start);
        String rightPart = this.texte.substring(end);
        this.texte = leftPart + rightPart;
    }

    public void inserer(int index, String texte) {
        String leftPart = this.texte.substring(0, index);
        String rightPart = this.texte.substring(index);
        this.texte = leftPart + texte + rightPart;
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
