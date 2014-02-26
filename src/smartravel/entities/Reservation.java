/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartravel.entities;

import java.util.Date;



/**
 *
 * @author wassou
 */
public class Reservation {
   String ref_reservation;
   Voyageur V ;
   Annonce C;
   Date date_reservation;
     
   public Reservation()
   {
       ref_reservation="";
   V=new Voyageur();
   C=new Annonce();
   date_reservation=new Date();
   }
   public Reservation(Voyageur V,Annonce C)
   {
   this.V=V;
   this.C=C;
   date_reservation=new Date();
   }
   public String getRef_R()
   {return this.ref_reservation;}
   
   public Voyageur getVoyageur_R()
   {return this.V;}
   
   public Annonce getAnnonce_R()
   {return this.C;}
   
   public Date getDateReservation()
   {return this.date_reservation;}
   
   public void setref_R(String ref_R)
   {this.ref_reservation=ref_R;}
   
   public void setVoyageur_R(Voyageur V)
   {this.V=V;}
   
   public void setAnnonce_R(Annonce C)
   {this.C=C;}
   
   public void setDateReservation(Date d)
   {this.date_reservation=d;}

   
   
} 
