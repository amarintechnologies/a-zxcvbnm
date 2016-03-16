
package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.BranchDAO;
import com.base.domain.mst.BranchDM;

@Repository
public class BranchDAOImpl implements BranchDAO {
	/** @Autowired refers that integrating the spring concepts that is using for linking with specified class **/
	/** SessionFactory refers that maintains the session until it gets expired **/
	@Autowired
	SessionFactory sessionFactory;
	@Value("${GET_BRANCH_LIST_F}")
	private String SqlBranchList;
	@Value("${GET_BRANCH_LIST_P}")
	private String SqlBranchParsList;
	private Logger logger = Logger.getLogger(BranchDAOImpl.class);
	
	/**
	 *         * Used to save or update the BranchDM data into the database.         * @param branchObj         
	 */
	public void saveOrUpdateBranch(BranchDM branchObj) {
		logger.info("Inside saveOrUpdateBranch" + branchObj.getBranchName() + "," + branchObj.getStatus() + ",");
		sessionFactory.getCurrentSession().saveOrUpdate(branchObj);
	}
	
	/**
	 *         * used to Retrieve data from BranchDM table based on given parameters.         *          * @param 
	 * branchId branchName countryId status companyId filterType        * @return List<BranchDM>         
	 */
	@SuppressWarnings("unchecked")
	public List<BranchDM> getBranchList(Long branchId, String branchName, Long countryId, String status,
			Long companyId, String filterType) {
		// TODO Auto-generated method stub
		List<BranchDM> branchlist = null;
		StringBuffer sql = new StringBuffer(" select ");
		if (filterType.equals("P")) {
			sql.append(" b.branchId as branchId, b.branchName as branchName");
			sql.append(" from BranchDM b where 1=1 ");
		} else {
			sql.append(" b.branchId as branchId, b.branchName as branchName, b.branchAddress as branchAddress, ");
			sql.append(" b.postCode as postCode, b.cityId as cityId, b.stateId as stateId, b.countryId as countryId, ");
			sql.append(" b.phoneNo as phoneNo, b.emailId as emailId, b.regNo as regNo, b.tanNo as tanNo, b.stNo as stNo, ");
			sql.append(" b.status as status, b.lastUpdatedDt as lastUpdatedDt, b.lastUpdatedBy as lastUpdatedBy, ");
			sql.append(" c.countryName as countryName, s.stateName as stateName, y.cityname as cityName ");
			sql.append(" from BranchDM b,CountryDM c, StateDM s, CityDM y where 1=1");
			sql.append(" and c.countryID=b.countryId and s.stateId=b.stateId and y.cityid=b.cityId ");
		}
		Query query = null;
		if (branchId != null) {
			sql.append(" and b.branchId = " + branchId);
		}
		if (branchName != null && branchName.trim().length() > 0) {
			sql.append(" and lower(b.branchName) like (lower('" + branchName + "%'))");
		}
		if (countryId != null) {
			sql.append(" and b.countryId = " + countryId);
		}
		if (status != null) {
			sql.append(" and b.status = '" + status + "'");
		}
		if (companyId != null) {
			sql.append(" and b.companyid = " + companyId);
		}
		sql.append("  order by b.lastUpdatedDt  desc");
		logger.info("getBranchList>   " + sql);
		query = sessionFactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(BranchDM.class));
		return query.list();
	}
	
	/**
	 * Method for return list of Branch Name from BranchDM based on countryId
	 * 
	 * @param Long
	 *            countryId
	 */
	public String getBranchbyCountryId(Long countryId) {
		logger.info("Inside getBranchbyCountryId " + countryId);
		String sql = "select b.branchName from BranchDM b where b.countryId=" + countryId;
		logger.info("Inside getBranchbyCountryId > Query > " + sql);
		Query query = sessionFactory.getCurrentSession().createQuery(sql)
				.setResultTransformer(Transformers.aliasToBean(BranchDM.class));
		return String.valueOf(query.list().get(0)).toString();
	}
}
