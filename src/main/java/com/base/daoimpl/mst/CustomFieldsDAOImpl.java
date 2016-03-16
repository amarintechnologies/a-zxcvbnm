package com.base.daoimpl.mst;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.base.dao.mst.CustomFieldsDAO;
import com.base.domain.mst.CustomFieldsDM;


@Repository
public class CustomFieldsDAOImpl implements CustomFieldsDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Logger logger = Logger.getLogger(CustomFieldsDAOImpl.class);
	
	/** Method for save or update mbasecustom_fieldsDM **/
	/**
	 * @param mbasecustomObj
	 *            of mbasecustom_fieldsDM
	 */
	public void saveorUpdatembasecustomfields(CustomFieldsDM mbasecustomObj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(mbasecustomObj);
	}
	
	/** Get mcustomfields List based on field_id **/
	/**
	 * 
	 * @param Long
	 *            field_id, String table_name, String column_name,String status
	 * 
	 * @return list of mbasecustom_fieldsDM
	 */
	public List<CustomFieldsDM> getmbasecustomfileldsList(Long field_id, String table_name, String column_name,
			String cf_status) {
		// TODO Auto-generated method stub
		logger.info("Inside  getmbasecustomfileldsList >  " + "field_id " + field_id + "table_name " + table_name
				+ " column_name" + column_name + "status" + cf_status);
		StringBuffer sql = new StringBuffer("select");
		sql.append(" m.field_id as field_id,m.table_name as table_name,m.column_name as column_name,m.data_type as data_type,m.default_value as default_value,m.order_by as order_by,");
		sql.append(" m.cf_status as cf_status,m.last_updated_dt as last_updated_dt,m.last_updated_by as last_updated_by");
		sql.append(" from CustomFieldsDM m  where 1=1");
		Query query = null;
		if (field_id != null) {
			sql.append(" and m.field_id =" + field_id);
		}
		if (table_name != null && table_name.trim().length() > 0) {
			sql.append(" and lower(m.table_name)like lower('" + table_name + "%')");
		}
		if (column_name != null && column_name.trim().length() > 0) {
			sql.append(" and lower(m.column_name)like lower('" + column_name + "%')");
		}
		if (cf_status != null && cf_status.trim().length() > 0) {
			sql.append(" and lower(m.cf_status)like lower('" + cf_status + "%')");
		}
		sql.append("order by m.order_by desc");
		logger.info("Inside getmbasecustomfileldsList > Query > " + sql);
		query = sessionFactory.getCurrentSession().createQuery(sql.toString())
				.setResultTransformer(Transformers.aliasToBean(CustomFieldsDM.class));
		return query.list();
	}
}
