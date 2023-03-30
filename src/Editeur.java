public class Editeur {
    public static void main(String[] args) {
        JavaClasse calculatrice = new JavaClasse("calculatrice");
        calculatrice.setCalculer(new JavaClasse.JavaMethode("calculer"));

        // Test en affichant le nom de la méthode "calculer"
        System.out.println(calculatrice.getCalculer().Getnom());
    }
}