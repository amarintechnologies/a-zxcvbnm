package com.academic.serviceimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.academic.dao.mst.AcdSubjectDAO;
import com.academic.domain.mst.AcdSubjectDM;
import com.academic.service.mst.AcdSubjectService;

public class AcdSubjectServiceImpl implements AcdSubjectService {
	@Autowired
	private AcdSubjectDAO actSubjDAO;
	private Logger logger = Logger.getLogger(AcdSubjectServiceImpl.class);

	@Transactional
	// @CacheEvict(value = " ", allEntries = true)
	public void saveOrUpdateAcdSubject(AcdSubjectDM objAcdSubj) {
		actSubjDAO.saveOrUpdateAcdSubject(objAcdSubj);
	}

	@Transactional
	// @Cacheable(value = " ")
	public List<AcdSubjectDM> getAcdSubjectList(Long subjectId, Long companyId,
			String subjectName, String subjectCode, String subjectType,
			String subjectStatus, Long deptId) {
		return actSubjDAO.getAcdSubjectList(subjectId, companyId, subjectName,
				subjectCode, subjectType, subjectStatus, deptId);
	}

}
