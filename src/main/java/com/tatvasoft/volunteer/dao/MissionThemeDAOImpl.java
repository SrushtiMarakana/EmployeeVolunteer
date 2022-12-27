package com.tatvasoft.volunteer.dao;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import com.tatvasoft.volunteer.model.Mission_Theme;
import com.tatvasoft.volunteer.util.HibernateUtil;

@Component
public class MissionThemeDAOImpl implements MissionThemeDAO{

	@Transactional
	@Override
	public void insertMissionThemeByAdmin(Mission_Theme missionTheme) {
		
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction t = s.beginTransaction();
		s.save(missionTheme);
		t.commit();
		s.clear();
		
	}

	@Transactional
	@Override
	public List<Mission_Theme> missionThemeListing() {
		
		Session s = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("rawtypes")
		Query q = s.createQuery("from Mission_Theme missionTheme where missionTheme.deleted_at = null");
        @SuppressWarnings("unchecked")
		List<Mission_Theme> missionTheme = (List<Mission_Theme>)q.list();
		return missionTheme;
		
	}

	@Transactional
	@Override
	public Mission_Theme editMissionThemeByAdmin(int missionThemeId) {
		
		Session s = HibernateUtil.getSessionFactory().openSession();
		Mission_Theme  missionTheme = (Mission_Theme)s.get(Mission_Theme.class,missionThemeId);
		return missionTheme;
		
	}

	@Transactional
	@Override
	public void updateMissionThemeByAdminDB(int missionThemeId, Mission_Theme missionTheme) {
		
		Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction t = s.beginTransaction();
        Mission_Theme  mTheme = (Mission_Theme)s.get(Mission_Theme.class,missionThemeId);
        mTheme.setMission_theme_title(missionTheme.getMission_theme_title());
        mTheme.setStatus(missionTheme.getStatus());
        mTheme.setUpdated_at(LocalDateTime.now());
        s.saveOrUpdate(mTheme);
        t.commit();
		
	}

}
