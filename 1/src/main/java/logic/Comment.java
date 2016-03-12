package logic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "COMMENTS")
public class Comment {
	private Integer id;
	private Post post;
	private Date time;
	private User user;
	private String text;
	
	@Id
	@GeneratedValue
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@ManyToOne
	@JoinColumn(name = "idpost")
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	@Column(name = "TIME")
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@ManyToOne
	@JoinColumn(name = "loginuser")
	public User getUser() {
		return this.user;
	}
	public void setUser(User login) {
		this.user = login;
	}
	@Column(name = "TEXT")
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
