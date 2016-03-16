package com.academic.serviceimpl.mst;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.academic.dao.mst.GradeSectionDAO;
import com.academic.domain.mst.GradeSectionDM;
import com.academic.service.mst.GradeSectionService;

public class GradeSectionServiceImpl implements GradeSectionService {
	@Autowired
	private GradeSectionDAO gradeSectionDAO;
	private Logger logger = Logger.getLogger(GradeSectionServiceImpl.class);

	@Transactional
	public void saveOrUpdateGradingSection(GradeSectionDM gradeSecobj) {
		logger.info("Inside saveOrUpdateGradingSection > "
				+ "About to save the data ... ");
		gradeSectionDAO.saveOrUpdateGradingSection(gradeSecobj);

	}

	@Transactional
	public List<GradeSectionDM> getGradeSectionList(Long gradeSectnId,
			Long companyId, String gradeSecName, String status) {
		// TODO Auto-generated method stub
		return gradeSectionDAO.getGradeSectionList(gradeSectnId, companyId,
				gradeSecName, status);
	}

}
