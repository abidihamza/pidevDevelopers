/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smartravel.gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.table.AbstractTableModel;
import smartravel.dao.Proposition_voyageDAO;
import smartravel.entities.Voyage;


/**
 *
 * @author MBM info
 */
public class ConsulterPropositionsTable extends 
      AbstractTableModel {
    String columntab[]={"destination","budget","date de depart","date d'arrivée"};
List<Voyage>l;
List<Voyage> filterList = new ArrayList<Voyage>();
    public ConsulterPropositionsTable() {
        Proposition_voyageDAO p=new Proposition_voyageDAO();
        
        l=p.DisplayAllVoyage();
    }

    public String getColumnName(int column){
    
        
        return columntab[column];
    }
    
    public void filterData(String ville){
        filterList = new Proposition_voyageDAO().findVoyageByDestination(ville);
        //System.out.println(filterList.size());
    }

    @Override
    public int getRowCount() {
        if(filterList.size()==0)
        return l.size();
        else
            return filterList.size();
    }

    @Override
    public int getColumnCount() {
return columntab.length;    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        List<Voyage> listRet;
        if(filterList.size()>0){
            listRet = filterList;
        }
        else{
            listRet = l;
        }
        switch (columnIndex){
            case 0:
                return listRet.get(rowIndex).getDestination();
            case 1:
                return listRet.get(rowIndex).getBudget();
            case 2:
                return listRet.get(rowIndex).getDate_depart();
            case 3:
                return listRet.get(rowIndex).getDate_retour();
            default:
                        return null;
        
        
        
        
        
        
        }
    }
    
}
