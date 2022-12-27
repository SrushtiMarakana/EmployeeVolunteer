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

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Type;

@Entity
@Table(name="Skill")
public class Skill {
	
	@Id
	@Column(name = "skill_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer skill_id;
	
	@Column(name = "skill_name", columnDefinition = "varchar(64)", nullable = false)
    private String skill_name;
	
	@Type(type = "org.hibernate.type.NumericBooleanType")
	@Column(name="status", nullable = false)
	private Boolean status = true;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;
	
	@OneToMany(mappedBy = "skill",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<User_Skill> userSkill;
	
	@OneToMany(mappedBy = "skill",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Mission_Skill> missionSkill;

	public Integer getSkill_id() {
		return skill_id;
	}

	public void setSkill_id(Integer skill_id) {
		this.skill_id = skill_id;
	}

	public String getSkill_name() {
		return skill_name;
	}

	public void setSkill_name(String skill_name) {
		this.skill_name = skill_name;
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

	public List<User_Skill> getUserSkill() {
		return userSkill;
	}

	public void setUserSkill(List<User_Skill> userSkill) {
		this.userSkill = userSkill;
	}

	public List<Mission_Skill> getMissionSkill() {
		return missionSkill;
	}

	public void setMissionSkill(List<Mission_Skill> missionSkill) {
		this.missionSkill = missionSkill;
	}


	public Skill(Integer skill_id, String skill_name, Boolean status, LocalDateTime created_at,
			LocalDateTime updated_at, LocalDateTime deleted_at, List<User_Skill> userSkill,
			List<Mission_Skill> missionSkill) {
		super();
		this.skill_id = skill_id;
		this.skill_name = skill_name;
		this.status = status;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
		this.userSkill = userSkill;
		this.missionSkill = missionSkill;
	}

	public Skill() {
		super();
	}

	public Skill(String skill_name, Boolean status) {
		super();
		this.skill_name = skill_name;
		this.status = status;
	}
	
	

}
