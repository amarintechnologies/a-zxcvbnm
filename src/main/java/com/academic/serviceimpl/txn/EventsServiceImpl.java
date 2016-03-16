package com.academic.serviceimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.CommentsDAO;
import com.academic.dao.txn.EventsDAO;
import com.academic.domain.txn.EventsDM;
import com.academic.service.txn.EventsService;

public class EventsServiceImpl implements EventsService{
	@Autowired
	private EventsDAO eventsDAO;
	private Logger logger = Logger.getLogger(EventsServiceImpl.class);
	/**
	 * Used to save or update the Comments data into the database.              
	 */
	@Transactional
	public void saveOrUpdateEvents(EventsDM eventsObj) {
		// TODO Auto-generated method stub
		logger.info("Inside saveOrUpdateState > " + "About to save the data ... ");
		eventsDAO.saveOrUpdateEvents(eventsObj);
	}
	@Transactional
	public List<EventsDM> getEventsList(Long eventId, Long compId, Long empId,
			Long studId, Date eventDt, String eventType, String status,
			String filterType) {
		// TODO Auto-generated method stub
		return eventsDAO.getEventsList(eventId, compId, empId, studId, eventDt, eventType, status, filterType);
	}

}
