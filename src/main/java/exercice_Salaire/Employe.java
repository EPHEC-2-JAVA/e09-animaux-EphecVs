package exercice_Salaire;

abstract class Employe {
    String prenom,nom;
    int age;
    String dateDebutService;

    public Employe(String prenom, String nom, int age, String dateDebut){
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.dateDebutService = dateDebut;
    }

    abstract double getSalaire();
    public String getNom(){
        return "L'Employé·e " + this.prenom + " " + this.nom;
    }
}
