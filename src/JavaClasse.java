public class JavaClasse implements IJavaClasse{

    private String nom;
    protected JavaMethode calculer;

    public JavaClasse(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public JavaMethode getCalculer() {
        return calculer;
    }

    public void setCalculer(JavaMethode calculer) {
        this.calculer = calculer;
    }

    public static class JavaMethode {
        private String nom;

        public JavaMethode(String nom) {
            this.nom = nom;
        }

        public String Getnom() {
            return nom;
        }
    }

}
