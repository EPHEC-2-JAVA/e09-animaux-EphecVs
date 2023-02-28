package exercice_Salaire;

public class ManutARisque extends Manutentionnaire implements PrimeRisque {

    public ManutARisque(String prenom, String nom, int age, String dateDebut, int heure) {
        super(prenom, nom, age, dateDebut, heure);
    }

    @Override
    double getSalaire() {
        return heurePrestee*65 + PRIME_DE_RISQUE;
    }
}
