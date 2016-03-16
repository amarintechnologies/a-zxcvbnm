
package com.base.service.mst;

import java.util.List;
import com.base.domain.mst.ApprovalSchemaDM;

public interface ApprovalSchemaService {
	
	/**
	 * Method for save and update ApprovalSchemaDM data
	 * 
	 * @param apprSchmobj
	 *            of ApprovalSchemaDM
	 */
	public void saveOrUpdate(ApprovalSchemaDM apprSchmobj); 
	
	/**
	 * Method for return ApprovalSchemaDM list based on user's parameters
	 * 
	 * Long comanyID, Long brandId, Long roleId,String apprStatus,String filterType
	 * 
	 * @return ApprovalSchemaDM List
	 */
	public List<ApprovalSchemaDM> getApprovalSchemaList(Long screenId,Long companyID, Long brandId, Long roleId,String apprStatus);
	
}
