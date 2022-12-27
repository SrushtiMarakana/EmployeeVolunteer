package com.tatvasoft.volunteer.model;

import java.time.LocalDateTime;

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
@Table(name="Comment")
public class Comment {
	
	@Id
	@Column(name = "comment_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer comment_id;
	
	@ManyToOne
	@JoinColumn(name = "user_id",  nullable = false)
	private Users users;
	
	@ManyToOne
	@JoinColumn(name = "mission_id",  nullable = false)
	private Mission mission;
	
	@Column(name = "approval_status", nullable = false, columnDefinition = "varchar(32) default 'PENDING' ")
	@Enumerated(value = EnumType.STRING)
	private ApprovalStatus approval_status;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;
	
	
	
	public Integer getComment_id() {
		return comment_id;
	}



	public void setComment_id(Integer comment_id) {
		this.comment_id = comment_id;
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



	public Comment(Integer comment_id, Users users, Mission mission, ApprovalStatus approval_status,
			LocalDateTime created_at, LocalDateTime updated_at, LocalDateTime deleted_at) {
		super();
		this.comment_id = comment_id;
		this.users = users;
		this.mission = mission;
		this.approval_status = approval_status;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
	}


	public Comment() {
		super();
	}


	public enum ApprovalStatus{
		PENDING, 
		PUBLISHED;
	}

}
