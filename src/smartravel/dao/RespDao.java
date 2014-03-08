/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smartravel.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import smartravel.entities.Responsable;
import smartravel.util.Connexion;

/**
 *
 * @author Belgacem
 */
public class RespDao {
    
   
    
    public RespDao(){}
    
    
        public Responsable authentication(String mail) {

        String requete;
        requete = "select * from respo_agence where id_responsable=? or nom=? or prenom=? or CIN=? or e_mail=?";
       try{
        PreparedStatement ps;
          ps = Connexion.getInstance().prepareStatement(requete);
           System.out.println("xxxxxx");
          ps.setInt(1, 0);
          ps.setString(2, null);
          ps.setString(3, null);
          ps.setInt(4,0);
          ps.setString(5, mail);
          
             
                ResultSet resultat = ps.executeQuery();
                Responsable rsp = new Responsable();
        
        while (resultat.next()){
            rsp.setNom(resultat.getString(2));
            System.out.println(resultat.getString(2));
            rsp.setPrenom(resultat.getString(3));
            rsp.setCin(resultat.getInt(4));
            rsp.setEmail(resultat.getString(5));
            rsp.setPassword(resultat.getString(6));
          }
        return rsp;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }          
    }
    
    public void insertAgence(Responsable rsp){
         
        String requete = "INSERT INTO respo_agence VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            System.out.println("xxxxxxxxxxxxxxxxxxxxx");
            ps.setInt(1,0);
            ps.setString(2, rsp.getNom()); 
            ps.setString(3, rsp.getPrenom());
            ps.setInt(4, (int) rsp.getCin());
            ps.setString(5,rsp.getEmail());
            ps.setString(6,rsp.getPassword());
           
            ps.setDate(7,null);
            ps.setString(8,rsp.getNom_agence());
            ps.setBoolean(9,false);
            ps.setString(10, rsp.getCommentaire());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        } 
    }
    
    public void deleteAgence(Responsable rsp){

          String requete = "delete from respo_agence where e_mail=?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setString(4,rsp.getEmail());
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
    
     public List<Responsable> DisplayAllRespo (){


        List<Responsable> listResp = new ArrayList<Responsable>();

        String requete = "select * from Responsable";
        try {
           Statement statement = Connexion.getInstance().createStatement();
            
           ResultSet resultat = statement.executeQuery(requete);
         
           while(resultat.next()){
                Responsable rsp = new Responsable();
             
                rsp.setNom(resultat.getString(2));
                rsp.setPrenom(resultat.getString(3));
                rsp.setEmail(resultat.getString(4));
                rsp.setPassword(resultat.getString(5));
                rsp.setDate_inscrip(resultat.getDate(6));
                rsp.setNom_agence(resultat.getString(7));

                listResp.add(rsp);
            }
            return listResp;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des données "+ex.getMessage());
            return null;
        }
    }



    
}
