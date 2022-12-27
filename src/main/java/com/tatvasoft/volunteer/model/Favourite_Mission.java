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
@Table(name="Favourite_Mission")
public class Favourite_Mission {
	
	@Id
	@Column(name = "favourite_mission_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer favourite_mission_id;
	
	@ManyToOne
	@JoinColumn(name = "user_id",  nullable = false)
	private Users users;
	
	@ManyToOne
	@JoinColumn(name = "mission_id",  nullable = false)
	private Mission mission;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;

	public Integer getFavourite_mission_id() {
		return favourite_mission_id;
	}

	public void setFavourite_mission_id(Integer favourite_mission_id) {
		this.favourite_mission_id = favourite_mission_id;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
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

	public Favourite_Mission() {
		super();
	}

	public Favourite_Mission(Integer favourite_mission_id, Users users, Mission mission, LocalDateTime created_at,
			LocalDateTime updated_at, LocalDateTime deleted_at) {
		super();
		this.favourite_mission_id = favourite_mission_id;
		this.users = users;
		this.mission = mission;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
	}
	

}
