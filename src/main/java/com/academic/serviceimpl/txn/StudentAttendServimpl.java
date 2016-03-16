package com.academic.serviceimpl.txn;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.StudentAttendDAO;
import com.academic.domain.txn.StudentAttendenceDM;
import com.academic.service.txn.StudentAttendService;

public class StudentAttendServimpl implements StudentAttendService {

	@Autowired
	private StudentAttendDAO StudentAttendDAO;
	private Logger logger = Logger.getLogger(StudentAttendServimpl.class);

	@Transactional
	public List<StudentAttendenceDM> getStudentAttendenceList(Long companyid,
			Long timetableid, Long batchid, Long courseid, Long attendanceid,
			Date workdate) {
		// TODO Auto-generated method stub
		return StudentAttendDAO.getStudentAttendenceList(companyid,
				timetableid, batchid, courseid, attendanceid, workdate);
	}

	@Transactional
	public void saveOrUpdate(StudentAttendenceDM obj) {
		// TODO Auto-generated method stub
		StudentAttendDAO.saveOrUpdate(obj);
	}
	@Transactional
	public void updatetime(Long attendanceid, Long timetableid) {
		StudentAttendDAO.updatetime(attendanceid, timetableid);		
	}

}
