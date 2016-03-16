
package com.base.dao.txn;

import java.util.List;
import com.base.domain.txn.OrgNewsDM;

public interface OrgNewsDAO {
	/**
	 * Method for return OrgNewsDM list based on user's parameters
	 * 
	 * @param Long
	 *            newsId String newsTitle,String newsDesc,String newsstatus,Long companyId,Long branchId,Long deptId
	 * @return OrgNewsDM List
	 */
	public List<OrgNewsDM> getNewsList(Long newsId, String newsTitle, String newsDesc, String newsstatus,
			Long companyId, Long branchId, Long deptId);
	
	/**
	 * Method for save and update OrgNewsDM details
	 * 
	 * @param newsObj
	 *            of OrgNewsDM
	 */
	public void saveAndUpdateNews(OrgNewsDM newsObj);
}
