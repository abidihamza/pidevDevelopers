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
  private int id_reservation;
   private String voyageur ;//tetbadel
   private String voyage;//tetbadel
   private String  date_reservation;
     
   public Reservation()
   {
   Date D=new Date();
   date_reservation=D.toString();
   }
   public Reservation(String voyageur,String voyage)
   {
   this.voyageur=voyageur;
   this.voyage=voyage;
   Date D=new Date();
   date_reservation=D.toString();
   }
  // public String getRef_R()
   //{return this.ref_reservation;}
   public int get_reservation()
   {
   return this.id_reservation;
   }
   public void set_reservation(int a)
   {
   this.id_reservation=a;
   }
   
   public String getVoyageur_R()
   {return this.voyageur;}
   
   public String getVoyage_R()
   {return this.voyage;}
   
   public String getDateReservation()
   {return this.date_reservation;}
   
 //  public void setref_R(String ref_R)
   //{this.ref_reservation=ref_R;}
   
   public void setVoyageur_R(String V)
   {this.voyageur=V;}
   
   public void setVoyage_R(String C)
   {this.voyage=C;}
   
   

   
   
} 
