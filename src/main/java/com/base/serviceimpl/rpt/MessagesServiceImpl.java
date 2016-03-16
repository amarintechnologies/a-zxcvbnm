
package com.base.serviceimpl.rpt;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.rpt.MessagesDAO;
import com.base.domain.txn.MessagesDM;
import com.base.service.rpt.MessagesService;

public class MessagesServiceImpl implements MessagesService {
	@Autowired
	private MessagesDAO tbasemessagedao;
	private Logger logger = Logger.getLogger(MessagesServiceImpl.class);
	
	/**
	 * To return data from MessagesDM based on user's input
	 * 
	 * @param String
	 *            msgSender, Long messageid,String msgReceiver, String msgCc, Date msgDateFrom, Date msgDateTo, String msgSub, String
	 *            status, String msgtype, Long companyId,String msgstatus
	 * @return List of MessagesDM
	 */
	@Transactional
	public List<MessagesDM> getMessagesList(String msgSender,Long messageid, String msgReceiver, String msgCc, Date msgDateFrom,
			Date msgDateTo, String msgSub, String status, String msgtype, Long companyId,String msgstatus) {
		logger.info("Inside getMessagesList > " + companyId + ", " + msgSender + ", " + messageid + ","+ msgReceiver + "," + status
				+ "," + msgCc + "," + msgDateFrom + "," + msgDateTo + "," + msgSub + "," + msgtype);
		return tbasemessagedao.getMessagesList(msgSender, messageid , msgReceiver, msgCc, msgDateFrom, msgDateTo, msgSub, status,
				msgtype, companyId, msgstatus);
	}
}
