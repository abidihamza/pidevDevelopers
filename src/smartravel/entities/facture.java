/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartravel.entities;

import java.sql.Date;

/**
 *
 * @author MBM info
 */
public class facture {
    int id_facture;
    String n_serie;
    float somme_facture;
    Date date_payement_facture;

    public int getId_facture() {
        return id_facture;
    }

    public void setId_facture(int id_facture) {
        this.id_facture = id_facture;
    }

    public String getN_serie() {
        return n_serie;
    }

    public void setN_serie(String n_serie) {
        this.n_serie = n_serie;
    }

    public float getSomme_facture() {
        return somme_facture;
    }

    public void setSomme_facture(float somme_facture) {
        this.somme_facture = somme_facture;
    }

    public Date getDate_payement_facture() {
        return date_payement_facture;
    }

    public void setDate_payement_facture(Date date_payement_facture) {
        this.date_payement_facture = date_payement_facture;
    }

    public facture(int id_facture, String n_serie, float somme_facture, Date date_payement_facture) {
        this.id_facture = id_facture;
        this.n_serie = n_serie;
        this.somme_facture = somme_facture;
        this.date_payement_facture = date_payement_facture;
    }
    
}
