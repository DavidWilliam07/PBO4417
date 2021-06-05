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
    
    public void update() {
        if(!frame.getTxtNo().getText().trim().isEmpty()) {
            Pendaftaran b = new Pendaftaran();
            b.setNik(frame.getTxtNik().getText());
            b.setNama(frame.getTxtNama().getText());
            b.setJk(frame.getTxtJk().getSelectedItem().toString());
            b.setAlamat(frame.getTxtAlamat().getText());
            b.setUsia(Integer.parseInt(frame.getTxtUsia().getText()));
            b.setAlasan(frame.getTxtAlasan().getText());
            b.setNo(Integer.parseInt(frame.getTxtNo().getText()));
            implPendaftaran.update(b);
            JOptionPane.showMessageDialog(null, "Update Data sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih data yang akan diupdate");
        }
    }
    
    
    // berfungsi menghapus data yang dipilih
    public void delete() {
        if(!frame.getTxtNo().getText().trim().isEmpty()) {
            int no = Integer.parseInt(frame.getTxtNo().getText());
            implPendaftaran.delete(no);
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih data yang akan dihapus");
        }
    }
}
