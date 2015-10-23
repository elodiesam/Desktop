package upo.cpo4;

/**
 * Created by elodisam on 08/10/2015.
 */

public class ParcAttraction {
    private String nom;
    private int capacite;
    private double prixIllimite;
    private double prixIllimite5;
    private int vendu;
    private int billetIllimite;
    private int billetIllimite5;
    private int billetReduit;
    private int billetReduit5;

    public ParcAttraction(String nom, int capacite, double prixIllimite, double prixIllimite5, int vendu) {
        this.nom = nom;
        this.capacite = capacite;
        this.prixIllimite = prixIllimite;
        this.prixIllimite5 = prixIllimite5;
        this.vendu = vendu;
    }

    public double getPrixIllimite() {
        return prixIllimite;
    }

    public double getPrixIllimite5() {
        return prixIllimite5;
    }

    int nbPlacesDispo() {
        return capacite - (billetIllimite + billetIllimite5 + billetReduit + billetReduit5);
    }

    void vendreBillets(int nb, Tarif tarif) throws PlaceException {
        if (capacite < nb)
            throw new PlaceException("Erreur, Vente impossible") {
            };

    }
}



