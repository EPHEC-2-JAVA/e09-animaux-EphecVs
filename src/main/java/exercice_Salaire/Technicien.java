package exercice_Salaire;

public class Technicien extends Employe{
    int uniteProduit;

    public Technicien(String prenom, String nom, int age, String dateDebut, int production) {
        super(prenom, nom, age, dateDebut);
        this.uniteProduit = production;
    }

    @Override
    double getSalaire() {
        return uniteProduit * 5;
    }
    @Override
    public String getNom(){
        return "Technicien " + this.prenom + " " + this.nom;
    }
}
