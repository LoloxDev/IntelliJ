public class JavaMethode implements IJavaMethode {

    private String nom;


    public JavaMethode(String nom){
        this.nom = nom;
    }

    public String nom() {
        return nom;
    }

    @Override
    public boolean appartientA(IJavaClasse saClasse) {
        return false;
    }
}
