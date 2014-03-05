/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smartravel.entities;

import java.util.logging.Logger;

/**
 *
 * @author Belgacem
 */
public class Responsable extends Compte{
  
    public String nom_agence ;
    public Number cin ;
    public boolean activated = false ;
    public String commentaire;
    public Responsable(){
    }
    public Responsable(String nom,Number cin){
        this.nom_agence = nom;
        this.cin=cin;
    } 
    
  public String getNom_agence() {
        return nom_agence;
    }

    public Number getCin() {
        return cin;
    }
    public void setNom_agence(String nom_agence) {
        this.nom_agence = nom_agence;
     }

    public void setCin(Number cin) {
        this.cin = cin;
     }

    public boolean isActivated() {
        return activated;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    
}
