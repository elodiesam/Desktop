package upo.cpo5;

/**
 * Created by elodisam on 08/10/2015.
 */
public class Main {
    public static void main(String[] args) {
        Client c1 = new Client("Pierre Dupont");
        Client c2 = new Client("Laure Dupont");
        //Client c3 = new Client("Laure Dupont");

        Compte cp1 = new Compte("fdgffdg5", c1);
        cp1.add(c2);
        //cp1.add(c3);

        Banque banque = new Banque();
        banque.add(cp1);

        System.out.println(cp1);

    }
}
