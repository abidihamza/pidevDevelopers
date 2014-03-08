/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartravel.entities;

import java.util.Date;
import java.util.List;

/**
 *
 * @author MBM info
 */
public class facture {
  
    int id_facture;
    List<Voyageur> LV;
    Voyageur V;
    Reservation R;
    float somme_facture;
    Date date_payement_facture;

    public int getNumero_serie_facture() {
        return numero_serie_facture;
    }

    public void setNumero_serie_facture(int numero_serie_facture) {
        this.numero_serie_facture = numero_serie_facture;
    }
    int numero_serie_facture;
    

  

    public facture() {
    }
public facture(int id_facture, List<Voyageur> LV,Voyageur V,Reservation R, float somme_facture,int facture_reservation) {
        this.id_facture = id_facture;
        this.LV=LV;
        this.V=V;
        this.R=R;
        this.somme_facture = somme_facture;
        this.date_payement_facture = new Date();
    }
    public int getId_facture() {
        return id_facture;
    }

    public void setId_facture(int id_facture) {
        this.id_facture = id_facture;
    }

   public List<Voyageur> getListVoyageur()
   {return this.LV;}
   
   public void setListVoyageur(List<Voyageur> LV)
   {this.LV=LV;}

   public Voyageur getVoyageur()
{return this.V;}

   
   public void setVoyageur(Voyageur V)
   {
   this.V=V;
   }
   
   public Reservation getReservation()
   {
   return this.R;
   }
   public void setReservation(Reservation R)
   {
   this.R=R;
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

    
    
}
