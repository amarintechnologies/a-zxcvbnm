package com.academic.daoimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.txn.WeightageConfigDAO;
import com.academic.domain.txn.WeightageConfigDM;

@Repository
public class WeightageConfigDAOImpl implements WeightageConfigDAO {
	@Autowired
	private SessionFactory sessionfactory;

	private Logger logger = Logger.getLogger(WeightageConfigDAOImpl.class);

	/**
	 * Used to save or update the WeightageConfigDM data into the database.    
	 *  
	 * 
	 * @param WeightageConfigDM
	 *            objweightageConfigDM         
	 */
	public void saveOrUpdateWeightageConfig(
			WeightageConfigDM objweightageConfigDM) {
		sessionfactory.getCurrentSession().saveOrUpdate(objweightageConfigDM);

	}

	/**
	 * used to Retrieve data from WeightageConfigDM based on given parameters.
	 *   
	 * 
	 * @param Long weightage_id, Long batchId, String status 
	 * @return WeightageConfigDM List         
	 */
	public List<WeightageConfigDM> getWeightageConfigList(Long weightage_id,
			Long batchId, String status) {
		StringBuffer sql = new StringBuffer(" select ");

		sql.append(" c from WeightageConfigDM c, AcdbatchDM b where 1=1");
		sql.append(" and b.batch_id=c.batchId");
		Query query = null;

		if (weightage_id != null) {
			sql.append(" and c.weightage_id=" + weightage_id);
		}
		if (batchId != null) {
			sql.append(" and c.batchId=" + batchId);
		}

		if (status != null) {
			sql.append(" and c.status = '" + status + "'");
		}

		sql.append(" order by c.lastupdateddt desc");
		logger.info("Inside getWeightageConfigList > Query > " + sql);
		query = sessionfactory.getCurrentSession().createQuery(sql.toString());
		return query.list();
	}

}
