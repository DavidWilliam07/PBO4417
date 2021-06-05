/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAO;

import mvc.DAOInterface.IPendaftaran;
import mvc.Koneksi.Koneksi;
import mvc.Model.Pendaftaran;

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
public class DAOPendaftaran implements IPendaftaran{
    Connection connection;
    final String insert = "INSERT INTO tbl_pendaftaran (no, nik, nama, jk, alamat, usia, alasan) VALUES (?, ?, ?, ?, ?, ?, ?);";
    final String select = "SELECT * FROM tbl_pendaftaran;";
    
    public DAOPendaftaran(){
        connection = Koneksi.connection();
    }
    
    public void insert(Pendaftaran b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setInt(1, b.getNo());
            statement.setString(2, b.getNik());
            statement.setString(3, b.getNama());
            statement.setString(4, b.getJk());
            statement.setString(5, b.getAlamat());
            statement.setInt(6, b.getUsia());
            statement.setString(7, b.getAlasan());
            statement.execute();
        } catch (SQLException ex) {
            System.out.println("Berhasil Input");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Input");
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
