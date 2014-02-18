/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smartravel.dao;
import smartravel.entities.Voyage;
/**
 *
 * @author Belgacem
 */
public class VoyageDAO {
   public void insertDepot(Voyage v) {

        String requete = "INSERT INTO Voyage VALUES (?)";
        try {
            PreparedStatement ps = connection.getInstance().prepareStatement(requete);
            ps.setString(1, d.getAdresse_depot());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }
    
}
