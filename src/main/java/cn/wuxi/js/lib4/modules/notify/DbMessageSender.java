package cn.wuxi.js.lib4.modules.notify;

import java.sql.SQLException;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DbMessageSender implements MessageSender {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public boolean send(String phone, String message) throws SQLException {
		boolean flag = false;
		if(StringUtils.isEmpty(phone)){
			return flag;
		}
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(" INSERT INTO T_SendTask(DestNumber,Content,SignName,SendPriority,SendTime"); 
		buffer.append(" ,StatusReport,EnglishFlag,MsgType,PushUrl,RecAction,ValidMinute "); 
		buffer.append(" ,SendFlag,CommPort,SplitCount,batchId ,RingFlag,zt)"); 
		buffer.append(" VALUES"); 
		buffer.append(" ('"+phone+"','"+message+"',NULL,16,SYSDATETIME()"); 
		buffer.append(" ,0,0,0,NULL,0,0"); 
		buffer.append(" ,0,0,1,NULL,0,NULL)"); 		

		
		logger.debug(buffer.toString());
		
		int effects = SmsDAOHelper.executeSQL(buffer.toString());
		
		logger.info("Post "+effects+" items to SMS database, mobile:{}", phone);
		flag = true;
		
		return flag;	
	}

}
