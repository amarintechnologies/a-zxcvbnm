package com.transport.serviceimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.transport.dao.mst.RouteStopsDAO;

import com.transport.domain.mst.RouteStopsDM;
import com.transport.service.mst.RouteStopsService;

public class RouteStopsServiceImpl implements RouteStopsService {

	@Autowired
	private  RouteStopsDAO routestopsdao; 
	private Logger logger = Logger.getLogger(RouteStopsServiceImpl.class);
	/**
	 * To get details from StudentCategoryDM table depends on condition if all arguments
	 * are null it returns full list
	 * 
	 * @param Long studCid, String categoryName, String status
	 * 
	 * @return StudentCategoryDM list
	 * 
	 */
	
	@Transactional
	public List<RouteStopsDM> getroutestopsList(Long rtstopid, Long routeid,
			String stopname, String status) {
		// TODO Auto-generated method stub
	return routestopsdao.getroutestopsList(rtstopid,routeid,stopname,status);
	}
	
	@Transactional
	public void SaveorUpdate(RouteStopsDM routeobj) {
		// TODO Auto-generated method stub
		
		routestopsdao.SaveorUpdate(routeobj);
				
}
}
