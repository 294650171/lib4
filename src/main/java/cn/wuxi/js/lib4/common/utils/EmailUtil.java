package cn.wuxi.js.lib4.common.utils;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import cn.wuxi.js.lib4.common.config.Global;


public class EmailUtil {

	private final static String CHARSET_NAME = "GBK";


	public static void sendEmail(String receiverAddress,
			String sub, String msg) throws Exception {
		String host = Global.getConfig("SMTP_HOST");
		int port = Util.getInteger(Global.getConfig("SMTP_PORT"));
		String senderAddress = Global.getConfig("SENDER_ADDRESS");
		String senderName = Global.getConfig("SENDER_NAME");
		
		String code = Global.getConfig("AUTHENTICATE_CODE");
		
		
		try {
			HtmlEmail email = new HtmlEmail();// 创建电子邮件对象
			email.setSSL(true);
			email.setDebug(true);
			email.setHostName(host);// 设置发送电子邮件使用的服务器主机名
			email.setSmtpPort(port);// 设置发送电子邮件使用的邮件服务器的TCP端口地址
			email.setAuthenticator(new DefaultAuthenticator(senderAddress, code));// 邮件服务器身份验证
			email.setFrom(senderAddress, senderName);
			email.setSubject(sub);// 设置邮件主题
			email.setMsg(msg);// 设置邮件文本内容
			email.setCharset(CHARSET_NAME);
			email.addTo(receiverAddress);// 设置收件人
			
			// EmailAttachment attach =new EmailAttachment();//附件对象
			// attach.setPath("g:/temp/1.sql");//附件文件在系统中的路径
			// attach.setDescription(EmailAttachment.ATTACHMENT);
			// email.attach(attach);//添加附件
			
			email.send();// 发送邮件
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {


	}

}
