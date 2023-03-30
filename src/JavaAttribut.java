public class JavaAttribut extends APossedantUnNom implements IJavaAttribut {

    protected String atribute;


    // Getter
    public String nom() {
        return atribute;
    }


    // Setter
    public void setAtribute(String atribute) {
        this.atribute = atribute;
    }


    // Constructeur
    public JavaAttribut(String atribute){
        this.atribute= atribute;
    }


    // Surcharge
    @Override
    public void afficherNom() {
        System.out.println("==DEBUT MESSAGE \nnom d'atribut : " + atribute +"\n==FIN MESSAGE");

    }

    @Override
    public boolean appartientA(IJavaClasse saClasse) {
        return false;
    }
}
