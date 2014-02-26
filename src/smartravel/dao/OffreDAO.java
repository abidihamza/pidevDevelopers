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
 * @author Rami
 */
public class OffreDAO {
    
    public void insertDepot(Voyage v) throws SQLException {
        String requete = "INSERT INTO Voyage VALUES (?)";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setString(2, v.getDestination());
            ps.setFloat(3, v.setBudget());
            ps.setDate(4, v.setDate_depart());
            ps.setDate(5, v.setDate_retour());
            ps.setString(6, v.setMoyen_transport());
            ps.setString(7, v.setProgramme());
             ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }
    
}
       
            
    
   
    

