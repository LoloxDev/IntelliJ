import java.util.Scanner;

public class Editeur {
    public static void main(String[] args) {

        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Saisissez le nom de la Classe");
        JavaClasse calculatrice = new JavaClasse(lectureClavier.nextLine());
        System.out.println("Saisissez la méthode");
        calculatrice.setAttributProtege(new JavaMethode(lectureClavier.nextLine()));
        System.out.println("Saisissez le type d'opération");
        JavaAttribut typeOperation = new JavaAttribut(lectureClavier.nextLine());
        calculatrice.afficherNom();
        calculatrice.getAttributProtege().afficherNom();
        typeOperation.afficherNom();
        System.out.println();
    }
}