package exercice_Salaire;

import java.util.ArrayList;
import java.util.List;

public class Personnel {
    List<Employe> employes = new ArrayList<>();

    public void ajouterEmploye(Employe e){
        employes.add(e);
    }

    public void afficherSalaires(){
        for (Employe e : employes){
            System.out.println(e.getNom() + " gagne " + e.getSalaire() + " EUR");
        }
    }

    public double salaireMoyen(){
        double total = 0;
        for (Employe e : employes){
            total += e.getSalaire();
        }
        return total/employes.size();
    }
}
