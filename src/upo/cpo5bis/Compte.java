package upo.cpo5bis;

/**
 * Created by elodisam on 22/10/2015.
 */
public class Compte {
    private static int numGen=0;
    private int num;
    private Utilisateur user;
    private double solde = 0;

    public Compte( Utilisateur user) {
        numGen++;
        this.num = numGen;
        this.user = user;
        user.addCompte(this);
    }



    public int getNum() {
        return num;
    }

    public Utilisateur getUser() {
        return user;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}

