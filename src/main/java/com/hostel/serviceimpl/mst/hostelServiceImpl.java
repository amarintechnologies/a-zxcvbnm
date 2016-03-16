package com.hostel.serviceimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.mst.StudentContactsDAO;
import com.base.serviceimpl.mst.StudentContactsServiceImpl;
import com.hostel.dao.mst.hostelDAO;
import com.hostel.dm.mst.hostelDM;
import com.hostel.service.mst.hostelService;

public class hostelServiceImpl implements hostelService {
	@Autowired
	private hostelDAO hostDAO;
	private Logger logger = Logger.getLogger(hostelServiceImpl.class);
	/** Method for save or update hostelDM**/
	/**
	 * @param studCatObj of hostelDM
	 */
	@Transactional

	public void saveorupdateDetails(hostelDM Obj) {
		hostDAO.saveorupdateDetails(Obj);		
	}
	/** Get gethostelList  based on hostel_id**/
	/**
	 * To get gethostelList  based on hostel_id and  Name
	 * 
	 * @param Long hostel_id,Long company_id,String hostel_type,String status

	 * 
	 * @return list of hostelDM
	 */
	@Transactional

	public List<hostelDM> gethostelList(Long hostel_id, Long company_id,
			String hostel_type, String status,String hostel_name) {
		// TODO Auto-generated method stub
		return hostDAO.gethostelList(hostel_id, company_id, hostel_type, status,hostel_name);
	}

}
