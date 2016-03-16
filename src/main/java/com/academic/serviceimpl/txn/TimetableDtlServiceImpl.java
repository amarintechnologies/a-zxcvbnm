package com.academic.serviceimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.TimetableDtlDAO;
import com.academic.domain.txn.TimetableDtlDM;
import com.academic.service.txn.TimetableDtlService;

public class TimetableDtlServiceImpl implements TimetableDtlService {
	@Autowired
	private TimetableDtlDAO timetableDtlDAO;
	private Logger logger = Logger.getLogger(TimetableDtlServiceImpl.class);

	/**
	 * Used to save or update the Grading data into the database.      
	 * 
	 * @param TimetableDtlDM
	 *            timedtlobj         
	 */
	@Transactional
	public void saveOrUpdatetimetableDtl(TimetableDtlDM timedtlobj) {
		logger.info("Inside saveOrUpdatetimetableDtl > "
				+ "About to save the data ... ");
		timetableDtlDAO.saveOrUpdatetimetableDtl(timedtlobj);

	}

	/**
	 * used to Retrieve data from t_acd_timetable_dtl table based on given
	 * parameters.   
	 * 
	 * @param Long ttabledtlid, Long timetableid, Date workdate, Long subjectId,
	 *             Long employeeId, Long roomId    
	 * @return TimetableDtlDM List         
	 */
	@Transactional
	public List<TimetableDtlDM> gettimeTableDtlList(Long ttabledtlid,
			Long timetableid, Date workdate, Long subjectId, Long employeeId,
			Long roomId,String holidayyn) {
		// TODO Auto-generated method stub
		return timetableDtlDAO.gettimeTableDtlList(ttabledtlid, timetableid,
				workdate, subjectId, employeeId, roomId,holidayyn);
	}

}
