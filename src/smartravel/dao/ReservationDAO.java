/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartravel.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import smartravel.entities.Reservation;
import smartravel.entities.Voyageur;
import smartravel.util.*;
/**
 *
 * @author wassou
 */
public class ReservationDAO {
  
     public void insertReservation(Reservation R){
int i=1;
        String requete = "insert into reservation(id_reservation,id_voyageur,id_voyage,date_reservation) values (?,?,?,?)";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
           ps.setInt(1, i);
       i++;    
//            ps.setString(2, R.getVoyageur_R());    
//            ps.setString(3, R.getVoyage_R());
//           ps.setString(4,R.getDateReservation());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
     
     /* public void SelectBonPlanByID(Reservation p) throws SQLException {
        String requete = "SELECT * FROM bon_plans";
       
        
            PreparedStatement state = Connexion.getInstance().prepareStatement(requete);
            ResultSet res = state.executeQuery();

            while (res.next()) {
              String reservation=res.getString(1);
              String voyage=res.getString(2);
              String voyageur=res.getString(3);
              String date=res.getString(4);
              int e=res.getInt(5);
             
               Reservation R =new Reservation(voyage,voyageur);
              
          List<Reservation> listeReservation = new ArrayList<Reservation>();    
                      
            listeReservation.add();
            }}*/
       public List<Reservation> DisplayAllBonPlan() {


        List<Reservation> maListe = new ArrayList<Reservation>();

        String requete = "select * from reservation";
        try {
            Statement statement = Connexion.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Reservation R = new Reservation();
                R.setVoyage_R(resultat.getString(2));
                R.setVoyageur_R(resultat.getString(3));
               


                maListe.add(R);
            }
            return maListe;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des BonPlans " + ex.getMessage());
            return null;
        }
    }
     
       
     public void deleteReservation(int num){

          String requete = "delete from reservation where id_reservation=?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setInt(1, num);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
        
    }
     
     
    
     
}
