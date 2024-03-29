/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.sys.security;

/**
 * 用户和密码（包含验证码）令牌类
 * @author ThinkGem
 * @version 2013-5-19
 */
public class UsernamePasswordToken extends org.apache.shiro.authc.UsernamePasswordToken {

	private static final long serialVersionUID = 1L;
	public static final String USER_TYPE_CORP = "corp";
	public static final String USER_TYPE_ADMIN = "admin";


	private String captcha;
	private boolean mobileLogin;

	private String userType;
	private String diplayName;
	
	public UsernamePasswordToken() {
		super();
	}

	public UsernamePasswordToken(String username, char[] password,
			boolean rememberMe, String host, String captcha, boolean mobileLogin) {
		super(username, password, rememberMe, host);
		this.captcha = captcha;
		this.mobileLogin = mobileLogin;
	}
	public UsernamePasswordToken(String username, char[] password,
								 boolean rememberMe, String host, String captcha, boolean mobileLogin,
								 String userType) {
		super(username, password, rememberMe, host);
		this.captcha = captcha;
		this.mobileLogin = mobileLogin;
		this.userType = userType;
	}

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	public boolean isMobileLogin() {
		return mobileLogin;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getDiplayName() {
		return diplayName;
	}

	public void setDiplayName(String diplayName) {
		this.diplayName = diplayName;
	}
}