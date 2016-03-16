package com.transport.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library.domain.mst.BookCategoryDM;
import com.transport.dao.mst.RouteStopsDAO;
import com.transport.domain.mst.RouteStopsDM;

@Repository
public class RouteStopsDAOImpl implements RouteStopsDAO {

	@Autowired
	private SessionFactory SessionFactory;
	private Logger logger = Logger.getLogger(RouteStopsDAOImpl.class);

	public List<RouteStopsDM> getroutestopsList(Long rtstopid, Long routeid,
			String stopname, String status) {
		// TODO Auto-generated method stub
		logger.info("Inside  getroutestopsList >  " + "rtstopid " + rtstopid);
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" rs.rtstopid as rtstopid,rs.routeid as routeid,rs.stopname as stopname,rs.studentfee as studentfee,rs.staffee as staffee,rs.status as status, ");
		sql.append(" rs.lastupdateddt as lastupdateddt,rs.lastupdatedby as lastupdatedby ");
		sql.append(" from RouteStopsDM rs where 1=1 ");
		// sql.append(" from RouteStopsDM rs,RouteDM r where 1=1 ");
		// sql.append(" and r.routeid = rs.routeid");
		Query query = null;
		if (rtstopid != null) {
			sql.append(" and rs.rtstopid =" + rtstopid);
		}
		if (routeid != null) {
			sql.append(" and rs.routeid =" + routeid);
		}
		if (stopname != null && stopname.trim().length() > 0) {
			sql.append(" and lower(rs.stopname)like lower('" + stopname + "%')");
		}

		if (status != null && status.trim().length() > 0) {
			sql.append(" and lower(rs.status)like lower('" + status + "%')");
		}
		sql.append(" order by rs.lastupdateddt desc");
		logger.info("Inside getroutestopsList > Query > " + sql);
		query = SessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(RouteStopsDM.class));
		return query.list();
	}

	public void SaveorUpdate(RouteStopsDM routeobj) {
		// TODO Auto-generated method stub
		SessionFactory.getCurrentSession().saveOrUpdate(routeobj);

	}

}
