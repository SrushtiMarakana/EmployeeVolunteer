package com.tatvasoft.volunteer.service;

import java.util.List;

import com.tatvasoft.volunteer.model.CMS_Page;

public interface CMSPageService {
	
	public void insertCMSByAdmin(String cms_title, String cms_description, String slug, int status);
	public List<CMS_Page> cmsPageListing();
	public CMS_Page editCMSPageByAdmin(int cmsPageId);
	public void updateCMSPageByAdmin(int cmsPageId,String cms_title, String cms_description, String slug, int status);
	public void deleteCMSByAdmin(int cmsPageId);
	
}
