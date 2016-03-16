package com.academic.dao.txn;

import java.util.Date;
import java.util.List;

import com.academic.domain.txn.TimetableDtlDM;

public interface TimetableDtlDAO {
	/**
	 * Used to save or update the Grading data into the database.      
	 * 
	 * @param TimetableDtlDM
	 *            timedtlobj         
	 */
	public void saveOrUpdatetimetableDtl(TimetableDtlDM timedtlobj);

	/**
	 * used to Retrieve data from t_acd_timetable_dtl table based on given
	 * parameters.   
	 * 
	 * @param Long ttabledtlid, Long timetableid, Date workdate, Long subjectId,
	 *             Long employeeId, Long roomId    
	 * @return TimetableDtlDM List         
	 */
	public List<TimetableDtlDM> gettimeTableDtlList(Long ttabledtlid,
			Long timetableid, Date workdate, Long subjectId, Long employeeId,
			Long roomId,String holidayyn);
}
