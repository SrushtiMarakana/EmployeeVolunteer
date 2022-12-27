package com.tatvasoft.volunteer.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tatvasoft.volunteer.dao.CMSPageDAO;
import com.tatvasoft.volunteer.model.CMS_Page;

@Service
public class CMSPageServiceImpl implements CMSPageService{
	
	@Autowired
	private CMSPageDAO cmsPageDAO;

	@Transactional
	@Override
	public void insertCMSByAdmin(String cms_title, String cms_description, String slug, int s) {
		
		 boolean status = true;
		 
		 if(s == 0) {
			 status = false;
		 }
		
		CMS_Page cmsPage = new CMS_Page(cms_title, cms_description, slug, status);
		
		cmsPageDAO.insertCMSByAdmin(cmsPage);
		
	}

	@Transactional
	@Override
	public List<CMS_Page> cmsPageListing() {
		
		List<CMS_Page> cmsPage = cmsPageDAO.cmsPageListing();
		return cmsPage;
		
	}

	@Transactional
	@Override
	public CMS_Page editCMSPageByAdmin(int cmsPageId) {
		
		CMS_Page cmsPage = cmsPageDAO.editCMSPageByAdmin(cmsPageId);
		return cmsPage;
		
	}

	@Transactional
	@Override
	public void updateCMSPageByAdmin(int cmsPageId, String cms_title, String cms_description, String slug, int s) {
		
		 boolean status = true;
		 
		 if(s == 0) {
			 status = false;
		 }
		
		CMS_Page cmsPage = new CMS_Page(cms_title, cms_description, slug, status);
		
		cmsPageDAO.updateCMSPageByAdminDB(cmsPageId, cmsPage);
		
	}

	@Transactional
	@Override
	public void deleteCMSByAdmin(int cmsPageId) {
		
		cmsPageDAO.deleteCMSByAdmin(cmsPageId);
		
	}

}
