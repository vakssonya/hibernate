package DAO;

import DAO.Impl.CommentDAOImpl;
import DAO.Impl.EntryDAOImpl;

public class Factory {

	private static CommentDAO commentDAO = null;
	private static EntryDAO entryDAO = null;
	private static Factory instance = null;

	public static synchronized Factory getInstance() {
		if (instance == null) {
			instance = new Factory();
		}
		return instance;
	}

	public EntryDAO getEntryDAO() {
		if (entryDAO == null) {
			entryDAO = new EntryDAOImpl();
		}
		return entryDAO;
	}

	public CommentDAO getCommentDAO() {
		if (commentDAO == null) {
			commentDAO = new CommentDAOImpl();
		}
		return commentDAO;
	}
}
