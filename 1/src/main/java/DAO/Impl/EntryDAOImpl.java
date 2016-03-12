package DAO.Impl;

import DAO.EntryDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.HibernateUtil;
import DAO.EntryDAO;
import logic.Entry;

public class EntryDAOImpl implements EntryDAO{
	 public List<Entry> getAllStudents() throws SQLException {
         Session session = null;
         List<Entry> studs = new ArrayList<Entry>();
         try {
             session = HibernateUtil.getSessionFactory().openSession();
             studs = session.createCriteria(Entry.class).list();
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
         } finally {
             if (session != null && session.isOpen()) {
                 session.close();
             }
         }
         return studs;
   }
}
