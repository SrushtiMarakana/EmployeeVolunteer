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
@Table(name="Mission_Document")
public class Mission_Document {
	
	@Id
	@Column(name = "mission_document_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mission_document_id;
	
	@ManyToOne
	@JoinColumn(name = "mission_id",  nullable = false)
	private Mission mission;
	
	@Column(name = "document_name", nullable = false, columnDefinition = "varchar(255)")
    private String document_name;
	
	@Column(name = "document_type", nullable = false, columnDefinition = "varchar(255)")
    private String document_type;
	
	@Column(name = "document_path", nullable = false, columnDefinition = "varchar(255)")
    private String document_path;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;

	public Integer getMission_document_id() {
		return mission_document_id;
	}

	public void setMission_document_id(Integer mission_document_id) {
		this.mission_document_id = mission_document_id;
	}

	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	public String getDocument_name() {
		return document_name;
	}

	public void setDocument_name(String document_name) {
		this.document_name = document_name;
	}

	public String getDocument_type() {
		return document_type;
	}

	public void setDocument_type(String document_type) {
		this.document_type = document_type;
	}

	public String getDocument_path() {
		return document_path;
	}

	public void setDocument_path(String document_path) {
		this.document_path = document_path;
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

	public Mission_Document(Integer mission_document_id, Mission mission, String document_name, String document_type,
			String document_path, LocalDateTime created_at, LocalDateTime updated_at, LocalDateTime deleted_at) {
		super();
		this.mission_document_id = mission_document_id;
		this.mission = mission;
		this.document_name = document_name;
		this.document_type = document_type;
		this.document_path = document_path;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
	}

	public Mission_Document() {
		super();
	}
	
	

}
