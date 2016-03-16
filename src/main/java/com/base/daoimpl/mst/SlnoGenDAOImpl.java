
package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.SlnoGenDAO;
import com.base.domain.mst.SlnoGenDM;

@Repository
public class SlnoGenDAOImpl implements SlnoGenDAO {
	Logger logger = Logger.getLogger(SlnoGenDAOImpl.class);
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * To saveOrUpdate details
	 * 
	 * @param SlnoGenDM
	 *            slnoObj
	 * 
	 */
	public void saveorupadateSlnoGeneration(SlnoGenDM slnoObj) {
		logger.info("Inside saveorupadateSlnoGeneration Details > "
				+ slnoObj.getCompanyId() + ", " + slnoObj.getKeyDesc());
		sessionFactory.getCurrentSession().saveOrUpdate(slnoObj);
	}

	/**
	 * To get serial number generation list based on user's input
	 * 
	 * @param Long
	 *            SlnoId, Long companyid, String refkey, Long branchId, Long
	 *            moduleId, String slnoGenLvl
	 * 
	 * @return List of SlnoGenDM
	 */
	public List<SlnoGenDM> getSlnoGenerationList(Long SlnoId, Long companyid,
			String refkey, Long branchId, String slnoGenLvl, String filtertype) {
		logger.debug("getSlnoGenerationList >>>  Slnoid" + SlnoId
				+ "companyid=" + companyid + " , refkey=" + refkey
				+ ",  branchId=" + branchId + "slnoGenLvl" + slnoGenLvl);
		StringBuffer sql = new StringBuffer();
		sql.append("select s.slnoId as slnoId, s.refKey as refKey, s.slnogenLevel as slnogenLevel, s.keyDesc as keyDesc, s.prefixKey as prefixKey, s.suffixKey as suffixKey, s.prefixCncat as prefixCncat, s.suffixCncat as suffixCncat,  s.branchId as branchId, ");
		sql.append(" s.currSeqNo as currSeqNo,s.autoGenYN as autoGenYN, s.lastSeqNo as lastSeqNo, s.lastUpdatedDt as lastUpdatedDt, ");
		sql.append("s.lastupdatedby as lastupdatedby ");
		if (!slnoGenLvl.equals("Company")) {
			sql.append(" , b.branchName as branchName ");
		}
		if (slnoGenLvl.equals("Company")) {
			sql.append(" from SlnoGenDM s where 1=1");
		} else {
			sql.append(" from SlnoGenDM s,BranchDM b where 1=1");
			sql.append(" and b.branchId=s.branchId ");
		}
		sql.append(" and s.slnogenLevel = '" + slnoGenLvl + "'");
		if (SlnoId != null && SlnoId != 0) {
			sql.append(" and s.slnoId=" + SlnoId);
		}
		if (companyid != null) {
			sql.append(" and s.companyId=" + companyid);
		}
		if (refkey != null && refkey.trim().length() > 0) {
			sql.append(" and lower(s.refKey) like (lower('" + refkey + "%'))");
		}
		if (branchId != null && branchId != 0) {
			sql.append(" and s.branchId=" + branchId);
		}

		sql.append(" order by s.lastUpdatedDt desc ");
		logger.debug("SlnoGenDAOImpl - Query-->" + sql);
		Query query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(SlnoGenDM.class));
		return query.list();
	}

	/**
	 * To get sequence number
	 * 
	 * @param Long
	 *            companyid,Long branchid,Long moduleid,String refkey
	 * 
	 * @return String sequence
	 * 
	 */
	public List<SlnoGenDM> getSequenceNumber(Long companyid, Long branchid,
			String refkey) {
		StringBuffer sql = new StringBuffer();
		sql.append("select s.slnoId as slnoId, s.companyId as companyId, s.branchId as branchId,");
		sql.append(" s.slnogenLevel as slnogenLevel, s.refKey as refKey,");
		sql.append(" s.autoGenYN as autoGenYN,  s.prefixKey as prefixKey,s.prefixCncat as prefixCncat,");
		sql.append(" s.prefixKey||s.prefixCncat||s.suffixKey||s.suffixCncat||s.currSeqNo as keyDesc,");
		sql.append(" s.suffixKey as suffixKey, s.suffixCncat as suffixCncat, s.currSeqNo as currSeqNo,");
		sql.append(" s.lastSeqNo as lastSeqNo, s.lastUpdatedDt as lastUpdatedDt, s.lastupdatedby as lastupdatedby,");
		sql.append(" b.branchName as branchName");
		sql.append(" from SlnoGenDM s, BranchDM b where 1=1");
		sql.append("and b.branchId=s.branchId");
		Query query = null;
		if (companyid != null) {
			sql.append(" and s.companyId=" + companyid);
		}
		if (refkey != null && refkey.trim().length() > 0) {
			sql.append(" and lower(s.refKey) like (lower('" + refkey + "%'))");
		}
		if (branchid != null && branchid != 0) {
			sql.append(" and s.branchId=" + branchid);
		}

		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(SlnoGenDM.class));
		return query.list();
	}

	/**
	 * To update sequence number
	 * 
	 * @param Long
	 *            companyid,Long branchid,Long moduleid,String refkey
	 * 
	 */
	public void updateNextSequenceNumber(Long companyid, Long branchid,
			String refkey) {
		// TODO Auto-generated method stub
		String sql1 = "update SlnoGenDM s set s.lastSeqNo =s.currSeqNo where s.companyId="
				+ companyid
				+ " and s.branchId="
				+ branchid
				+ " and s.refKey ='" + refkey + "'";
		String sql2 = "update SlnoGenDM s set s.currSeqNo=s.currSeqNo+1 where s.companyId="
				+ companyid
				+ " and s.branchId="
				+ branchid
				+ " and s.refKey ='" + refkey + "'";
		sessionFactory.getCurrentSession().createQuery(sql1).executeUpdate();
		sessionFactory.getCurrentSession().createQuery(sql2).executeUpdate();
	}
}
