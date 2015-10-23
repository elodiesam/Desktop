package upo.cpo5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by elodisam on 08/10/2015.
 */
public class Compte {

    private String num;

    private List<Client> proprios;

    public Compte (String num){
        this.num = num;
        proprios = new ArrayList<Client>();
    }

    public boolean add(Client c2){
        return proprios.add(c2) && c2.add(this);
    }

    public Compte(String num, Client cli){
        this(num);
        proprios.add(cli);
        cli.add(this);
    }

    public String getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "num='" + num + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Compte compte = (Compte) o;

        return num.equals(compte.num);

    }

    @Override
    public int hashCode() {
        return num.hashCode();
    }
}
/*
package upo.cpo5;

        import java.util.ArrayList;
        import java.util.List;


public class Compte {
    private String num;

    private set<Client> proprios;

    public Compte (String num){
        this.num = num;
        proprios = new HashSet<Client>();
    }

    public Compte(String num, Client cli){
        this(num);
        proprios.add(cli);
        cli.add(this);
    }


    public boolean add(Client c2){
        return proprios.add(c2) && c2.add(this);
    }

}
*/