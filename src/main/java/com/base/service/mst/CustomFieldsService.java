package com.base.service.mst;

import java.util.List;

import com.base.domain.mst.CustomFieldsDM;

public interface CustomFieldsService {
	/** Method for save or update mbasecustom_fieldsDM **/
	/**
	 * @param mbasecustomObj
	 *            of mbasecustom_fieldsDM
	 */
	public void saveorUpdatembasecustomfields(CustomFieldsDM mbasecustomObj);
	
	/** Get mcustomfields List based on field_id **/
	/**
	 * 
	 * @param Long
	 *            field_id, String table_name, String column_name,String status
	 * 
	 * @return list of mbasecustom_fieldsDM
	 */
	public List<CustomFieldsDM> getmbasecustomfileldsList(Long field_id, String table_name, String column_name,
			String cf_status);
}

