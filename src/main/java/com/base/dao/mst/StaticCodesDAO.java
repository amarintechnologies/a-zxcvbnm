
package com.base.dao.mst;

import java.util.List;

import com.base.domain.mst.StaticCodesDM;
import com.erputil.domain.StatusDM;

public interface StaticCodesDAO {
	/**
	 * Used to save or update the Static Codes data into the database.      
	 * 
	 * @param StaticCodesDAO staticObj
	 *                    
	 */
	public void saveOrUpdateStaticCodes(StaticCodesDM staticObj);
	
	/**
	 * used to Retrieve data from M_BASE_STATIC_CODES table based on given parameters.   
	 * 
	 * @param String tblname,String colName,String staticKey,String staticValue,Long orderBy  
	 */
	public List<StatusDM> getStaticCodesList(String tblname,String colName,String staticKey,String staticValue,Long orderBy);
}