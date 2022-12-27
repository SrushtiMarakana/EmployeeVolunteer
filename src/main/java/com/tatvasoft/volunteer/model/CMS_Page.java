package com.tatvasoft.volunteer.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="CMS_Page")
public class CMS_Page {
	
	@Id
	@Column(name = "cms_page_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cms_page_id;
	
	@Column(name = "cms_title", columnDefinition = "varchar(255)", nullable = false)
    private String cms_title;
	
	@Column(name = "cms_description", columnDefinition = "text default 'None' ", nullable = false)
    private String cms_description;
	
	@Column(name = "slug", columnDefinition = "varchar(255) default 'None' ", nullable = false)
    private String slug;
	
	@Type(type = "org.hibernate.type.NumericBooleanType")
	@Column(name="status", nullable = false)
	private Boolean status = true;
	
	@Column(name = "created_at", updatable = false, nullable = false)
	private LocalDateTime created_at = LocalDateTime.now();
	
	@Column(name = "updated_at")
	private LocalDateTime updated_at;
	
	@Column(name = "deleted_at")
	private LocalDateTime deleted_at;

	public Integer getCms_page_id() {
		return cms_page_id;
	}

	public void setCms_page_id(Integer cms_page_id) {
		this.cms_page_id = cms_page_id;
	}

	public String getCms_title() {
		return cms_title;
	}

	public void setCms_title(String cms_title) {
		this.cms_title = cms_title;
	}

	public String getCms_description() {
		return cms_description;
	}

	public void setCms_description(String cms_description) {
		this.cms_description = cms_description;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
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

	public CMS_Page() {
		super();
	}

	public CMS_Page(Integer cms_page_id, String cms_title, String cms_description, String slug, Boolean status,
			LocalDateTime created_at, LocalDateTime updated_at, LocalDateTime deleted_at) {
		super();
		this.cms_page_id = cms_page_id;
		this.cms_title = cms_title;
		this.cms_description = cms_description;
		this.slug = slug;
		this.status = status;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.deleted_at = deleted_at;
	}

	public CMS_Page(String cms_title, String cms_description, String slug, Boolean status) {
		super();
		this.cms_title = cms_title;
		this.cms_description = cms_description;
		this.slug = slug;
		this.status = status;
	}
	
	

}
