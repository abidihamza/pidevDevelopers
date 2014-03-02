

package smartravel.dao;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import smartravel.entities.Administrateur;
import smartravel.util.Connexion;


public class AdminDAO {
  
    
    public AdminDAO(){
            
  }
        public Administrateur authentication(String login ){
       
        String requete = "select * from administrateur where login ='admin'";
       try{
        PreparedStatement ps;
          ps = Connexion.getInstance().prepareStatement(requete);
               
               if(ps != null)
               System.out.println(" connexion établit ");
        ResultSet resultat = ps.executeQuery();
        Administrateur admin = new Administrateur();
        
        while (resultat.next()){
            admin.setLogin(resultat.getString(2));
            admin.setNom(resultat.getString(3));
            admin.setPrenom(resultat.getString(4));
            admin.setEmail(resultat.getString(5));
            admin.setPassword(resultat.getString(6));
          }
        return admin;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
       }
    
    
    
}
