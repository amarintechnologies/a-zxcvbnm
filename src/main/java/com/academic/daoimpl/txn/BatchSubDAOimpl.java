package com.academic.daoimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.BatchSubDAO;
import com.academic.domain.mst.AcdSubjectDM;
import com.academic.domain.txn.BatchSubDM;

@Repository
public class BatchSubDAOimpl implements BatchSubDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(BatchSubDAOimpl.class);

	/**
	 * This is implementation of AssetBrandDAO saveOrUpdate method. Used to save
	 * and update AssetBrandDM data in database
	 * 
	 * @param obj
	 *            of BatchSubDM
	 */

	public List<BatchSubDM> getBatchSubList(Long batchid, Long subjectid,
			String classpweek, String examyn, String status) {
		logger.info("Inside getBatchSubList >  " + subjectid + "," + examyn
				+ ", " + status);
		StringBuffer sql = new StringBuffer(" Select ");
		sql.append(" bs.batchsubjid as batchsubjid,bs.batchid as batchid,bs.subjectid as subjectid,"
				+ " bs.classpweek as classpweek,bs.examyn as examyn,bs.maxscore as maxscore,bs.passscore as passscore,"
				+ " bs.status as status,bs.lastupdateddt as lastupdateddt,bs.lastupdatedby as lastupdatedby ,"
				+ " ab.batch_name as batch_name , sb.subjectName as subjectName ");
		sql.append(" from BatchSubDM bs,AcdbatchDM ab,AcdSubjectDM  sb  where 1=1");
		sql.append(" and ab.batch_id = bs.batchid and sb.subjectId = bs.subjectid ");

		Query query = null;

		if (batchid != null) {
			sql.append(" and bs.batchid=" + batchid);
		}
		if (subjectid != null) {
			sql.append(" and bs.subjectid=" + subjectid);
		}

		if (status != null && status.trim().length() > 0) {
			sql.append(" and lower(bs.status)like lower('" + status + "%')");
		}
		sql.append(" order by bs.lastupdateddt desc");
		logger.info("Inside getBatchSubList > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(BatchSubDM.class));
		return query.list();
	}

	public void saveOrUpdate(BatchSubDM obj) {
		// TODO Auto-generated method stub
		logger.info("Inside saveAssetBrandDetails > " + obj.getSubjectid()
				+ ", " + obj.getBatchid());
		sessionfactory.getCurrentSession().saveOrUpdate(obj);

	}

	public List<BatchSubDM> getBatchSubListNoPK(Long batchid,
			String classpweek, String examyn, String status) {
		logger.info("Inside getBatchSubListNoPK >  " + ", " + status);
		StringBuffer sql = new StringBuffer(" Select ");
		sql.append(" bs.batchid as batchid,bs.subjectid as subjectid,"
				+ " bs.classpweek as classpweek,bs.examyn as examyn,bs.maxscore as maxscore,bs.passscore as passscore,"
				+ " bs.status as status,bs.lastupdateddt as lastupdateddt,bs.lastupdatedby as lastupdatedby ,"
				+ " ab.batch_name as batch_name,c.subjectName as subjectName ");
		sql.append(" from BatchSubDM bs,AcdbatchDM ab,AcdSubjectDM c where 1=1 ");
		sql.append(" and ab.batch_id = bs.batchid and c.subjectId = bs.subjectid ");

		Query query = null;

		if (batchid != null) {
			sql.append(" and bs.batchid=" + batchid);
		}

		if (status != null && status.trim().length() > 0) {
			sql.append(" and lower(bs.status)like lower('" + status + "%')");
		}
		sql.append(" order by bs.lastupdateddt desc");
		logger.info("Inside getBatchSubList > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(BatchSubDM.class));
		return query.list();
	}

	public void deleteBatchSub(Long batchSubjectId) {
		{
			logger.info("Inside deleteBtchGrpDtl >>>>>>>>>>>>>>>>>>>>>>>");

			String sql = "delete from BatchSubDM where batchid ="
					+ batchSubjectId + " ";
			sessionfactory.getCurrentSession().createQuery(sql).executeUpdate();
		}

	}

}
