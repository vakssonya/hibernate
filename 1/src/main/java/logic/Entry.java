package logic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "VIEW1")
public class Entry {
	
	
	private String login;
	private int count;
	private Integer id;
	
	public Entry() {
	}

	@Id
	@GeneratedValue
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
	    return id;
	}
	
	public void setId(Integer id) {
	    this.id = id;
	}
	
	@Column(name = "login")
	public String getLogin() {
		return login;
	}
	
public void setLogin(String login)
{this.login = login;}

	@Column(name = "count")
	public int getCount() {
		return count;
	}
	public void setCount(int count)
	{this.count = count;}
}
