/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smartravel.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import smartravel.entities.*;
import smartravel.util.Connexion;

/**
 *
 * @author Rami
 */
public class OffreDAO {
    
    
    public void insertOffre(Voyage v) throws SQLException {
       
      String requete= "INSERT INTO voyage VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
          
            System.out.println("xxxxxxxxxxx");
            ps.setInt(1,0);
            ps.setString(2, v.getMoyen_transport());
            ps.setString(3, v.getDestination());
            ps.setFloat(4, v.getBudget());
            ps.setInt(5, -1);
            ps.setString(6, null);
            ps.setString(7, null);
            ps.setDate(8, new java.sql.Date(v.getDate_depart().getTime()));
            ps.setDate(9,new java.sql.Date(v.getDate_retour().getTime()));
            ps.setInt(10, -1);
            ps.setString(11, "Offre");
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
    }
    
}
       
            
    
   
    

