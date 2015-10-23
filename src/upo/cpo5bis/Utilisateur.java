package upo.cpo5bis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by elodisam on 22/10/2015.
 */
public class Utilisateur {
    private String nom;
    private static int numGen;
    private int num;
    private ArrayList<Compte> comptes;
    private boolean etat;

    public Utilisateur(String nom, boolean etat){
        this.nom=nom;
        numGen++;
        this.num=numGen;
        this.etat=etat;
    }

    public void addCompte(Compte compte){
        if(this.etat==false)
            this.comptes.add(compte);
        else
            System.out.println("Error ! Un admin ne peut avoir de compte.");
    }
    public void deleteCompte(Compte compte){
        int index;
        index=this.comptes.indexOf(compte);
        this.comptes.remove(index);
    }

    public String getNom() {
        return nom;
    }

    public int getNum() {
        return num;
    }

    public boolean getEtat(){
        return etat;
    }

    public ArrayList<Compte> getCompte() {
        return comptes;
    }

}
