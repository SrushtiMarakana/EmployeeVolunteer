package com.tatvasoft.volunteer.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="User_Skill")
public class User_Skill {
	
	@Id
	@Column(name = "user_skill_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer user_skill_id;
	
	@ManyToOne
	@JoinColumn(name = "user_id",  nullable = false)
	private Users users;
	
	@ManyToOne
	@JoinColumn(name = "skill_id",  nullable = false)
	private Skill skill;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;

	public Integer getUser_skill_id() {
		return user_skill_id;
	}

	public void setUser_skill_id(Integer user_skill_id) {
		this.user_skill_id = user_skill_id;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
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

	public User_Skill() {
		super();
	}

	public User_Skill(Integer user_skill_id, Users users, Skill skill, LocalDateTime created_at,
			LocalDateTime updated_at, LocalDateTime deleted_at) {
		super();
		this.user_skill_id = user_skill_id;
		this.users = users;
		this.skill = skill;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
	}
	
	

}
