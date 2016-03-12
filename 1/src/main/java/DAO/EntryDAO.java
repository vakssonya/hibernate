package DAO;

import java.sql.SQLException;
import java.util.List;

import logic.Entry;

public interface EntryDAO {
	public List getAllStudents() throws SQLException;  
}