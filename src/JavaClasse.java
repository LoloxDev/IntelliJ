public class JavaClasse extends APossedantUnNom implements IJavaClasse {

    private String nom;




    protected JavaMethode attributProtege;
    public void setAttributProtege(JavaMethode attributProtege) {
        this.attributProtege = attributProtege;
    }

    public JavaClasse(String nom){
        this.nom=nom;
    }

    public String nom() {
        return nom;
    }

    @Override
    public void afficherNom() {

    }


    @Override
    public boolean contientObjet(IObjet iobjet) {
        return false;
    }

    @Override
    public IObjet construitObjet() {
        return null;
    }
}
