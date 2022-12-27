package com.tatvasoft.volunteer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tatvasoft.volunteer.model.Mission_Theme;

@Service
public interface MissionThemeService {
	
	public void insertMissionThemeByAdmin(String mission_theme_title, int status);
	public List<Mission_Theme> missionThemeListing();
	public Mission_Theme editMissionThemeByAdmin(int missionThemeId);
	public void updateMissionThemeByAdmin(int missionThemeId,String mission_theme_title, int status);

}
