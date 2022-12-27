package com.tatvasoft.volunteer.dao;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import com.tatvasoft.volunteer.model.CMS_Page;
import com.tatvasoft.volunteer.util.HibernateUtil;

@Component
public class CMSPageDAOImpl implements CMSPageDAO {

	@Transactional
	@Override
	public void insertCMSByAdmin(CMS_Page cms) {
		
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction t = s.beginTransaction();
		s.save(cms);
		t.commit();
		s.clear();
		
	}

	@Transactional
	@Override
	public List<CMS_Page> cmsPageListing() {
		
		Session s = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("rawtypes")
		Query q = s.createQuery("from CMS_Page cms where cms.deleted_at = null");
        @SuppressWarnings("unchecked")
		List<CMS_Page> cmsPage = (List<CMS_Page>)q.list();
		return cmsPage;
	}

	@Transactional
	@Override
	public CMS_Page editCMSPageByAdmin(int cmsPageId) {
		
		Session s = HibernateUtil.getSessionFactory().openSession();
		CMS_Page  cmsPage = (CMS_Page)s.get(CMS_Page.class,cmsPageId);
		return cmsPage;
	}

	@Transactional
	@Override
	public void updateCMSPageByAdminDB(int cmsPageId, CMS_Page cms) {
		
		Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        CMS_Page  cmsPage = (CMS_Page)s.get(CMS_Page.class,cmsPageId);
        cmsPage.setCms_title(cms.getCms_title());
        cmsPage.setCms_description(cms.getCms_description());
        cmsPage.setSlug(cms.getSlug());
        cmsPage.setStatus(cms.getStatus());
        cmsPage.setUpdated_at(LocalDateTime.now());
        s.saveOrUpdate(cmsPage);
        t.commit();
		
	}

	@Transactional
	@Override
	public void deleteCMSByAdmin(int cmsPageId) {
		
		Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        CMS_Page  cmsPage = (CMS_Page)s.get(CMS_Page.class,cmsPageId);
        cmsPage.setDeleted_at(LocalDateTime.now());
        s.saveOrUpdate(cmsPage);
        t.commit();
		
	}

}
