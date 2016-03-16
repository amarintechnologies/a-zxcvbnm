package com.library.serviceimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.library.dao.mst.BookCategoryDAO;
import com.library.dao.mst.SettingsDAO;
import com.library.daoimpl.mst.BookCategoryDAOimpl;
import com.library.domain.mst.SettingsDM;
import com.library.service.mst.SettingsService;

public class SettingsServiceImpl implements SettingsService {

	@Autowired
	private SettingsDAO settingsdao;
	private Logger logger = Logger.getLogger(SettingsServiceImpl.class);

	@Transactional
	public List<SettingsDM> getSettingsList(Long courseid, Long batchid,
			Long categoryid, String status, String extns) {
		// TODO Auto-generated method stub
		return settingsdao.getSettingsList(courseid, batchid, categoryid,
				status, extns);
	}

	@Transactional
	public void SaveOrUpdate(SettingsDM obj) {
		// TODO Auto-generated method stub
		settingsdao.SaveOrUpdate(obj);

	}

}
