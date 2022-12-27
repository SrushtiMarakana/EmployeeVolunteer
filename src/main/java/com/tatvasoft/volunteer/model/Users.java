package com.tatvasoft.volunteer.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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
import org.hibernate.annotations.Type;

@Entity
@Table(name="Users")
public class Users {
	
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer user_id;
	
	@Column(name = "first_name", columnDefinition = "varchar(16)", nullable = false)
    private String first_name;
	
	@Column(name = "last_name", columnDefinition = "varchar(16)", nullable = false)
    private String last_name;
	
	@Column(name = "email", nullable = false, columnDefinition = "varchar(128)")
    private String email;
	
	@Column(name = "password", nullable = false, columnDefinition = "varchar(255)")
    private String password;
	
	@Column(name = "phone_number", columnDefinition = "bigint")
    private Long phone_number;
	
	@Column(name = "avatar", columnDefinition = "varchar(2048)")
    private String avatar;
	
	@Column(name = "why_i_volunteer", columnDefinition = "text")
    private String why_i_volunteer;
	
	@Column(name = "employee_id", columnDefinition = "varchar(16)")
    private String employee_id;
	
	@Column(name = "department", columnDefinition = "varchar(16)")
    private String department;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
	
	@Column(name = "profile_text", columnDefinition = "text")
    private String profile_text;
	
	@Column(name = "linked_in_url", columnDefinition = "varchar(255)")
    private String linked_in_url;
	
	@Column(name = "title", columnDefinition = "varchar(255)")
    private String title;
	
	@Type(type = "org.hibernate.type.NumericBooleanType")
	@Column(name="status", nullable = false)
	private Boolean status = true;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;
	
	@OneToMany(mappedBy = "users",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<User_Skill> userSkill;

	@OneToMany(mappedBy = "users",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Comment> comment;
	
	@OneToMany(mappedBy = "users",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Favourite_Mission> favouriteMission;
	
	@OneToMany(mappedBy = "users",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Mission_Application> missionApplication;
	
	@OneToMany(mappedBy = "usersFrom",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Mission_Invite> missionInviteFrom;
	
	@OneToMany(mappedBy = "usersTo",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Mission_Invite> missionInviteTo;
	
	@OneToMany(mappedBy = "users",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Mission_Rating> missionRating;
	
	@OneToMany(mappedBy = "users",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Story> story;
	
	@OneToMany(mappedBy = "usersFrom",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Story_Invite> storyInviteFrom;
	
	@OneToMany(mappedBy = "usersTo",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Story_Invite> storyInviteTo;
	
	@OneToMany(mappedBy = "users",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Timesheet> timesheet;
	
	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}


	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public Long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(Long phone_number) {
		this.phone_number = phone_number;
	}


	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}


	public String getWhy_i_volunteer() {
		return why_i_volunteer;
	}

	public void setWhy_i_volunteer(String why_i_volunteer) {
		this.why_i_volunteer = why_i_volunteer;
	}


	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}


	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	public String getProfile_text() {
		return profile_text;
	}

	public void setProfile_text(String profile_text) {
		this.profile_text = profile_text;
	}


	public String getLinked_in_url() {
		return linked_in_url;
	}

	public void setLinked_in_url(String linked_in_url) {
		this.linked_in_url = linked_in_url;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	
	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public List<User_Skill> getUserSkill() {
		return userSkill;
	}

	public void setUserSkill(List<User_Skill> userSkill) {
		this.userSkill = userSkill;
	}

	public List<Comment> getComment() {
		return comment;
	}

	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}


	public List<Favourite_Mission> getFavouriteMission() {
		return favouriteMission;
	}

	public void setFavouriteMission(List<Favourite_Mission> favouriteMission) {
		this.favouriteMission = favouriteMission;
	}
	

	public List<Mission_Application> getMissionApplication() {
		return missionApplication;
	}

	public void setMissionApplication(List<Mission_Application> missionApplication) {
		this.missionApplication = missionApplication;
	}


	public List<Mission_Invite> getMissionInviteFrom() {
		return missionInviteFrom;
	}

	public void setMissionInviteFrom(List<Mission_Invite> missionInviteFrom) {
		this.missionInviteFrom = missionInviteFrom;
	}

	public List<Mission_Invite> getMissionInviteTo() {
		return missionInviteTo;
	}

	public void setMissionInviteTo(List<Mission_Invite> missionInviteTo) {
		this.missionInviteTo = missionInviteTo;
	}

	public List<Mission_Rating> getMissionRating() {
		return missionRating;
	}

	public void setMissionRating(List<Mission_Rating> missionRating) {
		this.missionRating = missionRating;
	}

	public List<Story> getStory() {
		return story;
	}

	public void setStory(List<Story> story) {
		this.story = story;
	}

	public List<Story_Invite> getStoryInviteFrom() {
		return storyInviteFrom;
	}

	public void setStoryInviteFrom(List<Story_Invite> storyInviteFrom) {
		this.storyInviteFrom = storyInviteFrom;
	}

	public List<Story_Invite> getStoryInviteTo() {
		return storyInviteTo;
	}

	public void setStoryInviteTo(List<Story_Invite> storyInviteTo) {
		this.storyInviteTo = storyInviteTo;
	}

	public List<Timesheet> getTimesheet() {
		return timesheet;
	}

	public void setTimesheet(List<Timesheet> timesheet) {
		this.timesheet = timesheet;
	}

	public Users(String first_name, String last_name, String email, Long phone_number, String password) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;
		this.password = password;
	}

	public Users() {
		super();
	}

	public Users(Integer user_id, String first_name, String last_name, String email, String password, Long phone_number,
			String avatar, String why_i_volunteer, String employee_id, String department, City city, Country country,
			String profile_text, String linked_in_url, String title, Boolean status, LocalDateTime created_at,
			LocalDateTime updated_at, LocalDateTime deleted_at, List<User_Skill> userSkill, List<Comment> comment,
			List<Favourite_Mission> favouriteMission, List<Mission_Application> missionApplication,
			List<Mission_Invite> missionInviteFrom, List<Mission_Invite> missionInviteTo,
			List<Mission_Rating> missionRating, List<Story> story, List<Story_Invite> storyInviteFrom,
			List<Story_Invite> storyInviteTo, List<Timesheet> timesheet) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.phone_number = phone_number;
		this.avatar = avatar;
		this.why_i_volunteer = why_i_volunteer;
		this.employee_id = employee_id;
		this.department = department;
		this.city = city;
		this.country = country;
		this.profile_text = profile_text;
		this.linked_in_url = linked_in_url;
		this.title = title;
		this.status = status;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
		this.userSkill = userSkill;
		this.comment = comment;
		this.favouriteMission = favouriteMission;
		this.missionApplication = missionApplication;
		this.missionInviteFrom = missionInviteFrom;
		this.missionInviteTo = missionInviteTo;
		this.missionRating = missionRating;
		this.story = story;
		this.storyInviteFrom = storyInviteFrom;
		this.storyInviteTo = storyInviteTo;
		this.timesheet = timesheet;
	}

	public Users(String first_name, String last_name, String email, String password, String avatar, String employee_id,
			String department, City city, Country country, String profile_text, Boolean status) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.avatar = avatar;
		this.employee_id = employee_id;
		this.department = department;
		this.city = city;
		this.country = country;
		this.profile_text = profile_text;
		this.status = status;
	}
	
	

	
}
