public class JavaObjet implements IJavaObjet {


    private String nom;

    public JavaObjet(String nom){
        this.nom = nom;
    }

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
