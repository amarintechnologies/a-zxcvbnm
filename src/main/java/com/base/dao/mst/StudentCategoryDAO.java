package com.base.dao.mst;

import java.util.Date;
import java.util.List;

import com.base.domain.mst.StudentCategoryDM;


public interface StudentCategoryDAO {
	/** Method for save or update StudentCategoryDM **/
	/**
	 * @param studCatObj of StudentCategoryDM
	 */
public void updateStudentCategoryDetails(StudentCategoryDM studCatObj);
/** Get getStudentCategoryList based on studCid**/
/**
 * To get getStudentCategoryList based on studCid and categoryName
 * 
 * @param Long studCid,String categoryName,Long companyId,String status,Date updatedDt,String updatedBy

 * 
 * @return list of StudentCategoryDM
 */
public List<StudentCategoryDM> getStudentCategoryList(Long studCid,String categoryName,Long companyId,String status);

}

