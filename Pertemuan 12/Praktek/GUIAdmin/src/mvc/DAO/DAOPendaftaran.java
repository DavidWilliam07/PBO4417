/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAO;

import mvc.Koneksi.Koneksi;
import mvc.Model.Pendaftaran;
import mvc.DAOInterface.IPendaftaran;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ROG STRIX G
 */
public class DAOPendaftaran implements IPendaftaran {
    Connection connection;
    final String update = "UPDATE tbl_pendaftaran set nik = ?, nama = ?, jk = ?, alamat = ?, usia = ?, alasan = ? where no = ? ; ";
    final String delete = "DELETE FROM tbl_pendaftaran where no = ? ;";
    final String select = "SELECT * FROM tbl_pendaftaran;";
    
    public DAOPendaftaran(){
        connection = Koneksi.connection();
    }
    
    public void update(Pendaftaran b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            statement.setString(1, b.getNik());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJk());
            statement.setString(4, b.getAlamat());
            statement.setInt(5, b.getUsia());
            statement.setString(6, b.getAlasan());
            statement.setInt(7, b.getNo());
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Berhasil Update");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Input");
            }
        }
    }
    
    public void delete(int no) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1, no);
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Berhasil Delete");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Delete");
            }
        }
    }
    
    public List<Pendaftaran> getAll() {
        List<Pendaftaran> peserta = null;
        try {
            peserta = new ArrayList<Pendaftaran>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                Pendaftaran b = new Pendaftaran();
                b.setNo(rs.getInt("no"));
                b.setNik(rs.getString("nik"));
                b.setNama(rs.getString("nama"));
                b.setJk(rs.getString("jk"));
                b.setAlamat(rs.getString("alamat"));
                b.setUsia(rs.getInt("usia"));
                b.setAlasan(rs.getString("alasan"));
                peserta.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPendaftaran.class.getName()).log(Level.SEVERE, null, ex);
        }
        return peserta;
    }
}
