/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author ROG STRIX G
 */
public class TabelModelPendaftaran extends AbstractTableModel {
    List<Pendaftaran> peserta;
    
    public TabelModelPendaftaran(List<Pendaftaran> peserta) {
        this.peserta = peserta;
    }
    
    // Override
    public int getColumnCount() {
        return 7;
    }
    
    public int getRowCount() {
        return peserta.size();
    }
    
    public String getColumnName(int column) {
        switch (column) {
            case 0 :
                return "no";
            case 1 :
                return "nik";
            case 2 : 
                return "nama";
            case 3 : 
                return "kelamin";
            case 4 : 
                return "alamat";
            case 5 : 
                return "usia";
            case 6 : 
                return "alasan";
            default : 
                return null;
        }
    }
    
    // Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0 :
                return peserta.get(row).getNo();
            case 1 :
                return peserta.get(row).getNik();
            case 2 : 
                return peserta.get(row).getNama();
            case 3 : 
                return peserta.get(row).getJk();
            case 4 : 
                return peserta.get(row).getAlamat();
            case 5 : 
                return peserta.get(row).getUsia();
            case 6 : 
                return peserta.get(row).getAlasan();
            default : 
                return null;
        }
    }
}
