package com.transport.service.mst;

import java.util.List;

import com.transport.domain.mst.RouteDM;

public interface RouteService {
	/**
	 *     * Used to save or update the Route data into the database.    
	 *  * @param objroute         
	 */
	public void saveOrUpdateroute(RouteDM objroute);

	/**
	 *  * used to Retrieve data from RouteDM table based on given
	 * 
	 *Long routeid,String routename,String status 
	 * 
	 * @return List<RouteDM>         
	 */

	public List<RouteDM> getroutelist(Long routeid,String routename,String status);
}


