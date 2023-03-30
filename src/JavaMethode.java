public class JavaMethode extends APossedantUnNom implements IJavaMethode {

    // Attributs
    private String nom;


    // Constructeur
    public JavaMethode(String nom){
        this.nom = nom;
    }

    // Getter
    public String nom() {
        return nom;
    }

    // Surcharge
    @Override
    public void afficherNom() {
        System.out.println("==DEBUT MESSAGE \nnom de méthode : " + nom +"\n==FIN MESSAGE");
    }

    @Override
    public boolean appartientA(IJavaClasse saClasse) {
        return false;
    }
}
