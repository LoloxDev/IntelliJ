public class Editeur {
    public static void main(String[] args) {
        JavaClasse calculatrice = new JavaClasse("calculatrice");
        calculatrice.setAttributProtege(new JavaMethode("calculer"));
        JavaAttribut typeOperation = new JavaAttribut("type opération");
        calculatrice.afficherNom();
        calculatrice.getAttributProtege().afficherNom();
        typeOperation.afficherNom();
        System.out.println();
    }
}