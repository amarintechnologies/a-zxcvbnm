
package com.base.service.mst;

import java.util.List;
import com.base.domain.mst.AppScreenFieldsDM;

public interface AppScreenFieldService {
	/**
	 * get  screen Fields list based on given parameters.
	 * @param fieldCode screenId status
	 * @return List<AppScreenFieldsDM> 
	 */
	public List<AppScreenFieldsDM> getApplicationScreenFieldsList(String fieldCode,Long screenId,String status);

	/**
	 * get  screen field ref based on given parameters.
	 * @param screenCode
	 * 
	 */
	public Long getScreenFieldRefidbasedonScreenCode(String screenCode);

}
