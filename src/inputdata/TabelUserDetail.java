/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inputdata;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dynastymasra
 */
public class TabelUserDetail extends AbstractTableModel {
    private List<UserDetail> list = new ArrayList<UserDetail>();
    
    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 8;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0 : return list.get(rowIndex).getNip();
            case 1 : return list.get(rowIndex).getNama();
            case 2 : return list.get(rowIndex).getTtl();
            case 3 : return list.get(rowIndex).getJenis();
            case 4 : return list.get(rowIndex).getGolongan();
            case 5 : return list.get(rowIndex).getGaji();
            case 6 : return list.get(rowIndex).getTelpon();
            case 7 : return list.get(rowIndex).getEmail();
            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
       switch(column) {
           case 0 : return "NIP";
           case 1 : return "NAMA";
           case 2 : return "TTL";
           case 3 : return "JENIS KELAMIN";
           case 4 : return "GOLONGAN";
           case 5 : return "GAJI";
           case 6 : return "NO. TELPON";
           case 7 : return "EMAIL";
           default : return null;
       }
    }
   
    public void add(UserDetail userDetail) {
       list.add(userDetail);
       fireTableRowsInserted(getRowCount(), getColumnCount());
    }
    public void delete(int i, int row) {
       list.remove(i);
       fireTableRowsDeleted(i, row);
    }
    public UserDetail get(int row) {
       return (UserDetail) list.get(row);
    }
}
