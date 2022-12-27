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
@Table(name="Goal_Mission")
public class Goal_Mission {
	
	@Id
	@Column(name = "goal_mission_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer goal_mission_id;
	
	@ManyToOne
	@JoinColumn(name = "mission_id", nullable = false)
	private Mission mission;
	
	@Column(name = "goal_objective_text", columnDefinition = "varchar(255)")
    private String goal_objective_text;
	
	@Column(name = "goal_value", nullable = false, length = 11)
	private Integer goal_value;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;

	public Integer getGoal_mission_id() {
		return goal_mission_id;
	}

	public void setGoal_mission_id(Integer goal_mission_id) {
		this.goal_mission_id = goal_mission_id;
	}

	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	public String getGoal_objective_text() {
		return goal_objective_text;
	}

	public void setGoal_objective_text(String goal_objective_text) {
		this.goal_objective_text = goal_objective_text;
	}

	public Integer getGoal_value() {
		return goal_value;
	}

	public void setGoal_value(Integer goal_value) {
		this.goal_value = goal_value;
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

	public Goal_Mission(Integer goal_mission_id, Mission mission, String goal_objective_text, Integer goal_value,
			LocalDateTime created_at, LocalDateTime updated_at, LocalDateTime deleted_at) {
		super();
		this.goal_mission_id = goal_mission_id;
		this.mission = mission;
		this.goal_objective_text = goal_objective_text;
		this.goal_value = goal_value;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
	}

	public Goal_Mission() {
		super();
	}
	
	

}
