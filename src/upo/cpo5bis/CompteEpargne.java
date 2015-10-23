package upo.cpo5bis;

/**
 * Created by elodisam on 22/10/2015.
 */
public class CompteEpargne extends Compte {
    double plafondDepot=500;
    double capital;
    double creditMini=100;
    double tauxRemu=1.75;

    public CompteEpargne(Utilisateur user,double versement) throws VersementException{

        super(user);/* fais ref a la classe mere*/
        if(versement>plafondDepot){
            throw new VersementException("Erreur de versement, le plafond est de : "+plafondDepot+" euros.");

        }else if(versement<creditMini) {
            throw new VersementException("Erreur de versement, le plafond minimum est de : " + creditMini + " euros.");
        }else{

            this.capital = versement;
            this.setSolde(versement);
        }
    }

    public double getTauxRemu(int mois) {
        double taux;
        taux=mois*tauxRemu*this.getSolde();
        System.out.println("Votre taux est de : "+tauxRemu+" vous venez de gagner : "+taux+" votre nouveau solde est de : "+this.getSolde()+" euros.");
        return taux;
    }

    public Boolean retrait(double retrait){
        double solde=this.getSolde();
        Utilisateur user;
        if(solde-retrait<0){
            System.out.println("Erreur vous n'avez pas assez d'argent pour faire ce retrait. Votre solde est de : "+solde+" euros.");
            return false;
        }else if(solde-retrait<capital){
            user=this.getUser();
            user.deleteCompte(this);
            System.out.println("Vous avez retiré trop d'argent. Votre compte a ete supprime.");
            return true;
        }else {
            solde=solde-retrait;
            this.setSolde(solde);
            System.out.println("Votre nouveau solde est de : " + this.getSolde() + " euros.");
            return false;
        }
    }

    public void credit(double credit){
        if(credit<creditMini){
            System.out.println("Erreur votre somme est trop petite. Votre minimum de credit est de : "+creditMini+" euros.");
        }else{
            this.setSolde(this.getSolde()+credit);
            System.out.println("Votre nouveau solde est de : "+this.getSolde()+" euros.");
        }
    }
}

