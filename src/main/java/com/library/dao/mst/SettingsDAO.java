//Interface : SettingsDAO.java 

package com.library.dao.mst;

import java.util.List;


import com.library.domain.mst.SettingsDM;

public interface SettingsDAO {
	/** Get getSettingsList based on settingid**/
	/**
	 * To get getSettingsList based on studCid and categoryName
	 * 
	 * @param Long bookCatgid,String categoryName,Long companyId,String status,Date updatedDt,String updatedBy

	 * 
	 * @return list of SettingsDM
	 */
	public  List<SettingsDM> getSettingsList(Long courseid,Long batchid,Long categoryid,String status, String extns);
	/** Method for save or update BookCategoryDM **/
	/**
	 * @param studCatObj of BookCategoryDM
	 */
	public void SaveOrUpdate(SettingsDM obj);
	
}
