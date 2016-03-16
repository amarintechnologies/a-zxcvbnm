package com.academic.serviceimpl.txn;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.txn.StudentAttendDtlDAO;
import com.academic.domain.txn.StudentAttendDtlDM;
import com.academic.service.txn.StudentAttendDtlService;
import com.base.dao.mst.StudentDAO;
import com.base.serviceimpl.mst.StudentServiceImpl;

public class StudentAttendDtlServicImpl implements StudentAttendDtlService {
	@Autowired
	private StudentAttendDtlDAO studentdao;
	private Logger logger = Logger.getLogger(StudentAttendDtlServicImpl.class);

	@Transactional
	public void saveStudentDetails(StudentAttendDtlDM studObj) {
		// TODO Auto-generated method stub
		studentdao.saveStudentDetails(studObj);

	}

	@Transactional
	public List<StudentAttendDtlDM> getStudentattdtlList(Long studentid,
			Long attendanceid, Long timetableDtlid, Long subjectid,
			String presentyn) {
		// TODO Auto-generated method stub
		return studentdao.getStudentattdtlList(studentid, attendanceid,
				timetableDtlid, subjectid, presentyn);
	}

	@Transactional
	public void updatestatus(Long attendancedtlid, String presentyn) {
		studentdao.updatestatus(attendancedtlid, presentyn);
	}

}
