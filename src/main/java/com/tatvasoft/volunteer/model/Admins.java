package com.tatvasoft.volunteer.model;

import java.time.LocalDateTime;

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
	@Column(name = "admin_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer admin_id;
	
	@Column(name = "first_name", columnDefinition = "varchar(16)", nullable = false)
    private String first_name;
	
	@Column(name = "last_name", columnDefinition = "varchar(16)", nullable = false)
    private String last_name;
	
	@Column(name = "email", nullable = false, columnDefinition = "varchar(128)")
    private String email;
	
	@Column(name = "password", nullable = false, columnDefinition = "varchar(255)")
    private String password;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;

	public Integer getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(Integer admin_id) {
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

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}

	public LocalDateTime getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}

	public LocalDateTime getDeleted_at() {
		return deleted_at;
	}

	public void setDeleted_at(LocalDateTime deleted_at) {
		this.deleted_at = deleted_at;
	}

	public Admins(Integer admin_id, String first_name, String last_name, String email, String password,
			LocalDateTime created_at, LocalDateTime updated_at, LocalDateTime deleted_at) {
		super();
		this.admin_id = admin_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
	}

	public Admins() {
		super();
	}
    
   
	

}
