

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
       
       String requete = "select * from administrateur where login=?";
       try{
        PreparedStatement ps;
        ps = Connexion.getInstance().prepareStatement(requete);
        ps.setString(1, login);       
               if(ps != null)
               System.out.println(" connexion établit ");
               System.out.println("xx"+login);
               ResultSet resultat = ps.executeQuery();
               Administrateur admin = new Administrateur();
        
        while (resultat.next()){
            
            admin.setLogin(resultat.getString(1));
            admin.setNom(resultat.getString(2));
            admin.setPrenom(resultat.getString(3));
            admin.setEmail(resultat.getString(4));
            admin.setPassword(resultat.getString(5));
          }
        return admin;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }
       }
    
    
    
}
