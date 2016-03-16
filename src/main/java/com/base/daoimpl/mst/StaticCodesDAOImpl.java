
package com.base.daoimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.base.dao.mst.StaticCodesDAO;
import com.base.domain.mst.StateDM;
import com.base.domain.mst.StaticCodesDM;
import com.erputil.domain.StatusDM;

@Repository
public class StaticCodesDAOImpl implements StaticCodesDAO {
	@Autowired
	private SessionFactory sessionfactory;
	
	private Logger logger = Logger.getLogger(StaticCodesDAOImpl.class);

	/**
	 *   Used to save or update the StaticCodes data into the database.  
	 * 
	 * @param StaticCodesDM
	 *            staticObj         
	 */
	public void saveOrUpdateStaticCodes(StaticCodesDM staticObj) {
		logger.info("Inside saveStateDetails > ");
		sessionfactory.getCurrentSession().saveOrUpdate(staticObj);
	}
	/**
	 * used to Retrieve data from M_BASE_STATIC_CODES table based on given parameters.   
	 * 
	 * @param String tblname,String colName,String staticKey,String staticValue,Long orderBy  
	 */

	public List<StatusDM> getStaticCodesList(String tblname,String colName,
			String staticKey, String staticValue, Long orderBy) {
		logger.info("Inside getStaticCodesList > " + colName + ", " + staticKey
				+ ", " + staticValue + "," + orderBy);
		StringBuilder sql = new StringBuilder(
				"select s.staticKey as code,s.staticValue as desc from StaticCodesDM s where 1=1 ");
		Query query = null;
		if (tblname != null) {
			sql.append(" and s.tblName like '" + tblname + "%'");
		}
		if (colName != null) {
			sql.append(" and s.columnName like '" + colName + "%'");
		}
		if (staticKey != null) {
			sql.append(" and s.staticKey like '" + staticKey + "%'");
		}
		if (staticValue != null) {
			sql.append(" and s.staticValue like '" + staticValue + "%'");
		}
		if (orderBy != null) {
			sql.append(" and s.orderBy= " + orderBy);
		}
		sql.append(" order by s.orderBy");
		logger.info("Inside getStaticCodesList > Query > " + sql);
		query = sessionfactory.getCurrentSession().createQuery(sql.toString()).setResultTransformer(Transformers.aliasToBean(StatusDM.class));
		return query.list();
	}
}
