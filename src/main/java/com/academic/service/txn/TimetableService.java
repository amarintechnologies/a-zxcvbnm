package com.academic.service.txn;

import java.util.Date;
import java.util.List;

import com.academic.domain.txn.TimetableDM;

public interface TimetableService {
	/**
	 * Used to save or update the Timetable data into the database.      
	 * 
	 * @param TimetableDM
	 *            timetableobj         
	 */
	public void saveOrUpdateTimetable(TimetableDM timetableobj);

	/**
	 * used to Retrieve data from t_acd_timetable table based on given
	 * parameters.   
	 * 
	 * @param Long timetableId, Long companyId, String batchname, String
	 *             timingname, Date startDate, Date endDate, String status,Long
	 *             classtimeId
	 * @return TimetableDM List         
	 */
	public List<TimetableDM> getTimetableList(Long timetableId, Long companyId,
			String batchname, String timingname, Date startDate, Date endDate,
			String status, Long courseid, Long batchId, Long classtimeId);
}
