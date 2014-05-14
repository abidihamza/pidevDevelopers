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
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
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
                System.out.println("connexion établit ");
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
        }}
       
      public void insertClient(Voyageur voy) {
    
        String requete = "INSERT INTO voyageur VALUES (?,?,?,?,?,?) ";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            System.out.println("xxxxxxxxxxxxxxxxxxxxx");
            ps.setInt(1,0);
            ps.setString(2, voy.getNom()); 
            ps.setString(3, voy.getPrenom());
            ps.setString(4, voy.getEmail());
            ps.setString(5,voy.getPassword());
            GregorianCalendar gc = new GregorianCalendar();
            Date d = null ;
//            d.setMonth(gc.MONTH);
//            d.setYear(gc.YEAR);
//            d.setDate(gc.DAY_OF_MONTH);
//                    
            ps.setDate(6, (java.sql.Date) d);
                                 
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        } 
    }
    
      public Voyageur selectByName(String nom) {

        String requete;
        requete = "select * from voyageur where nom ='"+nom+"'";
       try{
        Statement statement = Connexion.getInstance().createStatement();
         
           ResultSet resultat = statement.executeQuery(requete);
           System.out.println("yyyyy");
       Voyageur voy = new Voyageur();
        
        while (resultat.next()){
            voy.setNom(resultat.getString(2));
            voy.setPrenom(resultat.getString(3));
            voy.setEmail(resultat.getString(5));
            
          }
        return voy;
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
            return null;
        }          
    }
       
        
    
    public void deleteClient(String name){

          String requete = "delete from voyageur where nom ='"+name+"'";
        try {
           Statement ps = Connexion.getInstance().createStatement();
        
            ps.executeUpdate(requete);
            System.out.println("Suppression effectuée avec succès");
     } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
       
        public List<Voyageur> DisplayAllVoy (){


        List<Voyageur> listVoy = new ArrayList<Voyageur>();

        String requete = "select * from voyageur";
        try {
           Statement statement = Connexion.getInstance().createStatement();
            
           ResultSet resultat = statement.executeQuery(requete);
         
           while(resultat.next()){
                Voyageur v = new Voyageur();
             
                v.setNom(resultat.getString(2));
                v.setPrenom(resultat.getString(3));
                v.setEmail(resultat.getString(4));
                v.setPassword(resultat.getString(5));
                v.setDate_inscrip(resultat.getDate(6));
                
                listVoy.add(v);
            }
            return listVoy;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des données "+ex.getMessage());
            return null;
        }
       
       
       }}
      

