package upo.cpo2;

/**
 * Created by elodisam on 01/10/2015.
 */
public class Employe {
    private final String nom;
    private double salaire;
    private double nbHeures;


    private Employe (String nom, double salaire, double nbHeures) {
        this.nom = nom;
        this.salaire = salaire;
        this.nbHeures = nbHeures;
    }

    /*public Employe (int nbHeures, double salaireBase) throws GestionException{
    *   if(salaireBase < 10.7)
    *       throws new GestionException("salaire de base illégale");    *
    * }
    *
    * Lever des exceptions à vérfier
    *
    * public static void main(String [] args){
    *   try{
    *       Employe e = new Employe(60, 8.4);
    *   }
    *   catch(GestionException ge){
    *       ge.printStackTrace();
        }
    * }
    * */

    public static Employe InstancierEmploye(String nom, double salaire, double nbHeures){
        Employe e;
        if (salaire < 13 || nbHeures > 60){
            System.out.println("Impossible d'embaucher cet employe");
            return null;
        }

        e = new Employe(nom, salaire, nbHeures);

        return e;

    }

    public double SalaireHebdomadaire(){
        if (nbHeures <= 40)
            return salaire * nbHeures;

        else if (nbHeures> 40 && nbHeures <= 60)
            return (1.5 * nbHeures) * salaire;

        else
            return -1;
    }

}
