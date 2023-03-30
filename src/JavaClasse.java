public class JavaClasse extends APossedantUnNom implements IJavaClasse {


    // Attributs
    private String nom;

    protected JavaMethode attributProtege;

    // Setter
    public void setAttributProtege(JavaMethode attributProtege) {
        this.attributProtege = attributProtege;
    }

    // Getter
    public JavaMethode getAttributProtege() {
        return attributProtege;
    }

    // Constructeur
    public JavaClasse(String nom){
        this.nom=nom;
    }

    // Getter
    public String nom() {
        return nom;
    }


    // Surcharges
    @Override
    public void afficherNom() {
        System.out.println("==DEBUT MESSAGE \nnom de classe : " + nom +"\n==FIN MESSAGE");
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
