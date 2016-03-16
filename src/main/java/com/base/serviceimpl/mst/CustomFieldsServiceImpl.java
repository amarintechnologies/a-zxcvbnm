package com.base.serviceimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.mst.CustomFieldsDAO;
import com.base.domain.mst.CustomFieldsDM;
import com.base.service.mst.CustomFieldsService;

public class CustomFieldsServiceImpl implements CustomFieldsService {
	@Autowired
	private CustomFieldsDAO mbasecustom_fieldsDAO;
	private Logger logger = Logger.getLogger(CustomFieldsServiceImpl.class);
	
	/**
	 * To save mbasecustom_fieldsDM details
	 * 
	 * @param mbasecustom_fieldsDM
	 *            mbasecustomObj
	 * 
	 */
	@Transactional
	public void saveorUpdatembasecustomfields(CustomFieldsDM mbasecustomObj) {
		// TODO Auto-generated method stub
		logger.info("Inside saveAndUpdate > " + "About to save the data ... ");
		mbasecustom_fieldsDAO.saveorUpdatembasecustomfields(mbasecustomObj);
	}
	
	/** Get mcustomfields List based on field_id **/
	/**
	 * 
	 * @param Long
	 *            field_id, String table_name, String column_name,String status
	 * 
	 * @return list of mbasecustom_fieldsDM
	 */
	@Transactional
	public List<CustomFieldsDM> getmbasecustomfileldsList(Long field_id, String table_name, String column_name,
			String cf_status) {
		// TODO Auto-generated method stub
		return mbasecustom_fieldsDAO.getmbasecustomfileldsList(field_id, table_name, column_name, cf_status);
	}
}
