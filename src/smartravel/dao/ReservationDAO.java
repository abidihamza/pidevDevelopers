/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartravel.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import smartravel.entities.Reservation;
import smartravel.entities.Voyageur;
import smartravel.util.*;
/**
 *
 * @author wassou
 */
public class ReservationDAO {
    
     public void insertDepot(Reservation R){

        String requete = "insert into Reservation (id_Voyageur,id_Annonce,date_reservation) values (?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, R.getVoyageur_R().toString());
            ps.setString(2, R.getAnnonce_R().toString());
            ps.setDate(3, (Date) R.getDateReservation());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
     
     
     public void updateDepot(Reservation R){
        String requete = "update depot set id_Voyageur= ? id_Annonce=?,date_reservation=? where id_Reservation=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,  R.getVoyageur_R().toString());
            ps.setString(2, R.getAnnonce_R().toString());
            ps.setDate(3, (Date) R.getDateReservation());
            ps.setString(4, R.getRef_R());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
     
     public void deleteReservation(int num){

          String requete = "delete from reservation where id_reservation=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, num);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
        
    }
     
     
    
     
}
