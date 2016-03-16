package com.academic.daoimpl.mst;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Transient;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.dao.mst.AcdSubjectDAO;
import com.academic.domain.mst.AcdSubjectDM;
import com.academic.domain.txn.AcdbatchsubjectstaffDM;

@Repository
public class AcdSubjectDAOImpl implements AcdSubjectDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(AcdSubjectDAOImpl.class);

	public void saveOrUpdateAcdSubject(AcdSubjectDM objAcdSubj) {
		sessionFactory.getCurrentSession().saveOrUpdate(objAcdSubj);

	}

	public List<AcdSubjectDM> getAcdSubjectList(Long subjectId, Long companyId,
			String subjectName, String subjectCode, String subjectType,
			String subjectStatus, Long deptId) {

		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" m.subjectId as subjectId,m.companyId as companyId,m.subjectName as subjectName,m.subjectCode as subjectCode,"
				+ "m.subjectType as subjectType,m.subjectStatus as subjectStatus,");
		sql.append(" m.lastUpdatedDt as lastUpdatedDt,m.lastUpdatedBy as lastUpdatedBy,m.deptId as deptId,d.deptname as deptName");
		sql.append(" from AcdSubjectDM m, DepartmentDM d  where 1=1");
		sql.append(" and m.deptId = d.deptid ");
		Query query = null;

		if (subjectId != null) {
			sql.append(" and m.subjectId=" + subjectId);
		}
		if (companyId != null) {
			sql.append(" and m.companyId=" + companyId);
		}

		if (subjectName != null && subjectName.trim().length() > 0) {
			sql.append(" and lower(m.subjectName) like lower('" + subjectName
					+ "%')");
		}
		if (subjectCode != null && subjectCode.trim().length() > 0) {
			sql.append(" and lower(m.subjectCode) like lower('" + subjectCode
					+ "%')");
		}
		if (deptId != null) {
			sql.append(" and m.deptId=" + deptId);

		}

		if (subjectType != null) {
			sql.append(" and m.subjectType= '" + subjectType + "'");
		}

		if (subjectStatus != null) {
			sql.append(" and m.subjectStatus = '" + subjectStatus + "'");
		}

		sql.append(" order by m.lastUpdatedDt desc");
		logger.info("Inside getAcdSubjectList > Query > " + sql);
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(AcdSubjectDM.class));
		return query.list();

	}

}
