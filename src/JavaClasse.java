public class JavaClasse extends APossedantUnNom implements IJavaClasse {



    private String nom;




    protected JavaMethode attributProtege;
    public void setAttributProtege(JavaMethode attributProtege) {
        this.attributProtege = attributProtege;
    }
    public JavaMethode getAttributProtege() {
        return attributProtege;
    }
    public JavaClasse(String nom){
        this.nom=nom;
    }

    public String nom() {
        return nom;
    }

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
