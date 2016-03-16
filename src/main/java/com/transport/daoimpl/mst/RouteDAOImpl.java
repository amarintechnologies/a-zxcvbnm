package com.transport.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.transport.dao.mst.RouteDAO;
import com.transport.domain.mst.RouteDM;
@Repository
public class RouteDAOImpl implements RouteDAO{
	
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(RouteDAOImpl.class);
	/**
	 *     * Used to save or update the Route data into the database.    
	 *  * @param objroute         
	 */
	public void saveOrUpdateroute(RouteDM objroute) {
		sessionfactory.getCurrentSession().saveOrUpdate(objroute);
		
	}
	/**
	 *  * used to Retrieve data from RouteDM table based on given
	 * 
	 *Long routeid,String routename,String status 
	 * 
	 * @return List<RouteDM>         
	 */
	public List<RouteDM> getroutelist(Long routeid, String routename,
			String status) {
		logger.info("Inside  getroutelist >  " + "routeid " + routeid
				+ "routename " + routename + " status" + status);

		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" g.routeid as routeid,g.companyid as companyid,g.routename as routename,");
		sql.append(" g.remarks as remarks,g.status as status,g.lastupdateddt as lastupdateddt,g.lastupdatedby as lastupdatedby ");
		sql.append(" from RouteDM g where 1=1 ");
		Query query = null;
		if (routeid != null) {
			sql.append(" and g.routeid =" + routeid);
		}
		if (routename != null && routename.trim().length() > 0) {
			sql.append(" and lower(g.routename)like lower('" + routename
					+ "%')");
		}
		if (status != null && status.trim().length() > 0) {
			sql.append(" and lower(g.status)like lower('" + status + "%')");
		}
		sql.append(" order by g.lastupdateddt desc");
		logger.info("Inside getGradingList > Query > " + sql);
		query = sessionfactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(RouteDM.class));
		return query.list();
	}



}
