package upo.cpo3;

/**
 * La classe principale des automates finis
 *
 */

public class AutomateFini {
    /** Etat de d�part de l'automate fini */
    private Etat etat_depart;
    /** Etat final de l'automate fini */
    private Etat etat_courant;
    /** L'automate est-il actif ? */
    private boolean active;
    /** L'automate est-il termin� ? */
    private boolean finish;


    public AutomateFini(Etat etat_depart) throws AFException {
    	// PREREQUIS : L'�tat de d�part doit �tre non nul
    	if(etat_depart==null)
    		throw new AFException("Etat de d�part nul");
    	// TRAITEMENTS
        this.etat_depart = etat_depart;
        this.etat_courant = etat_depart;
        active = false;
        finish = getEtatDepart().isTerminal();
      
    }
    
    public void start() throws AFException {
    	// PREREQUIS : la machine n'est pas d�j� d�marr�e
    	if(active)
    		throw new AFException("machine d�j� d�marr�e");

    	// TRAITEMENTS 
    	active = true;	
    	etat_courant = getEtatDepart();
    	finish = getEtatDepart().isTerminal();
    }

    public void step(Object entree) throws AFException {
        if(entree == null)
            throw new AFException("Erreur, l'entree est null");

        if(!active)
            throw new AFException("Erreur, machine active");

        Etat suivant = etat_courant.getSuivant(entree);

        if(suivant == null)
            throw new AFException("Erreur, etat suivant n'existe pas");

        // TRAITEMENTS
        etat_courant=suivant;
        finish = etat_courant.isTerminal();
   }

   public void stop() throws AFException {
       if(!isActive())
	   throw new AFException("Machine d�j� arr�t�e");
	   
       // TRAITEMENTS
       active = false;
   }
   
   public boolean isActive() {
       return active;
   }
  
   public boolean isFinish() {
       return finish;
   }
   
   public Etat getEtatDepart() {
       return etat_depart;
   }
    
   public Etat getEtatCourant() {
       return etat_courant;
   }
               
}
