package com.academic.serviceimpl.mst;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.mst.AcdDeceaseDAO;
import com.academic.domain.mst.AcdDeceaseDM;
import com.academic.service.mst.AcdDeceaseService;




public class DeceaseServimpl implements AcdDeceaseService {
	@Autowired
	private AcdDeceaseDAO acdDeceaseDAO;
	private Logger logger = Logger.getLogger(DeceaseServimpl.class);
	
	/**
	 * To get details from StudentCategoryDM table depends on condition if all arguments
	 * are null it returns full list
	 * 
	 * @param Long studCid, String categoryName, String status
	 * 
	 * @return StudentCategoryDM list
	 * 
	 */
	@Transactional
	public List<AcdDeceaseDM> getAcdDeceaseList(Long deceaseid,String deceasename,Long companyId,String status){
			
		// TODO Auto-generated method stub
		return acdDeceaseDAO.getAcdDeceaseList(deceaseid, deceasename, companyId, status);
	}
	
	@Transactional
	public void saveOrUpdate(AcdDeceaseDM obj) {
		// TODO Auto-generated method stub
		logger.info("Inside saveAndUpdate > " + "About to save the data ... ");
		acdDeceaseDAO.saveOrUpdate(obj);
	}

}
