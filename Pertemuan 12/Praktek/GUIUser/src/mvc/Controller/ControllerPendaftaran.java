/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import java.util.List;
import javax.swing.JOptionPane;

import mvc.DAO.DAOPendaftaran;
import mvc.DAOInterface.IPendaftaran;
import mvc.Model.Pendaftaran;
import mvc.Model.TabelModelPendaftaran;
import mvc.View.FormPendaftaran;
/**
 *
 * @author ROG STRIX G
 */
public class ControllerPendaftaran {
    FormPendaftaran frame;
    IPendaftaran implPendaftaran;
    List<Pendaftaran> peserta;
    
    public ControllerPendaftaran(FormPendaftaran frame) {
        this.frame = frame;
        implPendaftaran = new DAOPendaftaran();
        peserta = implPendaftaran.getAll();
    }
    
    public void reset() {
        frame.getTxtNo().setText("");
        frame.getTxtNik().setText("");
        frame.getTxtNama().setText("");
        frame.getTxtJk().setSelectedItem("");
        frame.getTxtAlamat().setText("");
        frame.getTxtUsia().setText("");
        frame.getTxtAlasan().setText("");
    }
    
    public void isiTable() {
        peserta = implPendaftaran.getAll();
        TabelModelPendaftaran tmb = new TabelModelPendaftaran(peserta);
        frame.getTabelData().setModel(tmb);
    }
    
    public void isiField(int row) {
        frame.getTxtNo().setText(peserta.get(row).toString());
        frame.getTxtNik().setText(peserta.get(row).getNik());
        frame.getTxtNama().setText(peserta.get(row).getNama());
        frame.getTxtJk().setSelectedItem(peserta.get(row).getJk());
        frame.getTxtAlamat().setText(peserta.get(row).getAlamat());
        frame.getTxtUsia().setText(peserta.get(row).toString());
        frame.getTxtAlasan().setText(peserta.get(row).getAlasan());
    }
    
    public void insert() {
        Pendaftaran b = new Pendaftaran();
        b.setNo(Integer.parseInt(frame.getTxtNo().getText()));            
        b.setNik(frame.getTxtNik().getText());
        b.setNama(frame.getTxtNama().getText());
        b.setJk(frame.getTxtJk().getSelectedItem().toString());
        b.setAlamat(frame.getTxtAlamat().getText());
        b.setUsia(Integer.parseInt(frame.getTxtUsia().getText()));
        b.setAlasan(frame.getTxtAlasan().getText());
        implPendaftaran.insert(b);
        JOptionPane.showMessageDialog(null, "Simpan Data sukses");
    }
}
