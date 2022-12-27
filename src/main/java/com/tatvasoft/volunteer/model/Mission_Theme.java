package com.tatvasoft.volunteer.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="Mission_Theme")
public class Mission_Theme {
	
	@Id
	@Column(name = "mission_theme_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mission_theme_id;
	
	@Column(name = "mission_theme_title", columnDefinition = "varchar(255)", nullable = false)
    private String mission_theme_title;
	
	@Type(type = "org.hibernate.type.NumericBooleanType")
	@Column(name="status", nullable = false)
	private Boolean status = true;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;
	
	@OneToMany(mappedBy = "missionTheme",fetch = FetchType.EAGER)
	private List<Mission> mission;

	public Integer getMission_theme_id() {
		return mission_theme_id;
	}

	public void setMission_theme_id(Integer mission_theme_id) {
		this.mission_theme_id = mission_theme_id;
	}

	public String getMission_theme_title() {
		return mission_theme_title;
	}

	public void setMission_theme_title(String mission_theme_title) {
		this.mission_theme_title = mission_theme_title;
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
	
	

	public List<Mission> getMission() {
		return mission;
	}

	public void setMission(List<Mission> mission) {
		this.mission = mission;
	}

	public Mission_Theme() {
		super();
	}

	public Mission_Theme(Integer mission_theme_id, String mission_theme_title, Boolean status, LocalDateTime created_at,
			LocalDateTime updated_at, LocalDateTime deleted_at, List<Mission> mission) {
		super();
		this.mission_theme_id = mission_theme_id;
		this.mission_theme_title = mission_theme_title;
		this.status = status;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
		this.mission = mission;
	}

	public Mission_Theme(String mission_theme_title, Boolean status) {
		super();
		this.mission_theme_title = mission_theme_title;
		this.status = status;
	}

	
	

}
