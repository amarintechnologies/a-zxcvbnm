
package com.base.serviceimpl.txn;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.cache.annotation.CacheEvict;
import com.base.dao.txn.OrgNewsDAO;
import com.base.domain.txn.OrgNewsDM;
import com.base.service.txn.OrgNewsService;

public class OrgNewsServiceImpl implements OrgNewsService {
	// initialize the Logger
	private Logger logger = Logger.getLogger(OrgNewsServiceImpl.class);
	@Autowired
	private OrgNewsDAO orgdao;
	
	/**
	 * To return data from OrgNewsDM based on user's input
	 * 
	 * @param Long
	 *            newsId,String newsTitle,String newsDesc,String status,Long companyId,Long branchId,Long deptId
	 * @return OrgNewsDM List
	 */
	@Transactional
	@Cacheable(value = "OrgNews")
	public List<OrgNewsDM> getNewsList(Long newsId, String newsTitle, String newsDesc, String status, Long companyId,
			Long branchId, Long deptId) {
		logger.info("Inside ServiceImpl getNewsList > " + "About to get orgNews. list for " + companyId + ", " + newsId
				+ "," + newsTitle + ", " + status);
		return orgdao.getNewsList(newsId, newsTitle, newsDesc, status, companyId, branchId, deptId);
	}
	
	/**
	 * To save or update OrgNewsDM details.
	 * 
	 * @param OrgNewsDM
	 *            newsObj
	 */
	@Transactional
	@CacheEvict(value = "OrgNews", allEntries = true)
	public void saveAndUpdateNews(OrgNewsDM newsObj) {
		logger.info("Inside saveAndUpdateNews > " + "About to save the data ... ");
		orgdao.saveAndUpdateNews(newsObj);
	}
}
