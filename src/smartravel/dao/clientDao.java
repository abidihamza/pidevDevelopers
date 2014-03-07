/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smartravel.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import smartravel.entities.Voyageur;
import smartravel.util.Connexion;

/**
 *
 * @author Belgacem
 */
public class clientDao {
    
    public Voyageur authentication(String mail ){
       
     String requete = "select * from voyageur where id_voyageur=? or nom = ? or prenom =? or  e_mail =?";
       try{
        PreparedStatement ps;
          ps = Connexion.getInstance().prepareStatement(requete);
          ps.setInt(1, 0);
          ps.setString(2, null);
          ps.setString(3, null);
          ps.setString(4, mail);
               if(ps!= null)
                System.out.println(" connexion établit ");
                ResultSet resultat = ps.executeQuery();
                Voyageur voy = new Voyageur();
        
        while (resultat.next()){
            voy.setNom(resultat.getString(2));
            voy.setPrenom(resultat.getString(3));
            voy.setEmail(resultat.getString(4));
            voy.setPassword(resultat.getString(5));
          }
        return voy;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
       }
      
}
