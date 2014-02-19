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
/**
 *
 * @author MBM info
 */
public class FactureDAO {
     public facture findFactureById(int id) {
        facture f = new facture();
        String requete = "select * from depot where id_depot=?";
        try {
            PreparedStatement ps = Connexion.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {
                f.setId_facture(resultat.getInt(1));
                f.setN_serie(resultat.getString(2));
                f.setSomme_facture(resultat.getFloat(3));
                f.setDate_payement_facture(resultat.getDate(4));
                f.setFacture_reservation(resultat.getInt(5));
            }
            return f;

        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot " + ex.getMessage());
            return null;
        }
    }
}
