package upo.cpo5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by elodisam on 08/10/2015.
 */
public class Client {
    private  String nom;
    private List<Compte> comptes;


    public Client(String nom) {
        this.nom = nom;
        comptes = new ArrayList<Compte>();
    }

    public Client(String nom, List<Compte> comptes){
        this(nom);
        this.comptes = comptes;
    }

    public boolean add(Compte compte){
        return comptes.add(compte);
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        return nom.equals(client.nom);

    }

    @Override
    public int hashCode() {
        return nom.hashCode();
    }
}
