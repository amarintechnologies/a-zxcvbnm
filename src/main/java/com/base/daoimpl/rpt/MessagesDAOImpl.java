
package com.base.daoimpl.rpt;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.base.dao.rpt.MessagesDAO;
import com.base.domain.txn.MessagesDM;
import com.erputil.util.DateUtils;

@Repository
public class MessagesDAOImpl implements MessagesDAO {
	@Autowired
	private SessionFactory sessionfactory;
	private Logger logger = Logger.getLogger(MessagesDAOImpl.class);
	
	/**
	 * Return List from Messages, based on user's input
	 * 
	 * @param String
	 *            msgSender,Long messageid, String msgReceiver, String msgCc, Date msgDateFrom, Date msgDateTo, String msgSub, String
	 *            status, String msgtype, Long companyId,String msgstatus
	 * @return List of MessagesDM
	 * 
	 */
	public List<MessagesDM> getMessagesList(String msgSender,Long messageid, String msgReceiver, String msgCc, Date msgDateFrom,
			Date msgDateTo, String msgSub, String status, String msgtype, Long companyId,String msgstatus) { 
		logger.info("Inside getMessagesList > " + companyId + ", " + msgSender + ", "+ messageid + "," + msgReceiver + "," + status
				+ "," + msgCc + "," + msgDateFrom + "," + msgDateTo + "," + msgSub + "," + msgtype + "," + msgstatus);
		StringBuffer sql = new StringBuffer("select m from MessagesDM m where 1=1");
		Query query = null;
		if (msgSender != "" && msgSender != null) {
			sql.append(" and lower(m.msgsender) like lower('" + msgSender + "%')");
		}
		if (msgReceiver != "" && msgReceiver != null) {
			sql.append(" and lower(m.msgreceiver) like lower('" + msgReceiver + "%')");
		}
		if (msgCc != "" && msgCc != null) {
			sql.append(" and lower(m.msgcc) like lower('" + msgCc + "%')");
		}
		if (msgSub != "" && msgSub != null) {
			sql.append(" and lower(m.msgsubject) like lower('" + msgSub + "%')");
		}
		if (status != "" && status != null && status != "Both") {
			sql.append(" and m.msgstatus = '" + status + "'");
		}
		if (msgtype != "" && msgtype != null && msgtype != "Both") {
			sql.append(" and m.msgtype ='" + msgtype + "'");
		}
		if (msgDateFrom != null && msgDateTo != null) {
			sql.append("  and to_date(m.msgsentdate, 'DD-MM-RRRR') between to_date('"
					+ DateUtils.datetostring(msgDateFrom) + "','DD-MM-RRRR') and to_date('"
					+ DateUtils.datetostring(msgDateTo) + "','DD-MM-RRRR') ");
		}
		if (companyId != null) {
			sql.append(" and m.companyid=" + companyId);
		}
		logger.info(" getMessagesList SQL > " + sql);
		query = sessionfactory.getCurrentSession().createQuery(sql.toString());
		return query.list();
	}
}
