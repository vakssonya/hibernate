package DAO.Impl;

import DAO.CommentDAO;
import DAO.EntryDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import util.HibernateUtil;
import DAO.EntryDAO;
import logic.Comment;

public class CommentDAOImpl implements CommentDAO{
	 public List<Comment> getAllComments() throws SQLException {
         Session session = null;
         List<Comment> studs = new ArrayList<Comment>();
         try {
             session = HibernateUtil.getSessionFactory().openSession();
             studs = session.createCriteria(Comment.class).list();
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
