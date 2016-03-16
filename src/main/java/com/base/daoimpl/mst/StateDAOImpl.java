
package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.StateDAO;
import com.base.domain.mst.StateDM;

@Repository
public class StateDAOImpl implements StateDAO {
	/** @Autowired refers that integrating the spring concepts that is using for linking with specified class **/
	/** SessionFactory refers that maintains the session until it gets expired **/
	@Autowired
	SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(StateDAOImpl.class);
	@Value("${GET_STATE_LIST}")
	private String stringSql;
	
	/**
	 *   Used to save or update the State data into the database.  
	 * 
	 * @param StateDM
	 *            stateObj         
	 */
	public void saveOrUpdateState(StateDM stateObj) {
		logger.info("Inside saveStateDetails > " + stateObj.getCompanyid() + ", " + stateObj.getStateName());
		sessionFactory.getCurrentSession().saveOrUpdate(stateObj);
	}
	
	/**
	 * used to Retrieve data from M_Base_State table based on given parameters.        
	 * 
	 * @param String stateName
	 * @param String
	 *            status
	 * @param Long countryId
	 * @param Long
	 *            companyId  
	 * @param String
	 *            filtertype        
	 * @return StateDM List        
	 */
	@SuppressWarnings("unchecked")
	public List<StateDM> getStateList(String stateName, String status, Long countryId, Long companyId, String filtertype) {
		logger.info("Inside getStateList > " + stateName + ", " + status + ", " + countryId + "," + companyId);
		Query query = null;
		StringBuffer sql = new StringBuffer(" select ");
		if (filtertype.equals("P")) {
			sql.append("  s.stateId as stateId,s.stateName as stateName from  StateDM s where 1=1 ");
		} else {
			sql.append(" s.stateId as stateId,s.stateName as stateName,s.stateCode as stateCode,");
			sql.append(" s.countryId as countryId,s.stateStatus as stateStatus,s.lastUpdatedDt as lastUpdatedDt,");
			sql.append(" s.lastUpdatedBy as lastUpdatedBy,s.companyid as companyid,c.countryName as countryName");
			sql.append(" from CountryDM c,StateDM s where 1=1 and c.countryID =s.countryId ");
		}
		if (stateName != null) {
			sql.append(" and lower(s.stateName) like lower('" + stateName + "%')");
		}
		if (status != null) {
			sql.append(" and s.stateStatus = '" + status + "'");
		}
		if (countryId != null && countryId != 0L) {
			sql.append(" and s.countryId= " + countryId);
		}
		if (companyId != null) {
			sql.append(" and s.companyid= " + companyId);
		}
		sql.append(" order by s.lastUpdatedDt desc");
		logger.info("Inside getStatetList > Query > " + sql);
		query = sessionFactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(StateDM.class));
		return query.list();
	}
}
