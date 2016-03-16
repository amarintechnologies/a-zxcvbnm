package com.academic.daoimpl.txn;

import java.math.BigDecimal;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.AcdBatchGrpDtlDAO;
import com.academic.domain.txn.AcdBatchGroupDtlDM;

@Repository
public class AcdBatchGrpDtlDAOImpl implements AcdBatchGrpDtlDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(AcdBatchGrpDtlDAOImpl.class);

	/**
	 *     * Used to save or update the AcdBatchGroupDtlDM data into the
	 * database.      * @param objAcdSubj         
	 */
	public void saveAcdBatchGrpDtl(AcdBatchGroupDtlDM objAcdSubj) {
		sessionFactory.getCurrentSession().saveOrUpdate(objAcdSubj);
	}

	/**
	 *  used to Retrieve data from AcdBatchGroupDtlDM table based on given
	 * parameters.          
	 * 
	 * @param  Long batchGrpdtlId, Long batchGrpid, Long batchId, String
	 *         batchGrpDtlStatus     @return List<AcdBatchGroupDtlDM>         
	 */

	public List<AcdBatchGroupDtlDM> getAcdBatchGrpDtlList(Long batchGrpdtlId,
			Long batchGrpid, Long batchId, String batchGrpDtlStatus) {

		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" c.batchGrpdtlId as batchGrpdtlId,c.batchGrpid as batchGrpid,c.batchId as batchId,"
				+ " c.batchGrpDtlStatus as batchGrpDtlStatus,c.lastUpdatedDt as lastUpdatedDt,c.lastUpdatedBy as"
				+ " lastUpdatedBy");

		sql.append(" from AcdBatchGroupDtlDM c ,AcdBatchGroupDM ag   where 1=1  ");
		sql.append(" and ag.batchGrpid=c.batchGrpid ");

		Query query = null;

		if (batchGrpdtlId != null) {
			sql.append(" and c.batchGrpdtlId=" + batchGrpdtlId);
		}
		if (batchGrpid != null) {
			sql.append(" and c.batchGrpid=" + batchGrpid);
		}
		if (batchId != null) {
			sql.append(" and c.batchId=" + batchId);
		}

		if (batchGrpDtlStatus != null) {
			sql.append(" and c.batchGrpDtlStatus = '" + batchGrpDtlStatus + "'");
		}

		sql.append(" order by c.lastUpdatedDt desc");
		logger.info("Inside getAcdBatchGrpDtlList > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(AcdBatchGroupDtlDM.class));
		return query.list();
	}

	
	public void deleteBtchGrpDtl(Long grpId) {
		{
			logger.info("Inside deleteBtchGrpDtl >>>>>>>>>>>>>>>>>>>>>>>");

			String sql = "delete from m_acd_batch_group_dtl where batch_grpid ="
					+ grpId + " ";
			sessionFactory.getCurrentSession().createSQLQuery(sql)
					.executeUpdate();
		}

	}
}
