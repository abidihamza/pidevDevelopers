/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package smartravel.dao;
import smartravel.entities.facture;
import smartravel.util.Connexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import smartravel.entities.Reservation;
import smartravel.entities.Voyage;
import smartravel.entities.Voyageur;




/**
 *
 * @author MBM info
 */
public class FactureDAO {
    
    public List<Reservation> afficher_voyage (){
        List<Reservation> listeVoyage = new ArrayList<Reservation>();
        String requete = "select * from reservation ";
        try {
           Statement statement = Connexion.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                Reservation R =new Reservation();
                R.setVoyage_R(resultat.getString(3));
                listeVoyage.add(R);
            }
            return listeVoyage;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
	
     public List<Reservation> afficher_reservation (){
        List<Reservation> listeVoyage = new ArrayList<Reservation>();
        String requete = "select * from reservation ";
        try {
           Statement statement = Connexion.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                Reservation R =new Reservation();
                R.set_reservation(resultat.getInt(1));
                listeVoyage.add(R);
            }
            return listeVoyage;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
    
    public void insertFacture_voyage(facture F){
        int i=1;
        String requete = "insert into facture(id_facture,id_Voyage,id_voyageur,Montant,date_facturation) values (?,?,?,?)";
        try {
            
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
           ps.setInt(1, i);
           i++;
            ps.setString(2,F.get_idvoyage());    
            ps.setString(3,F.getIdVoyageur());
           ps.setInt(4,F.get_Montant());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    public List<Reservation> aff_Voyageur(String voyage)
    {
     List<Reservation> listeVoyageur = new ArrayList<Reservation>();

        String requete = "select * from reservation where id_voyage='"+voyage+"'";
        try {
           Statement statement = Connexion.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
                Reservation R =new Reservation();
                R.getVoyageur_R();

              listeVoyageur.add(R);
            }
            return listeVoyageur;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des stocks "+ex.getMessage());
            return null;
        }
    }
	
	
    
    
    public List<facture> DisplayAllfacture() {


        List<facture> listeFacture = new ArrayList<facture>();

        String requete = "select * from facture";
        try {
            Statement statement = Connexion.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {
                facture v = new facture();
                v.setNumero_serie_facture(resultat.getInt(2));
                v.setSomme_facture(resultat.getFloat(3));
                v.setDate_payement_facture(resultat.getDate(4));
              
                

                listeFacture.add(v);
            }
            return listeFacture;
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;
        }
    }
    
	
    
    
}