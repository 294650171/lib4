package cn.wuxi.js.lib4.modules.notify;

import java.sql.SQLException;

public interface MessageSender {
	
	public boolean send(String phone, String message) throws SQLException;

}
