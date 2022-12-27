package com.tatvasoft.volunteer.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Mission_Application")
public class Mission_Application {
	
	@Id
	@Column(name = "mission_application_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mission_application_id;
	
	@ManyToOne
	@JoinColumn(name = "mission_id",  nullable = false)
	private Mission mission;
	
	@ManyToOne
	@JoinColumn(name = "user_id",  nullable = false)
	private Users users;
	
	@Column(name = "applied_at", columnDefinition = "date", nullable = false)
	private Date applied_at;
	
	@Column(name = "approval_status", nullable = false, columnDefinition = "varchar(32) default 'PENDING' ")
	@Enumerated(value = EnumType.STRING)
	private ApprovalStatus approval_status;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;
	


	public Integer getMission_application_id() {
		return mission_application_id;
	}



	public void setMission_application_id(Integer mission_application_id) {
		this.mission_application_id = mission_application_id;
	}



	public Mission getMission() {
		return mission;
	}



	public void setMission(Mission mission) {
		this.mission = mission;
	}



	public Users getUsers() {
		return users;
	}



	public void setUsers(Users users) {
		this.users = users;
	}



	public Date getApplied_at() {
		return applied_at;
	}



	public void setApplied_at(Date applied_at) {
		this.applied_at = applied_at;
	}



	public ApprovalStatus getApproval_status() {
		return approval_status;
	}



	public void setApproval_status(ApprovalStatus approval_status) {
		this.approval_status = approval_status;
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


	public Mission_Application(Integer mission_application_id, Mission mission, Users users, Date applied_at,
			ApprovalStatus approval_status, LocalDateTime created_at, LocalDateTime updated_at,
			LocalDateTime deleted_at) {
		super();
		this.mission_application_id = mission_application_id;
		this.mission = mission;
		this.users = users;
		this.applied_at = applied_at;
		this.approval_status = approval_status;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
	}



	public Mission_Application() {
		super();
	}


	public enum ApprovalStatus{
		PENDING, APPROVE, DECLINE;
	}

}
