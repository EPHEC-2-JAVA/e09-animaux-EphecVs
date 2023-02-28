package exercice_Salaire;

public class Manutentionnaire extends Employe{
    int heurePrestee;

    public Manutentionnaire(String prenom, String nom, int age, String dateDebut, int heure) {
        super(prenom, nom, age, dateDebut);
        this.heurePrestee = heure;
    }

    @Override
    double getSalaire() {
        return heurePrestee*65;
    }

    @Override
    public String getNom(){
        return "Manutentionnaire " + this.prenom + " " + this.nom;
    }
}
