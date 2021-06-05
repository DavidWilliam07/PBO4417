/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;
import java.util.List;
import mvc.Model.Pendaftaran;
/**
 *
 * @author ROG STRIX G
 */
public interface IPendaftaran {
    public void update(Pendaftaran b);
    public void delete(int no);
    public List<Pendaftaran> getAll();
}
