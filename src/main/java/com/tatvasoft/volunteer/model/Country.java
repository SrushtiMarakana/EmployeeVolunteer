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


@Entity
@Table(name="Country")
public class Country {
	
	@Id
	@Column(name = "country_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer country_id;
		
	@Column(name = "name", nullable = false, columnDefinition = "varchar(255)")
    private String name;
	
	@Column(name = "iso", columnDefinition = "varchar(16)")
    private String iso;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;
	
	@OneToMany(mappedBy = "country",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<City> city;
	
	@OneToMany(mappedBy = "country",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Users> users;
	
	@OneToMany(mappedBy = "country",fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Mission> mission;

	public Integer getCountry_id() {
		return country_id;
	}

	public void setCountry_id(Integer country_id) {
		this.country_id = country_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIso() {
		return iso;
	}

	public void setIso(String iso) {
		this.iso = iso;
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

	public List<City> getCity() {
		return city;
	}

	public void setCity(List<City> city) {
		this.city = city;
	}

	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}
	

	public List<Mission> getMission() {
		return mission;
	}

	public void setMission(List<Mission> mission) {
		this.mission = mission;
	}

	public Country() {
		super();
	}

	public Country(Integer country_id, String name, String iso, LocalDateTime created_at, LocalDateTime updated_at,
			LocalDateTime deleted_at, List<City> city, List<Users> users, List<Mission> mission) {
		super();
		this.country_id = country_id;
		this.name = name;
		this.iso = iso;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
		this.city = city;
		this.users = users;
		this.mission = mission;
	}

	

}
