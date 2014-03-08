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
import smartravel.entities.Voyage;
/**
 *
 * @author MBM info
 */
public class FactureDAO {
    
    
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

