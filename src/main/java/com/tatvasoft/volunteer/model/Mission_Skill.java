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
@Table(name="Mission_Skill")
public class Mission_Skill {
	
	@Id
	@Column(name = "mission_skill_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mission_skill_id;
	
	@ManyToOne
	@JoinColumn(name = "skill_id",  nullable = false)
	private Skill skill;
	
	@ManyToOne
	@JoinColumn(name = "mission_id",  nullable = false)
	private Mission mission;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;

	public Integer getMission_skill_id() {
		return mission_skill_id;
	}

	public void setMission_skill_id(Integer mission_skill_id) {
		this.mission_skill_id = mission_skill_id;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
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

	public Mission_Skill(Integer mission_skill_id, Skill skill, Mission mission, LocalDateTime created_at,
			LocalDateTime updated_at, LocalDateTime deleted_at) {
		super();
		this.mission_skill_id = mission_skill_id;
		this.skill = skill;
		this.mission = mission;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
	}

	public Mission_Skill() {
		super();
	}

}
