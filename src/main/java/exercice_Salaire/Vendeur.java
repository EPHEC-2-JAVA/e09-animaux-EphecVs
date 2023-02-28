package exercice_Salaire;

public class Vendeur extends Employe {
    double chiffreAffaire;

    public Vendeur(String prenom, String nom, int age, String dateDebut, double chiffre) {
        super(prenom, nom, age, dateDebut);
        this.chiffreAffaire = chiffre;
    }

    @Override
    double getSalaire() {
        return (chiffreAffaire/100.*20.)+400.;
    }

    @Override
    public String getNom(){
        return "Vendeur " + this.prenom + " " + this.nom;
    }
}
