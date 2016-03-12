package m;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.sql.SQLException;
import java.util.List;

import logic.Comment;
import logic.Entry;
import logic.User;
import DAO.Factory;

public class Main {

	public static List<Comment> getList() throws SQLException {

		List<Entry> studs1 = Factory.getInstance().getEntryDAO().getAllStudents();
		System.out.println("========Все пользователи=========");

			studs1.stream().peek((e) -> System.out.println("Логин : " + e.getLogin() 
			+ ", Кол-во комментариев : " + e.getCount())).collect(Collectors.toList());
			System.out.println("=============================");

		List<Comment> studs = Factory.getInstance().getCommentDAO().getAllComments();
		String str = null;
		for( Entry i : studs1)
		{
			str+=i.getLogin()+" ";
		}
		System.out.println(str);
		return studs;
	}
}