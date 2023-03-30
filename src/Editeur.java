public class Editeur {
    public static void main(String[] args) {
        JavaClasse calculatrice = new JavaClasse("calculatrice");
       calculatrice.setAttributProtege(new JavaMethode("calculer"));
        System.out.println("Hello world!");
    }
}