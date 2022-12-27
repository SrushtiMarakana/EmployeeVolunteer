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
@Table(name="Mission_Rating")
public class Mission_Rating {
	
	@Id
	@Column(name = "mission_rating_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mission_rating_id;
	
	@ManyToOne
	@JoinColumn(name = "user_id",  nullable = false)
	private Users users;
	
	@ManyToOne
	@JoinColumn(name = "mission_id",  nullable = false)
	private Mission mission;
	
	@Column(name = "rating")
	private Integer rating;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;

	public Integer getMission_rating_id() {
		return mission_rating_id;
	}

	public void setMission_rating_id(Integer mission_rating_id) {
		this.mission_rating_id = mission_rating_id;
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

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
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

	public Mission_Rating(Integer mission_rating_id, Users users, Mission mission, Integer rating,
			LocalDateTime created_at, LocalDateTime updated_at, LocalDateTime deleted_at) {
		super();
		this.mission_rating_id = mission_rating_id;
		this.users = users;
		this.mission = mission;
		this.rating = rating;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
	}

	public Mission_Rating() {
		super();
	}
	

}
