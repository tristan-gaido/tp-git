package fr.iutmontpellier.tests;

import fr.iut.editeur.document.Document;
import junit.framework.TestCase;

public class DocumentTest extends TestCase {

        public void testDocumentAjouter() {
            Document document = new Document();
            document.ajouter("Bonjour");
            assertEquals("Bonjour", document.getTexte());
        }

        public void testDocumentRemplacer() {
            Document document = new Document();
            document.ajouter("Bonjour");
            document.remplacer(0, 3, "Salut");
            assertEquals("Salutjour", document.getTexte());
        }

        public void testDocumentMajuscules() {
            Document document = new Document();
            document.ajouter("Bonjour");
            document.majuscules(0, 3);
            assertEquals("BONjour", document.getTexte());
        }

        public void testDocumentMinuscules() {
            Document document = new Document();
            document.ajouter("Bonjour");
            document.minuscules(0, 3);
            assertEquals("bonjour", document.getTexte());
        }

        public void testDocumentEffacer() {
            Document document = new Document();
            document.ajouter("Bonjour");
            document.effacer(0, 3);
            assertEquals("jour", document.getTexte());
        }

        public void testDocumentInserer() {
            Document document = new Document();
            document.ajouter("Bonjour");
            document.inserer(0, "Salut");
            assertEquals("SalutBonjour", document.getTexte());
        }

        public void testDocumentClear() {
            Document document = new Document();
            document.ajouter("Bonjour");
            document.clear();
            assertEquals("", document.getTexte());
        }
}
