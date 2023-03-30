import java.util.Scanner;

public class Editeur {
    public static void main(String[] args) {

        // On instance un Scanner.
        Scanner lectureClavier = new Scanner(System.in);

        // On récupère les saisies utilisateurs pour créer par la suite des instances.
        System.out.println("Saisissez le nom de la Classe");
        JavaClasse calculatrice = new JavaClasse(lectureClavier.nextLine());
        System.out.println("Saisissez la méthode");
        calculatrice.setAttributProtege(new JavaMethode(lectureClavier.nextLine()));
        System.out.println("Saisissez l'attribut");
        JavaAttribut typeOperation = new JavaAttribut(lectureClavier.nextLine());

        // On affiche le nom, méthode et l'attribut via des méthodes définis dans les class.
        calculatrice.afficherNom();
        calculatrice.getAttributProtege().afficherNom();
        typeOperation.afficherNom();
        System.out.println();
    }
}