package com.academic.serviceimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.TimetableDAO;
import com.academic.domain.txn.TimetableDM;
import com.academic.service.txn.TimetableService;

public class TimetableServiceImpl implements TimetableService {
	@Autowired
	private TimetableDAO timetableDAO;
	private Logger logger = Logger.getLogger(TimetableServiceImpl.class);

	/**
	 * Used to save or update the Timetable data into the database.      
	 * 
	 * @param TimetableDM
	 *            timetableobj         
	 */
	@Transactional
	public void saveOrUpdateTimetable(TimetableDM timetableobj) {
		logger.info("Inside saveOrUpdateTimetable > "
				+ "About to save the data ... ");
		timetableDAO.saveOrUpdateTimetable(timetableobj);

	}

	/**
	 * used to Retrieve data from t_acd_timetable table based on given
	 * parameters.   
	 * 
	 * @param Long timetableId, Long companyId, String batchname, String
	 *             timingname, Date startDate, Date endDate, String status
	 * @return TimetableDM List         
	 */
	@Transactional
	public List<TimetableDM> getTimetableList(Long timetableId, Long companyId,
			String batchname, String timingname, Date startDate, Date endDate,
			String status, Long courseid, Long batchId, Long classtimeId) {
		// TODO Auto-generated method stub
		return timetableDAO.getTimetableList(timetableId, companyId, batchname,
				timingname, startDate, endDate, status, courseid, batchId,
				classtimeId);
	}

}
