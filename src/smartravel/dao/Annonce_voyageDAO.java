/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smartravel.dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import smartravel.entities.Voyage;
import smartravel.util.Connexion;
/**
 *
 * @author Belgacem
 */
public class Annonce_voyageDAO {
       
        public void insertDepot(Voyage v) {

        String requete = "INSERT INTO Voyage VALUES (?)";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setString(2, v.getMoyen_transport()); 
            ps.setString(3, v.getDestination());
            ps.setFloat(4, v.getBudget());
            ps.setInt(5, v.getNb_place());
            ps.setString(6, v.getProgramme());
            ps.setString(7, v.getItineraire());
            ps.setDate(8, v.getDate_depart());
            ps.setDate(9, v.getDate_retour());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }
   
}
