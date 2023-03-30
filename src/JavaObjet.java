public class JavaObjet implements IJavaObjet {


    // Attributs
    private String nom;

    // Constructeur
    public JavaObjet(String nom){
        this.nom = nom;
    }

    // Getter
    public String nom() {
        return nom;
    }

    @Override
    public boolean estUneInstanceDe(IJavaClasse saClasse) {
        return false;
    }

    @Override
    public String nomDeClasse() {
        return null;
    }
}
