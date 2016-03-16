package com.hostel.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.base.daoimpl.mst.StudentContactsDAOImpl;
import com.base.domain.mst.StudentContactsDM;
import com.hostel.dao.mst.hostelDAO;
import com.hostel.dm.mst.hostelDM;
import com.hostel.dm.mst.roomDM;

@Repository
public class hostelDAOImpl implements hostelDAO {

	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(hostelDAOImpl.class);

	/** Method for save or update hostelDM **/
	/**
	 * @param studCatObj
	 *            of hostelDM
	 */
	public void saveorupdateDetails(hostelDM Obj) {
		sessionFactory.getCurrentSession().saveOrUpdate(Obj);

	}

	/** Get gethostelList based on hostel_id **/
	/**
	 * To get gethostelList based on hostel_id and Name
	 * 
	 * @param Long
	 *            hostel_id,Long company_id,String hostel_type,String status
	 * 
	 * 
	 * @return list of hostelDM
	 */

	public List<hostelDM> gethostelList(Long hostel_id, Long company_id,
			String hostel_type, String status, String hostel_name) {
		StringBuffer sql = new StringBuffer(" select ");
		sql.append(" st.hostel_id as hostel_id,st.company_id as company_id,st.hostel_name as hostel_name,st.hostel_type as hostel_type,st.no_of_rooms as no_of_rooms,");
		sql.append(" st.remarks as remarks,st.status as status,st.last_updated_dt as last_updated_dt,st.last_updated_by as last_updated_by");
		sql.append(" from hostelDM st where 1=1");
		Query query = null;
		if (hostel_id != null) {
			sql.append(" and st.hostel_id =" + hostel_id);
		}
		if (company_id != null) {
			sql.append(" and st.company_id =" + company_id);
		}

		if (hostel_type != null) {
			sql.append(" and lower(st.hostel_type) like lower('" + hostel_type
					+ "%')");
		}
		if (hostel_name != null) {
			sql.append(" and lower(st.hostel_name) like lower('" + hostel_name
					+ "%')");
		}
		if (status != null) {
			sql.append(" and st.status = '" + status + "'");
		}
		sql.append(" order by st.last_updated_dt desc");
		query = sessionFactory
				.getCurrentSession()
				.createQuery(sql.toString())
				.setResultTransformer(
						Transformers.aliasToBean(hostelDM.class));
			return query.list();
	}

}
