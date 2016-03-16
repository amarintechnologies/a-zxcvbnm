package com.academic.dao.txn;

import java.util.Date;
import java.util.List;

import com.academic.domain.txn.CommentsDM;
import com.academic.domain.txn.EventsDM;

public interface EventsDAO {
	/**
	 * Used to save or update the events data into the database.      
	 * 
	 * @param EventsDM eventsObj
	 *                    
	 */
	public void saveOrUpdateEvents(EventsDM eventsObj);

	/**
	 * used to Retrieve data from t_acd_events table based on given parameters.   
	 * 
	 * @param Long eventId, Long compId, Long empId,Long studId,Date eventDt,String eventType,String status,String filterTyp  
	 */
	public List<EventsDM> getEventsList(Long eventId, Long compId, Long empId,Long studId,Date eventDt,String eventType,String status,String filterType);
}
