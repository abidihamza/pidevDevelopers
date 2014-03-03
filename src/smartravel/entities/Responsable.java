/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smartravel.entities;

/**
 *
 * @author Belgacem
 */
public class Responsable extends Compte{
  
    public String nom_agence ;
    public Number cin ;
    
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

    
}
