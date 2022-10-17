package com.gl.CaseStudyNew.bean;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.lang.NonNull;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

@Entity
public class MyUser extends User{
	@Id
	@Column(columnDefinition = "varchar(10) ", nullable = false)
	private String username;
	@Column(columnDefinition = "varchar(10)", nullable = false)
	private String password;
	public MyUser() {
		super("Marigold","Mango",new ArrayList<>());
		
	}
	
	
	


	public MyUser(String username, String password, Collection<? extends GrantedAuthority> authorities,String username2,String password2) {
		super(username, password, authorities);
		this.username=username2;
		this.password=password2;
	}





	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	

}
