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

import org.hibernate.annotations.Type;

@Entity
@Table(name="Mission_Media")
public class Mission_Media {
	
	@Id
	@Column(name = "mission_media_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mission_media_id;
	
	@ManyToOne
	@JoinColumn(name = "mission_id",  nullable = false)
	private Mission mission;
	
	@Column(name = "media_name", nullable = false, columnDefinition = "varchar(255)")
    private String media_name;
	
	@Column(name = "media_type", nullable = false, columnDefinition = "varchar(255)")
    private String media_type;
	
	@Column(name = "media_path", nullable = false, columnDefinition = "varchar(255)")
    private String media_path;
	
	@Type(type = "org.hibernate.type.NumericBooleanType")
	@Column(name="status", nullable = false)
	private Boolean status = false;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;

	public Integer getMission_media_id() {
		return mission_media_id;
	}

	public void setMission_media_id(Integer mission_media_id) {
		this.mission_media_id = mission_media_id;
	}

	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	public String getMedia_name() {
		return media_name;
	}

	public void setMedia_name(String media_name) {
		this.media_name = media_name;
	}

	public String getMedia_type() {
		return media_type;
	}

	public void setMedia_type(String media_type) {
		this.media_type = media_type;
	}

	public String getMedia_path() {
		return media_path;
	}

	public void setMedia_path(String media_path) {
		this.media_path = media_path;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
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

	public Mission_Media(Integer mission_media_id, Mission mission, String media_name, String media_type,
			String media_path, Boolean status, LocalDateTime created_at, LocalDateTime updated_at,
			LocalDateTime deleted_at) {
		super();
		this.mission_media_id = mission_media_id;
		this.mission = mission;
		this.media_name = media_name;
		this.media_type = media_type;
		this.media_path = media_path;
		this.status = status;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
	}

	public Mission_Media() {
		super();
	}
	
	

}
