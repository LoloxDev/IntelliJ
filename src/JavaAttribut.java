public class JavaAttribut extends APossedantUnNom implements IJavaAttribut {

    protected String atribute;

    public String nom() {
        return atribute;
    }

    public void setAtribute(String atribute) {
        this.atribute = atribute;
    }

    public JavaAttribut(String atribute){
        this.atribute= atribute;
    }

    @Override
    public void afficherNom() {
        System.out.println("==DEBUT MESSAGE \nnom d'atribut : " + atribute +"\n==FIN MESSAGE");

    }

    @Override
    public boolean appartientA(IJavaClasse saClasse) {
        return false;
    }
}
