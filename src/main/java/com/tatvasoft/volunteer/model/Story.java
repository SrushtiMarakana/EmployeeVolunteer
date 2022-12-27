package com.tatvasoft.volunteer.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="Story")
public class Story {
	
	@Id
	@Column(name = "story_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer story_id;
	
	@ManyToOne
	@JoinColumn(name = "user_id",  nullable = false)
	private Users users;
	
	@ManyToOne
	@JoinColumn(name = "mission_id",  nullable = false)
	private Mission mission;
	
	@Column(name = "title", columnDefinition = "varchar(255)", nullable = false)
    private String title;
	
	@Column(name = "description", columnDefinition = "text")
    private String description;
	
	@Column(name = "status", nullable = false, columnDefinition = "varchar(32) default 'DRAFT' ")
	@Enumerated(value = EnumType.STRING)
	private Status status;
	
	@Column(name = "published_at")
	private LocalDateTime published_at;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;
	
	@OneToMany(mappedBy = "story",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Story_Invite> storyInvite;
	
	@OneToMany(mappedBy = "story",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Story_Media> storyMedia;
	
	public Integer getStory_id() {
		return story_id;
	}

	public void setStory_id(Integer story_id) {
		this.story_id = story_id;
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



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}



	public LocalDateTime getPublished_at() {
		return published_at;
	}

	public void setPublished_at(LocalDateTime published_at) {
		this.published_at = published_at;
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


	public List<Story_Invite> getStoryInvite() {
		return storyInvite;
	}

	public void setStoryInvite(List<Story_Invite> storyInvite) {
		this.storyInvite = storyInvite;
	}
	

	public List<Story_Media> getStoryMedia() {
		return storyMedia;
	}

	public void setStoryMedia(List<Story_Media> storyMedia) {
		this.storyMedia = storyMedia;
	}


	public Story(Integer story_id, Users users, Mission mission, String title, String description, Status status,
			LocalDateTime published_at, LocalDateTime created_at, LocalDateTime updated_at, LocalDateTime deleted_at,
			List<Story_Invite> storyInvite, List<Story_Media> storyMedia) {
		super();
		this.story_id = story_id;
		this.users = users;
		this.mission = mission;
		this.title = title;
		this.description = description;
		this.status = status;
		this.published_at = published_at;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
		this.storyInvite = storyInvite;
		this.storyMedia = storyMedia;
	}

	public Story() {
		super();
	}


	public enum Status{
		DRAFT, 
		PENDING, 
		PUBLISHED, 
		DECLINED;
	}

}
