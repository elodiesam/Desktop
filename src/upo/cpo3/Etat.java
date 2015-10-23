package upo.cpo3;

import java.util.ArrayList;

/**
 * Un Etat d'automate fini
 * 

 */

public class Etat {
	  
  /** nom de l'�tat */
  private String nom;
  
  /** liste des transitions partant de cet �tat */
  private ArrayList<Transition> transitions;
  
  /** est-ce-que l'�tat est terminal ? */
  private boolean terminal;
  
  /** 
   * Constructeur principal 
   **/
  public Etat(String nom) {
	  this(nom,false);
  }
  
  /** 
   * Constructeur prot�g�  
  */

  protected Etat(String nom, boolean terminal) {
	  this.nom = nom;
	  this.transitions = new ArrayList<Transition>(	);
	  this.terminal = terminal;	 
  }
  

  /** retourne le nom de l'�tat */
  public String getNom() {
      return nom;
  }
  
  /** 
   * Chercher et retourner un �tat suivant
  */

  public Etat getSuivant(Object input) {
       for(int i=0;i<transitions.size();i++) {
           if(transitions.get(i).getEtiquette().equals(input))
              return transitions.get(i).franchir();
       }
       // si on ne peut franchir une transition
       // l'�tat suivant est null
       return null;
  }
  
  /** retourne true si c'est un �tat final, false sinon */
  public boolean isTerminal() {
	  return terminal;
  }
  
  /**
   * ajout d'une transition � l'�tat
  */
  public void addTransition(Transition trans) {      
	  transitions.add(trans);
  }
  
}
