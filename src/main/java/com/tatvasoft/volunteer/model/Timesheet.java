package com.tatvasoft.volunteer.model;


import java.sql.Time;
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
@Table(name="Timesheet")
public class Timesheet {
	
	@Id
	@Column(name = "timesheet_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer timesheet_id;
	
	@ManyToOne
	@JoinColumn(name = "user_id",  nullable = false)
	private Users users;
	
	@ManyToOne
	@JoinColumn(name = "mission_id",  nullable = false)
	private Mission mission;
	
	@Column(name = "time", columnDefinition = "time")
	private Time time;
	
	@Column(name = "action", length = 11)
	private Integer action;
	
	@Column(name = "date_volunteered", columnDefinition = "date", nullable = false)
	private Date date_volunteered;
	
	@Column(name = "notes", columnDefinition = "text")
    private String notes;
	
	@Column(name = "status", nullable = false, columnDefinition = "varchar(32) default 'PENDING' ")
	@Enumerated(value = EnumType.STRING)
	private Status status;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;
	

	public Integer getTimesheet_id() {
		return timesheet_id;
	}


	public void setTimesheet_id(Integer timesheet_id) {
		this.timesheet_id = timesheet_id;
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


	public Time getTime() {
		return time;
	}



	public void setTime(Time time) {
		this.time = time;
	}


	public Integer getAction() {
		return action;
	}


	public void setAction(Integer action) {
		this.action = action;
	}


	public Date getDate_volunteered() {
		return date_volunteered;
	}


	public void setDate_volunteered(Date date_volunteered) {
		this.date_volunteered = date_volunteered;
	}


	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
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

	public Timesheet(Integer timesheet_id, Users users, Mission mission, Time time, Integer action,
			Date date_volunteered, String notes, Status status, LocalDateTime created_at, LocalDateTime updated_at,
			LocalDateTime deleted_at) {
		super();
		this.timesheet_id = timesheet_id;
		this.users = users;
		this.mission = mission;
		this.time = time;
		this.action = action;
		this.date_volunteered = date_volunteered;
		this.notes = notes;
		this.status = status;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
	}


	public enum Status{
		PENDING,
		APPROVED,
		DECLINED,
		SUBMIT_FOR_APPROVAL;
	}

}
