package fr.iut.editeur.document;

/**
 * The type Document.
 */
public class Document {

    private String texte;

    /**
     * Instantiates a new Document.
     */
    public Document() {
        this.texte = "";
    }

    /**
     * Gets texte.
     *
     * @return the texte
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Sets texte.
     *
     * @param texte the texte
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Ajouter.
     *
     * @param texte the texte
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Remplacer.
     *
     * @param start        the start
     * @param end          the end
     * @param remplacement the remplacement
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = this.texte.substring(0, start);
        String rightPart = this.texte.substring(end);
        this.texte = leftPart + remplacement + rightPart;
    }

    /**
     * Majuscules.
     *
     * @param start the start
     * @param end   the end
     */
    public void majuscules(int start, int end) {
        String leftPart = this.texte.substring(0, start);
        String rightPart = this.texte.substring(end);
        String middlePart = this.texte.substring(start, end).toUpperCase();
        this.texte = leftPart + middlePart + rightPart;
    }

    /**
     * Minuscules.
     *
     * @param start the start
     * @param end   the end
     */
    public void minuscules(int start, int end) {
        String leftPart = this.texte.substring(0, start);
        String middlePart = this.texte.substring(start, end).toUpperCase();
        String rightPart = this.texte.substring(end);
        this.texte = leftPart + middlePart + rightPart;
    }

    /**
     * Clear.
     */
    public void clear() {
        this.texte = "";
    }

    /**
     * Effacer.
     *
     * @param start the start
     * @param end   the end
     */
    public void effacer(int start, int end) {
        String leftPart = this.texte.substring(0, start);
        String rightPart = this.texte.substring(end);
        this.texte = leftPart + rightPart;
    }

    /**
     * Inserer.
     *
     * @param index the index
     * @param texte the texte
     */
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
