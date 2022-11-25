package com.tatvasoft.volunteer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admins")
public class Admins {
	
	@Id
	@Column(name = "admin_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int admin_id;
	
	@Column(name = "first_name")
    private String first_name;
	
	@Column(name = "last_name")
    private String last_name;
	
	@Column(name = "email", nullable = false)
    private String email;
	
	@Column(name = "password", nullable = false)
    private String password;
    
    public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Admins() {
		
	}
	public Admins(String first_name, String last_name, String email, String password) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
	}
	
	
	
	

}
