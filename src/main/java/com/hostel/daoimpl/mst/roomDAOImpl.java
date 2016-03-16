package com.hostel.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.academic.daoimpl.txn.EventsDAOImpl;
import com.academic.domain.txn.EventsDM;
import com.hostel.dao.mst.roomDAO;
import com.hostel.dm.mst.roomDM;

@Repository
public class roomDAOImpl implements roomDAO {
	@Autowired
	SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(roomDAOImpl.class);

	public void saveorupdateDetails(roomDM Obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(Obj);
	}

	public List<roomDM> getroomList(Long room_id, Long hostel_id,
			Long company_id, String room_type, String status) {
		// TODO Auto-generated method stub
		logger.info("Inside  gethostelList >  " + "company_id" + company_id
				+ "hostel_id " + hostel_id);
		Query query = null;
		StringBuffer sql = new StringBuffer("select ");

		sql.append(" mt.room_id as room_id,mt.hostel_id as hostel_id,mt.company_id as company_id,mt.floor_no as floor_no,mt.room_type as room_type,mt.room_no as room_no,mt.no_of_beds as no_of_beds,mt.free_beds as free_beds,mt.rental as rental,mt.remarks as remarks,mt.status as status,mt.last_updated_dt as last_updated_dt,mt.last_updated_by as last_updated_by,");
		sql.append("st.hostel_name as hostelName");
		sql.append(" from roomDM mt,hostelDM st where 1=1 and st.hostel_id=mt.hostel_id");
		if (room_id != null) {
			sql.append(" and mt.room_id=" + room_id);
		}
		if (hostel_id != null) {
			sql.append(" and mt.hostel_id=" + hostel_id);
		}
		if (company_id != null) {
			sql.append(" and mt.company_id=" + company_id);
		}

		if (room_type != null) {
			sql.append(" and lower(mt.room_type) like lower('" + room_type
					+ "%')");
		}
		if (status != null) {
			sql.append(" and lower(mt.status) like lower('" + status + "%')");
		}

		sql.append(" order by mt.last_updated_dt desc");
		logger.info("Inside getEventsList > Query > " + sql);
		query = sessionFactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(roomDM.class));
		return query.list();

	}

	public void updatefreebeds(Long room_id, Long free_beds) {
		String query = "update roomDM u set  u.free_beds=" + free_beds
				+ " where u.room_id=" + room_id;
		sessionFactory.getCurrentSession().createQuery(query).executeUpdate();
	}

}
