//Class : SettingsDAOImpl

package com.library.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library.dao.mst.SettingsDAO;
import com.library.domain.mst.SettingsDM;

@Repository
public class SettingsDAOImpl implements SettingsDAO {
	@Autowired
	private SessionFactory SessionFactory;
	private Logger logger = Logger.getLogger(SettingsDAOImpl.class);

	public List<SettingsDM> getSettingsList(Long courseid, Long batchid,
			Long categoryid, String status, String extns) {
		// TODO Auto-generated method stub
		logger.info("Inside  getSettingsList >  " + "courseid " + courseid);
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" s.settingid as settingid,s.companyid as companyid,s.courseid as courseid,s.batchid as batchid, ");
		sql.append(" s.categoryid as categoryid,s.timeperiod as timeperiod,s.graceperiod as graceperiod,s.extnyn as extnyn, ");
		sql.append(" s.fineyn as fineyn,s.finepday as finepday,s.status as status,s.lastupdatedDt as lastupdatedDt,s.lastupdatedBy as lastupdatedBy "
				+ ", s.currencyId as currencyId ,");
		sql.append(" b.batch_name as batchName,cs.course_name as course_name,c.categoryName as categoryName ");
		sql.append(" from SettingsDM s,AcdbatchDM b,AcdCourseDM cs,BookCategoryDM as c where 1=1 ");
		sql.append(" and s.batchid=b.batch_id and s.courseid=cs.course_id and s.categoryid=c.bkCategoryid");

		Query query = null;
		if (courseid != null && courseid != 0L) {
			sql.append(" and s.courseid=" + courseid);
		}
		if (batchid != null && batchid != 0L) {
			sql.append(" and s.batchid=" + batchid);
		}

		if (categoryid != null && categoryid != 0L) {
			sql.append(" and s.categoryid=" + categoryid);
		}
		if (extns != null) {
			sql.append(" and s.extnyn='" + extns + "'");
		}

		if (status != null) {
			sql.append(" and s.status='" + status + "'");
		}
		sql.append(" order by s.lastupdatedDt desc");
		logger.info("Inside getSettingsList > Query > " + sql);
		query = SessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(SettingsDM.class));
		return query.list();
	}

	public void SaveOrUpdate(SettingsDM obj) {
		// TODO Auto-generated method stub
		SessionFactory.getCurrentSession().saveOrUpdate(obj);

	}

}
