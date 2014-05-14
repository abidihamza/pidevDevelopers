/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smartravel.gui;

import smartravel.dao.Annonce_voyageDAO;//agenceDAO
import smartravel.entities.Voyage;//edu.voyage.entities.Agence
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
//import smartravel.authResponsable;


public class AnnonceTableResume extends AbstractTableModel{
     String [] titres ={"destination","budget","date_depart","date_retour","moyen_transport","itineraire"};
     // String [] titres ={"id_voyage", "destination","budget","date_depart","date_retour","moyen_transport","itineraire","nb_place","programme"};
     //int voyage_responsable;    
    //List<Offre> offre=new ArrayList<Offre>();  
     List<Voyage> annonces=new ArrayList<Voyage>();
      
 
    
          
         

    public int getRowCount() {
        return annonces.size();
        
         
        
    }

     @Override
    public int getColumnCount() {
       return titres.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return annonces.get(rowIndex).getDestination();
            case 1: return annonces.get(rowIndex).getBudget();
            case 2: return annonces.get(rowIndex).getDate_depart();
            case 3: return annonces.get(rowIndex).getDate_retour();     
            case 4: return annonces.get(rowIndex).getMoyen_transport();
            case 5: return annonces.get(rowIndex).getItineraire();    
                    
            default :
                throw new IllegalArgumentException();
        }
    }
    public String getColumnName(int column)
    {
    return titres[column];
    
    }

    public AnnonceTableResume() {
  
     Annonce_voyageDAO adao = new Annonce_voyageDAO();
   //annonces= adao.DisplayAllOffreByID(ConnectAgence.getId_agence());
     annonces= adao.DisplayAllVoyage();
    
      }
    
}

