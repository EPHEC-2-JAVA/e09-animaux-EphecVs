package exercice_Salaire;

public class Representant extends Vendeur {
    public Representant(String prenom, String nom, int age, String dateDebut, double chiffre) {
        super(prenom, nom, age, dateDebut, chiffre);
    }

    @Override
    double getSalaire() {
        return (chiffreAffaire/100*20)+800;
    }
    @Override
    public String getNom(){
        return "Représentant " + this.prenom + " " + this.nom;
    }
}
