
package com.base.dao.mst;

import java.util.List;
import com.base.domain.mst.FieldAccessConfigDM;

public interface FieldAccessConfigDAO {
	/**
	 * Method for save and update FieldAccessConfigDM Data
	 * 
	 * @param accessobj
	 *            of FieldAccessConfigDM
	 */
	public void saveFieldAccessConfigDetails(FieldAccessConfigDM accessobj);
	/**
	 * Method for return FieldAccessConfigDM list based on user's parameters
	 * 
	 * @param Long screenid,String
	 *            screenFldRef,Long companyId,Long branchId,Long roleid,String status
	 * 
	 * @return List of FieldAccessConfigDM
	 */
	public List<FieldAccessConfigDM> getFieldAccessConfigList(Long screenid,String screenFldRef, Long companyId, Long branchId,
			Long roleid, String status);
}
