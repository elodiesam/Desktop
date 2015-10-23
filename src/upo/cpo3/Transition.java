package upo.cpo3;

/**
 * Created by elodisam on 01/10/2015.
 */
public class Transition {
    private Etat suivant;
    private String etiquette;

    private Transition (Etat suivant, String etiquette) throws TransitionException {
        if(etiquette == null){
            throw new TransitionException("Erreur, l'etiquette est null"){};
        }
        if(suivant == null){
            throw new TransitionException("Erreur, l'etat suivant est null"){};
        }
        this.suivant = suivant;
        this.etiquette = etiquette;
    }

    public String getEtiquette() {
        return etiquette;
    }

    public Etat franchir(){
        return suivant;
    }

}
