package exercice_Salaire;

public class TechnARisque extends Technicien implements PrimeRisque{

    public TechnARisque(String prenom, String nom, int age, String dateDebut, int production) {
        super(prenom, nom, age, dateDebut, production);
    }

    @Override
    double getSalaire() {
        return uniteProduit * 5 + PRIME_DE_RISQUE;
    }

}
