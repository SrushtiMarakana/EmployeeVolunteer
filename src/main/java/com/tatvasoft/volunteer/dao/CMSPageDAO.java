package com.tatvasoft.volunteer.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tatvasoft.volunteer.model.CMS_Page;

@Component
public interface CMSPageDAO {
	
	public void insertCMSByAdmin(CMS_Page cms);
	public List<CMS_Page> cmsPageListing();
	public CMS_Page editCMSPageByAdmin(int cmsPageId);
	public void updateCMSPageByAdminDB(int cmsPageId,CMS_Page cms);
	public void deleteCMSByAdmin(int cmsPageId);

}
