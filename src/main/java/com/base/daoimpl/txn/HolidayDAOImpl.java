
package com.base.daoimpl.txn;

import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.base.dao.txn.HolidayDAO;
import com.base.domain.txn.HolidaysDM;
import com.erputil.util.DateUtils;

@Repository
public class HolidayDAOImpl implements HolidayDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(HolidayDAOImpl.class);
	
	/**
	 * Method for return HolidayDM list based on user's parameters
	 * 
	 * @param Long
	 *            holidayId
	 * @param String
	 *            holidayName
	 * @param Long
	 *            branchId
	 * @param String
	 *            holidayStatus
	 * @param Long
	 *            companyId
	 * @param Date
	 *            holidayDt
	 * @param String
	 *            filtertype
	 * @return List<HolidaysDM>
	 */
	public List<HolidaysDM> getHolidaysList(Long holidayId, String holidayName, Long branchId, String holidayStatus,
			Long companyId, Date holidayDt, String filtertype) {
		logger.info("Inside getHolidaysList > " + holidayId + "," + holidayName + ", " + branchId + ", "
				+ holidayStatus + "," + companyId + "," + holidayDt);
		StringBuffer sql = new StringBuffer(" select");
		if (filtertype.equals("P")) {
			sql.append(" new HolidaysDM(holidayId,holidayName) ");
			sql.append(" from HolidaysDM h where 1=1 ");
		} else {
			sql.append(" h.holidayId as holidayId,h.holidayName as holidayName,h.companyid as companyid,");
			sql.append(" h.branchId as branchId,h.holidayDate as holidayDate,h.holidaySession as holidaySession,");
			sql.append(" h.holidayStatus as holidayStatus,h.lastUpdatedDate as lastUpdatedDate,h.lastUpdatedBy as lastUpdatedBy,");
			sql.append(" b.branchName as branchName");
			sql.append(" from HolidaysDM h,BranchDM b where h.branchId=b.branchId ");
		}
		Query query = null;
		if (holidayId != null && holidayId != 0L) {
			sql.append(" and h.holidayId=" + holidayId);
		}
		if (holidayName != "" && holidayName != null) {
			sql.append(" and lower(h.holidayName) like lower('" + holidayName + "%')");
		}
		if (branchId != null && branchId != 0L) {
			sql.append(" and h.branchId=" + branchId);
		}
		if (holidayStatus != null) {
			sql.append(" and h.holidayStatus = '" + holidayStatus + "'");
		}
		if (companyId != null) {
			sql.append("and h.companyid=" + companyId);
		}
		if (holidayDt != null) {
			sql.append(" and h.holidayDate='" + DateUtils.datetostring(holidayDt) + "'");
		}
		sql.append(" order by h.lastUpdatedDate Asc");
		logger.info("Inside getHolidaysList>" + query);
		query = sessionfactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(HolidaysDM.class));
		return query.list();
	}
	
	/**
	 * To saveAndUpdate details
	 * 
	 * @param HolidaysDM
	 *            holidayObj
	 * 
	 */
	public void saveAndUpdate(HolidaysDM holidayObj) {
		logger.info("Inside saveAndUpdate > " + holidayObj.getCompanyid() + ", " + holidayObj.getHolidayName());
		sessionfactory.getCurrentSession().saveOrUpdate(holidayObj);
	}
}
