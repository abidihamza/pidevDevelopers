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
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @akrem
 */
public class Annonce_voyageDAO {
       
    public static int a;
        public void insertAnnonce(Voyage v) {

        String requete = "INSERT INTO Voyage VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
           //pour detecter System.out.println("xxxxxxxxxxx"); 
            ps.setInt(1, a); 
            ps.setString(2, v.getMoyen_transport()); 
            ps.setString(3, v.getDestination());
            ps.setFloat(4, v.getBudget());
            ps.setInt(5, v.getNb_place());
            ps.setString(6, v.getProgramme());
            ps.setString(7, v.getItineraire());
            ps.setDate(8, new java.sql.Date(v.getDate_depart().getTime()));
            ps.setDate(9,new java.sql.Date(v.getDate_retour().getTime()));

            ps.setInt(10, -1);
            ps.setString(11, "Annonce");

            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
        a=a+1;
    }
        
         public void updateAnnonce(Voyage v) {
        String requete = "update depot set moyen_transport=? ,destination=?, budget=?, nb_place=?, programme=?, itineraire=?, date_depart=?, date_retour=?, voyage_responsable=?  where id_voyage=?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setString(2, v.getMoyen_transport());
            ps.setString(3, v.getDestination());
            ps.setFloat(4, v.getBudget());
            ps.setInt(5, v.getNb_place());
            ps.setString(6, v.getProgramme());
            ps.setString(7, v.getItineraire());
            ps.setDate(8, new java.sql.Date(v.getDate_depart().getTime()));
            ps.setDate(9, new java.sql.Date(v.getDate_retour().getTime()));
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }
         
         public void deleteAnnonce(int num){

          String requete = "delete from stock where id_voyage=?";
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
         
             public Voyage findVoyageById(int id) {
        Voyage v = new Voyage();
        String requete = "select * from voyage where id_voyage=?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                v.setId_voyage(resultat.getInt(1));
                 v.setMoyen_transport(resultat.getString(2));
                v.setDestination(resultat.getString(3));
                v.setBudget(resultat.getFloat(4));
                v.setNb_place(resultat.getInt(5));
                v.setProgramme(resultat.getString(6));
                v.setItineraire(resultat.getString(7));
                v.setDate_depart(resultat.getDate(8));
                v.setDate_retour(resultat.getDate(9));
                v.setVoyage_responsable(resultat.getInt(10));
            }
            return v;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot " + ex.getMessage());
            return null;
        }
    }
             
      public List<Voyage> DisplayAllVoyage() {
        List<Voyage> listeVoyage = new ArrayList<Voyage>();
        String Montype="Annonce";
        String requete = " select * from voyage  where Type='"+Montype+"' ";
        try {
            Statement statement = Connexion.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                Voyage v = new Voyage();
                v.setMoyen_transport(resultat.getString(2));
                v.setDestination(resultat.getString(3));
                v.setBudget(resultat.getFloat(4));
                v.setNb_place(resultat.getInt(5));
                v.setProgramme(resultat.getString(6));
                v.setItineraire(resultat.getString(7));
                v.setDate_depart(resultat.getDate(8));
                v.setDate_retour(resultat.getDate(9));
                v.setVoyage_responsable(resultat.getInt(10));
                

                listeVoyage.add(v);
            }
            return listeVoyage;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des annonces " + ex.getMessage());
            return null;
        }
    }
         
   
}
