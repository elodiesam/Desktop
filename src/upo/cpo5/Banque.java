package upo.cpo5;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by elodisam on 08/10/2015.
 */
public final class Banque {
    private Map<String, Compte> comptes; //à un numéro de compte associe le compte

    public Banque(){
        comptes = new HashMap<String, Compte>();
    }

    public Compte add(Compte cp){
        return comptes.put(cp.getNum(), cp);
    }

    @Override
    public String toString() {
        return "Banque{" +
                "comptes=" + comptes +
                '}';
    }
}
