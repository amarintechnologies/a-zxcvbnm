package com.transport.serviceimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.transport.domain.mst.RouteDM;
import com.transport.service.mst.RouteService;

public class RouteServiceImpl implements RouteService{
	@Autowired
	private com.transport.dao.mst.RouteDAO RouteDAO;
	private Logger logger = Logger.getLogger(RouteServiceImpl.class);
	/**
	 *     * Used to save or update the Route data into the database.    
	 *  * @param objroute         
	 */
	@Transactional
	public void saveOrUpdateroute(RouteDM objroute) {
		// TODO Auto-generated method stub
		RouteDAO.saveOrUpdateroute(objroute);

	}
	/**
	 *  * used to Retrieve data from RouteDM table based on given
	 * 
	 *Long routeid,String routename,String status 
	 * 
	 * @return List<RouteDM>         
	 */
	@Transactional
	public List<RouteDM> getroutelist(Long routeid, String routename,
			String status) {
		return RouteDAO.getroutelist(routeid, routename, status);
	
}
}