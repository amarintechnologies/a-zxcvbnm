
package com.base.service.txn;

import java.util.List;
import com.base.domain.txn.OrgNewsDM;

public interface OrgNewsService {
	/**
	 * Method for get OrgNewsDM List based on user's parameters
	 * 
	 * @param Long
	 *            newsId,String newsTitle,String newsDesc,String newsStatus,Long companyId,Long branchId,Long deptId
	 * @return OrgNewsDM List
	 */
	public List<OrgNewsDM> getNewsList(Long newsId, String newsTitle, String newsDesc, String newsStatus,
			Long companyId, Long branchId, Long deptId);
	
	/**
	 * Method for save and update OrgNewsDM Details
	 * 
	 * @param OrgNewsDM
	 *            newsObj
	 */
	public void saveAndUpdateNews(OrgNewsDM newsObj);
}
