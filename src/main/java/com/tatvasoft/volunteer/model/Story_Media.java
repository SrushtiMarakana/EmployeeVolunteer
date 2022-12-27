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
@Table(name="Story_Media")
public class Story_Media {
	
	@Id
	@Column(name = "story_media_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer story_media_id;
	
	@ManyToOne
	@JoinColumn(name = "story_id",  nullable = false)
	private Story story;
	
	@Column(name = "name", nullable = false, columnDefinition = "varchar(255)")
    private String name;
	
	@Column(name = "type", nullable = false, columnDefinition = "varchar(255)")
    private String type;
	
	@Column(name = "path", nullable = false, columnDefinition = "varchar(255)")
    private String path;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;

	public Integer getStory_media_id() {
		return story_media_id;
	}

	public void setStory_media_id(Integer story_media_id) {
		this.story_media_id = story_media_id;
	}

	public Story getStory() {
		return story;
	}

	public void setStory(Story story) {
		this.story = story;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
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

	public Story_Media(Integer story_media_id, Story story, String name, String type, String path,
			LocalDateTime created_at, LocalDateTime updated_at, LocalDateTime deleted_at) {
		super();
		this.story_media_id = story_media_id;
		this.story = story;
		this.name = name;
		this.type = type;
		this.path = path;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
	}

	public Story_Media() {
		super();
	}
	
	

}
