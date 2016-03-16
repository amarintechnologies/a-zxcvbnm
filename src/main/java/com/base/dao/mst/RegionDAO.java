
package com.base.dao.mst;

import java.util.List;
import com.base.domain.mst.RegionDM;

public interface RegionDAO {
	/**
	 * Used to save or update the RegionDM data into the database.         
	 * 
	 * @param RegionDM
	 *            regionObj         
	 */
	public void saveOrUpdateRegion(RegionDM regionObj);
	
	/**
	 * used to Retrieve data from RegionDM table based on given parameters.         
	 * 
	 * @param String regionName, String status, Long countryId, Long companyId String filtertype         
	 * @return List<RegionDM>         
	 */
	public List<RegionDM> getRegionList(String regionName, String status, Long countryId, Long companyId,
			String filtertype);
}
