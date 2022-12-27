package com.tatvasoft.volunteer.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tatvasoft.volunteer.dao.MissionThemeDAO;
import com.tatvasoft.volunteer.model.Mission_Theme;

@Service
public class MissionThemeServiceImpl implements MissionThemeService{

	@Autowired
	private MissionThemeDAO missionThemeDAO;
	
	@Transactional
	@Override
	public void insertMissionThemeByAdmin(String mission_theme_title, int s) {
		
		 boolean status = true;
		 
		 if(s == 0) {
			 status = false;
		 }
		
		 Mission_Theme missionTheme = new Mission_Theme(mission_theme_title, status);
		 
		 missionThemeDAO.insertMissionThemeByAdmin(missionTheme);
		
	}

	@Transactional
	@Override
	public List<Mission_Theme> missionThemeListing() {
	
		List<Mission_Theme> missionTheme = missionThemeDAO.missionThemeListing();
		return missionTheme;
		
	}

	@Transactional
	@Override
	public Mission_Theme editMissionThemeByAdmin(int missionThemeId) {
		
		Mission_Theme  missionTheme = missionThemeDAO.editMissionThemeByAdmin(missionThemeId);
		return missionTheme;
		
	}

	@Transactional
	@Override
	public void updateMissionThemeByAdmin(int missionThemeId, String mission_theme_title, int s) {
		
		 boolean status = true;
		 
		 if(s == 0) {
			 status = false;
		 }
		 
		 Mission_Theme missionTheme = new Mission_Theme(mission_theme_title, status);
		 
		 missionThemeDAO.updateMissionThemeByAdminDB(missionThemeId, missionTheme);
		
	}

}
