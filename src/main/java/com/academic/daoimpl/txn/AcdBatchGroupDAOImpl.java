package com.academic.daoimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.AcdBatchGroupDAO;
import com.academic.domain.txn.AcdBatchGroupDM;

@Repository
public class AcdBatchGroupDAOImpl implements AcdBatchGroupDAO {
	@Autowired
	private SessionFactory sessionfactory;

	private Logger logger = Logger.getLogger(AcdBatchGroupDAOImpl.class);

	public void saveAcdBatchGroup(AcdBatchGroupDM objAcdBtch) {
		sessionfactory.getCurrentSession().saveOrUpdate(objAcdBtch);
	}

	public List<AcdBatchGroupDM> getAcdBatchGroupList(Long batchGrpid,
			Long companyId, String groupName, String batchGrpstatus) {
		StringBuffer sql = new StringBuffer(" select ");

		sql.append(" c from AcdBatchGroupDM c where 1=1");
		Query query = null;

		if (batchGrpid != null) {
			sql.append(" and c.batchGrpid=" + batchGrpid);
		}
		if (companyId != null) {
			sql.append(" and c.companyId=" + companyId);
		}

		if (groupName != null && groupName.trim().length() > 0) {
			sql.append(" and lower(c.groupName) like lower('" + groupName
					+ "%')");
		}

		if (batchGrpstatus != null) {
			sql.append(" and c.batchGrpstatus = '" + batchGrpstatus + "'");
		}

		sql.append(" order by c.lastUpdatedDt desc");
		logger.info("Inside getAcdBatchGroupList > Query > " + sql);
		query = sessionfactory.getCurrentSession().createQuery(sql.toString());
		return query.list();
	}

}
