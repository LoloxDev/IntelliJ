public class JavaMethode extends APossedantUnNom implements IJavaMethode {

    private String nom;


    public JavaMethode(String nom){
        this.nom = nom;
    }

    public String nom() {
        return nom;
    }

    @Override
    public void afficherNom() {
        System.out.println("==DEBUT MESSAGE \nnom de méthode : " + nom +"\n==FIN MESSAGE");
    }

    @Override
    public boolean appartientA(IJavaClasse saClasse) {
        return false;
    }
}
