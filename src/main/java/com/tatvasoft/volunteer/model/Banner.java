package com.tatvasoft.volunteer.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Banner")
public class Banner {
	
	@Id
	@Column(name = "banner_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer banner_id;
	
	@Column(name = "image", columnDefinition = "varchar(512)", nullable = false)
    private String image;
	
	@Column(name = "banner_title", columnDefinition = "text", nullable = false)
    private String banner_title;
	
	@Column(name = "banner_description", columnDefinition = "text", nullable = false)
    private String banner_description;
	
	@Column(name = "sort_order", nullable = false, columnDefinition = "int default 0", length = 11)
    private Integer sort_order;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;

	public Integer getBanner_id() {
		return banner_id;
	}

	public void setBanner_id(Integer banner_id) {
		this.banner_id = banner_id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getBanner_title() {
		return banner_title;
	}

	public void setBanner_title(String banner_title) {
		this.banner_title = banner_title;
	}

	public String getBanner_description() {
		return banner_description;
	}

	public void setBanner_description(String banner_description) {
		this.banner_description = banner_description;
	}

	public Integer getSort_order() {
		return sort_order;
	}

	public void setSort_order(Integer sort_order) {
		this.sort_order = sort_order;
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

	public Banner(Integer banner_id, String image, String banner_title, String banner_description, Integer sort_order,
			LocalDateTime created_at, LocalDateTime updated_at, LocalDateTime deleted_at) {
		super();
		this.banner_id = banner_id;
		this.image = image;
		this.banner_title = banner_title;
		this.banner_description = banner_description;
		this.sort_order = sort_order;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
	}

	public Banner() {
		super();
	}
	
	

}
