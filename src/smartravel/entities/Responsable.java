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
public class Responsable {

    public String getNom_agence() {
        return nom_agence;
    }

    public Number getCin() {
        return cin;
    }
    
    public String nom_agence ;
    public Number cin ;
    
    public Responsable(){} 

    public void setNom_agence(String nom_agence) {
        this.nom_agence = nom_agence;
    }

    public void setCin(Number cin) {
        this.cin = cin;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Responsable other = (Responsable) obj;
        return true;
    }
    
    
    
}
