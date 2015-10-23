package upo.cpo1;

/**
 * Created by Pacôme on 24/09/2015.
 * Definit le model de cinema

public final class SalleCinema{

    private String film;
    private double tarif;
    private final int capacite;

    public SalleCinema(String film, int capacite, double tarif){
        this.film = film;
        this.capacite = capacite;
        this.tarif = tarif;
    }

    public double getTarif(){
        return tarif;
    }
    public double getFilm(){
        return film;
    }
    public double getCapacite(){
        return capacite;
    }


    public void setFilm(String film) {
        this.film = film;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    @java.lang.Override
    public java.lang.String toString() {
        final java.lang.StringBuilder sb = new java.lang.StringBuilder("SalleCinema{");
        sb.append("film='").append(film).append('\'');
        sb.append(", tarif=").append(tarif);
        sb.append(", capacite=").append(capacite);
        sb.append('}');
        return sb.toString();
    }
}
*/
public class SalleCinema {
    private String film;
    private int nbPlaces;
    private int tarif;
    private int nbPlacesVendues;

    public SalleCinema (String film, int capacite, int prix) {
        this.film = film;
        nbPlaces = capacite;
        tarif = prix;
        nbPlacesVendues = 0;
    }

    public void vendrePlace () {
        nbPlacesVendues++;
    }

    public double tauxRemplissage () {
        return (double)nbPlacesVendues/(double)nbPlaces;
    }

    public double chiffreAffaires () {
        return nbPlacesVendues * tarif;
    }

    public boolean estPlein() {
        return (nbPlacesVendues == nbPlaces);
    }

    public int nbPlacesDisponibles() {
        return nbPlaces - nbPlacesVendues;
    }

    public String toString () {
        return "Film Projete: " + film + "\nTarif: " + tarif + "\nNombre de places :" + nbPlaces +
                "\nTaux de remplissage: " + this.tauxRemplissage() + "\nChiffre d'Affaire: " + this.chiffreAffaires();

    }
}