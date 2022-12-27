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
@Table(name="Story_Invite")
public class Story_Invite {
	
	@Id
	@Column(name = "story_invite_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer story_invite_id;
	
	@ManyToOne
	@JoinColumn(name = "story_id",  nullable = false)
	private Story story;
	
	@ManyToOne
	@JoinColumn(name = "from_user_id",  nullable = false)
	private Users usersFrom;
	
	@ManyToOne
	@JoinColumn(name = "to_user_id",  nullable = false)
	private Users usersTo;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;

	public Integer getStory_invite_id() {
		return story_invite_id;
	}

	public void setStory_invite_id(Integer story_invite_id) {
		this.story_invite_id = story_invite_id;
	}

	public Story getStory() {
		return story;
	}

	public void setStory(Story story) {
		this.story = story;
	}

	public Users getUsersFrom() {
		return usersFrom;
	}

	public void setUsersFrom(Users usersFrom) {
		this.usersFrom = usersFrom;
	}

	public Users getUsersTo() {
		return usersTo;
	}

	public void setUsersTo(Users usersTo) {
		this.usersTo = usersTo;
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

	public Story_Invite(Integer story_invite_id, Story story, Users usersFrom, Users usersTo, LocalDateTime created_at,
			LocalDateTime updated_at, LocalDateTime deleted_at) {
		super();
		this.story_invite_id = story_invite_id;
		this.story = story;
		this.usersFrom = usersFrom;
		this.usersTo = usersTo;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
	}

	public Story_Invite() {
		super();
	}
	
	

}
