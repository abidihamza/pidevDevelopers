/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartravel.dao;

/**
 *
 * @author MBM info
 */
import smartravel.entities.Voyage;
import smartravel.util.Connexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class Proposition_voyageDAO {
   
    
    public List<Voyage> DisplayAllVoyage() {


        List<Voyage> listeVoyage = new ArrayList<Voyage>();

        String requete = "select * from voyage";
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
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;
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
}
