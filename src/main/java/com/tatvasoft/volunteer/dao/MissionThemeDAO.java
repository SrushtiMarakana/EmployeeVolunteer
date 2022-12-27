package com.tatvasoft.volunteer.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tatvasoft.volunteer.model.Mission_Theme;

@Component
public interface MissionThemeDAO {
	
	public void insertMissionThemeByAdmin(Mission_Theme missionTheme);
	public List<Mission_Theme> missionThemeListing();
	public Mission_Theme editMissionThemeByAdmin(int missionThemeId);
	public void updateMissionThemeByAdminDB(int missionThemeId,Mission_Theme missionTheme);

}
