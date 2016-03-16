
package com.erputil.daoimpl;

import java.math.BigDecimal;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.erputil.dao.Util;

@Repository
public class UtilDAOImpl implements Util{
	
	@Autowired
    private SessionFactory sessionFactory;
	/**
	 * To generate sequence for ID.
	 * 
	 * @param  seqName
	 * 
	 */
	public Long getNextSeq(String seqName) {
		// TODO Auto-generated method stub
		 BigDecimal bd = new BigDecimal(0);
	        if(seqName != null)
	        {
	            seqName = seqName.trim();
	          Query query =  sessionFactory.getCurrentSession().createSQLQuery(" SELECT "+seqName+".NEXTVAL FROM DUAL ");
	           bd = (BigDecimal) query.uniqueResult();
	          
	        }
	        return (long) bd.doubleValue();
	}

}
