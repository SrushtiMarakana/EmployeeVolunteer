package com.tatvasoft.volunteer.model;

import java.time.LocalDateTime;
import java.util.Date;
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
import org.hibernate.annotations.Type;

@Entity
@Table(name="Mission")
public class Mission {
	
	@Id
	@Column(name = "mission_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mission_id;
	
	@ManyToOne
	@JoinColumn(name = "theme_id", nullable = false)
	private Mission_Theme missionTheme;
	
	@ManyToOne
	@JoinColumn(name = "city_id", nullable = false)
	private City city;
	
	@ManyToOne
	@JoinColumn(name = "country_id", nullable = false)
	private Country country;
	
	@Column(name = "title", columnDefinition = "varchar(128)", nullable = false)
    private String title;
	
	@Column(name = "short_description", columnDefinition = "text")
    private String short_description;
	
	@Column(name = "description", columnDefinition = "text")
    private String description;
	
	@Column(name = "image", columnDefinition = "varchar(2048)")
    private String image;
	
	@Column(name = "start_date", columnDefinition = "date")
	private Date startDate;
	
	@Column(name = "end_date", columnDefinition = "date")
	private Date endDate;
	
	@Column(name = "mission_type", nullable = false)
	@Enumerated(value = EnumType.STRING)
	private MissionType misionType;
	
	@Column(name = "registration_deadline", columnDefinition = "date")
	private Date registrationDeadline;
	
	@Column(name = "total_seats")
	private Integer totalSeats;
	
	@Type(type = "org.hibernate.type.NumericBooleanType")
	@Column(name="status", nullable = false)
	private Boolean status = true;
	
	@Column(name = "organization_name", columnDefinition = "varchar(255)")
    private String organization_name;
	
	@Column(name = "organization_detail", columnDefinition = "text")
    private String organization_detail;

	@Column(name = "availability")
	@Enumerated(value = EnumType.STRING)
	private Availability availability;
	
	@Column(name = "video_url", columnDefinition = "text")
    private String videoURL;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;
	
	@OneToMany(mappedBy = "mission",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Comment> comment;
	
	@OneToMany(mappedBy = "mission",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Favourite_Mission> favouriteMission;

	@OneToMany(mappedBy = "mission",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Goal_Mission> goalMission;	
	
	@OneToMany(mappedBy = "mission",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Mission_Application> missionApplication;
	
	@OneToMany(mappedBy = "mission",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Mission_Document> missionDocument;
	
	@OneToMany(mappedBy = "mission",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Mission_Invite> missionInvite;
	
	@OneToMany(mappedBy = "mission",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Mission_Media> missionMedia;
	
	@OneToMany(mappedBy = "mission",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Mission_Rating> missionRating;
	
	@OneToMany(mappedBy = "mission",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Mission_Skill> missionSkill;
	
	@OneToMany(mappedBy = "mission",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Story> story;
	
	@OneToMany(mappedBy = "mission",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Timesheet> timesheet;

	public Integer getMission_id() {
		return mission_id;
	}


	public void setMission_id(Integer mission_id) {
		this.mission_id = mission_id;
	}


	public Mission_Theme getMissionTheme() {
		return missionTheme;
	}


	public void setMissionTheme(Mission_Theme missionTheme) {
		this.missionTheme = missionTheme;
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


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getShort_description() {
		return short_description;
	}


	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public MissionType getMisionType() {
		return misionType;
	}


	public void setMisionType(MissionType misionType) {
		this.misionType = misionType;
	}


	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}


	public String getOrganization_name() {
		return organization_name;
	}


	public void setOrganization_name(String organization_name) {
		this.organization_name = organization_name;
	}


	public String getOrganization_detail() {
		return organization_detail;
	}


	public void setOrganization_detail(String organization_detail) {
		this.organization_detail = organization_detail;
	}


	public Availability getAvailability() {
		return availability;
	}


	public void setAvailability(Availability availability) {
		this.availability = availability;
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


	public List<Goal_Mission> getGoalMission() {
		return goalMission;
	}


	public void setGoalMission(List<Goal_Mission> goalMission) {
		this.goalMission = goalMission;
	}


	public List<Mission_Application> getMissionApplication() {
		return missionApplication;
	}


	public void setMissionApplication(List<Mission_Application> missionApplication) {
		this.missionApplication = missionApplication;
	}


	public List<Mission_Document> getMissionDocument() {
		return missionDocument;
	}


	public void setMissionDocument(List<Mission_Document> missionDocument) {
		this.missionDocument = missionDocument;
	}


	public List<Mission_Invite> getMissionInvite() {
		return missionInvite;
	}


	public void setMissionInvite(List<Mission_Invite> missionInvite) {
		this.missionInvite = missionInvite;
	}


	public List<Mission_Media> getMissionMedia() {
		return missionMedia;
	}


	public void setMissionMedia(List<Mission_Media> missionMedia) {
		this.missionMedia = missionMedia;
	}


	public List<Mission_Rating> getMissionRating() {
		return missionRating;
	}


	public void setMissionRating(List<Mission_Rating> missionRating) {
		this.missionRating = missionRating;
	}
	

	public List<Mission_Skill> getMissionSkill() {
		return missionSkill;
	}

	public void setMissionSkill(List<Mission_Skill> missionSkill) {
		this.missionSkill = missionSkill;
	}


	public List<Story> getStory() {
		return story;
	}


	public void setStory(List<Story> story) {
		this.story = story;
	}


	public List<Timesheet> getTimesheet() {
		return timesheet;
	}


	public void setTimesheet(List<Timesheet> timesheet) {
		this.timesheet = timesheet;
	}


	public Date getRegistrationDeadline() {
		return registrationDeadline;
	}


	public void setRegistrationDeadline(Date registrationDeadline) {
		this.registrationDeadline = registrationDeadline;
	}


	public Integer getTotalSeats() {
		return totalSeats;
	}


	public void setTotalSeats(Integer totalSeats) {
		this.totalSeats = totalSeats;
	}


	public String getVideoURL() {
		return videoURL;
	}


	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
	}


	public Mission() {
		super();
	}


	public Mission(Integer mission_id, Mission_Theme missionTheme, City city, Country country, String title,
			String short_description, String description, Date startDate, Date endDate, MissionType misionType,
			Date registrationDeadline, Integer totalSeats, Boolean status, String organization_name,
			String organization_detail, Availability availability, String videoURL, LocalDateTime created_at,
			LocalDateTime updated_at, LocalDateTime deleted_at, List<Comment> comment,
			List<Favourite_Mission> favouriteMission, List<Goal_Mission> goalMission,
			List<Mission_Application> missionApplication, List<Mission_Document> missionDocument,
			List<Mission_Invite> missionInvite, List<Mission_Media> missionMedia, List<Mission_Rating> missionRating,
			List<Mission_Skill> missionSkill, List<Story> story, List<Timesheet> timesheet) {
		super();
		this.mission_id = mission_id;
		this.missionTheme = missionTheme;
		this.city = city;
		this.country = country;
		this.title = title;
		this.short_description = short_description;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.misionType = misionType;
		this.registrationDeadline = registrationDeadline;
		this.totalSeats = totalSeats;
		this.status = status;
		this.organization_name = organization_name;
		this.organization_detail = organization_detail;
		this.availability = availability;
		this.videoURL = videoURL;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
		this.comment = comment;
		this.favouriteMission = favouriteMission;
		this.goalMission = goalMission;
		this.missionApplication = missionApplication;
		this.missionDocument = missionDocument;
		this.missionInvite = missionInvite;
		this.missionMedia = missionMedia;
		this.missionRating = missionRating;
		this.missionSkill = missionSkill;
		this.story = story;
		this.timesheet = timesheet;
	}


	public enum MissionType{
		TIME,GOAL;
	}
	
	
	public enum Availability{
		DAILY, WEEKLY;
	}
}


