
package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.CompanyDAO;
import com.base.domain.mst.CompanyDM;

@Repository
public class CompanyDAOImpl implements CompanyDAO {
	/**
	 * @Autowired refers that integrating the spring concepts that is using for
	 *            linking with specified class
	 **/
	/** SessionFactory refers that maintains the session until it gets expired **/
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(CompanyDAOImpl.class);

	/**
	 * Method for save or update CompanyDM
	 * 
	 * @param companyObj
	 *            of CompanyDM
	 */
	public void saveorUpdateCompanyDetails(CompanyDM companyObj) {
		sessionFactory.getCurrentSession().saveOrUpdate(companyObj);
	}

	/** Method for return the CompanyDM list by company name and status **/
	/**
	 * 
	 * @param String
	 *            companyName, String status, Long companyId
	 * 
	 * @return list of CompanyDM
	 */
	public List<CompanyDM> getCompanyList(String companyName, String status,
			Long companyId) {
		logger.info("Inside getCompanyList >  " + "companyName " + companyName
				+ ", status " + status + ", companyId" + companyId);
		StringBuffer sql = new StringBuffer("select");
		sql.append(" co.companyid as companyid, co.companyname as companyname, co.companycode as companycode,");
		sql.append(" co.companyaddress as companyaddress, co.postcode as postcode, co.countryid as countryid,");
		sql.append(" co.stateid as stateid, co.cityid as cityid,co.phone as phone,");
		sql.append(" co.emailid as emailid, co.regno as regno, ");
		sql.append(" co.faxno as faxno, co.website as website, co.panno as panno,");
		sql.append(" co.employerno as employerno, co.esino as esino, co.pfno as pfno,");
		sql.append("  co.companylogo as companylogo,co.companystatus as companystatus,");
		sql.append(" co.currencyId as currencyId, co.lastupdateddt as lastupdateddt, co.lastupdatedby as lastupdatedby, ");
		sql.append(" cn.countryName as countryName, s.stateName as stateName, ci.cityname as cityName, ");
		sql.append(" cr.ccysymbol as currencyName ");
		sql.append(" from CompanyDM co, CountryDM cn, StateDM s, CityDM ci, CurrencyDM cr where 1=1 ");
		sql.append(" and co.countryid = cn.countryID  and s.countryId= cn.countryID and co.stateid  = s.stateId  ");
		sql.append(" and ci.stateId= s.stateId and co.cityid =ci.cityid  and co.currencyId = cr.ccyid ");
		Query query = null;
		if (companyName != null && companyName.trim().length() > 0) {
			sql.append(" and lower(co.companyname) like lower('" + companyName
					+ "%')");
		}
		if (status != null) {
			sql.append(" and co.companystatus =  '" + status + "'");
		}
		if (companyId != null) {
			sql.append(" and co.companyid=" + companyId);
		}
		sql.append(" order by co.lastupdateddt desc");
		logger.info("Inside getCompanyList > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(CompanyDM.class));
		return query.list();
	}
}
