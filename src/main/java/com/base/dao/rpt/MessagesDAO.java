
package com.base.dao.rpt;

import java.util.Date;
import java.util.List;

import com.base.domain.txn.MessagesDM;

public interface MessagesDAO {
	/**
	 * Method for return list of Message based on user's input
	 * 
	 * @param String
	 *            msgSender,Long messageid,String msgReceiver,String msgCc,Date msgDateFrom,Date msgDateTo,String msgSub,String
	 *            status,String msgtype,Long companyId,String msgstatus 
	 * @return list of MessagesDM
	 */
	public List<MessagesDM> getMessagesList(String msgSender,Long messageid, String msgReceiver, String msgCc, Date msgDateFrom,
			Date msgDateTo, String msgSub, String status, String msgtype, Long companyId,String msgstatus);
}
