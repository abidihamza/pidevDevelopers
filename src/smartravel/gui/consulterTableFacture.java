/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartravel.gui;
import smartravel.dao.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import smartravel.dao.Proposition_voyageDAO;
import smartravel.entities.facture;

/**
 *
 * @author MBM info
 */
public class consulterTableFacture  extends 
      AbstractTableModel {
  




/**
 *
 * @author MBM info
 */

    String columntab[]={"numero de serie","date de payement","somme de facture"};
List<facture>l;
//List<Voyage> filterList = new ArrayList<Voyage>();
    public consulterTableFacture (){
       FactureDAO p=new FactureDAO();
        
        l=p.DisplayAllfacture();
    }

    public String getColumnName(int column){
    
        
        return columntab[column];
    }
    
    public void filterData(String ville){
        //filterList = new Proposition_voyageDAO().findVoyageByDestination(ville);
        //System.out.println(filterList.size());
    }

    @Override
    public int getRowCount() {
        
        return l.size();
       
           
    }

    @Override
    public int getColumnCount() {
return columntab.length;    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        List<facture> listRet;
        
       
            listRet = l;
        
        switch (columnIndex){
            case 0:
                return listRet.get(rowIndex).getNumero_serie_facture();
            case 1:
                return listRet.get(rowIndex).getDate_payement_facture();
            case 2:
                return listRet.get(rowIndex).getSomme_facture();
            
            default:
                        return null;
        
        
        
        
        
        
        }
    }
    
}


