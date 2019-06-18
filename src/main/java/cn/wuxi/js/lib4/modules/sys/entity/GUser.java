/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.sys.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import cn.wuxi.js.lib4.common.persistence.DataEntity;

/**
 * 用户Entity
 * @author GLQ
 * @version 2019-06-15
 */
public class GUser extends DataEntity<GUser> {
	
	private static final long serialVersionUID = 1L;
	private String userid;		// userid
	private String loginname;		// loginname
	private String loginpassword;		// loginpassword
	private String username;		// username
	private String usersex;		// usersex
	private String useridcardnumber;		// useridcardnumber
	private String useremail;		// useremail
	private String usertel;		// usertel
	private String usermobile;		// usermobile
	private String useraddress;		// useraddress
	private String userzipcode;		// userzipcode
	private Date userregtime;		// userregtime
	private Date userendtime;		// userendtime
	private String userfeetype;		// userfeetype
	private String usertype;		// usertype
	private String userprovince;		// userprovince
	private String usercity;		// usercity
	private String orgname;		// orgname
	private String orgunitname;		// orgunitname
	private String userfax;		// userfax
	private String certiId;		// certi_id
	private String dealman;		// dealman
	private String dealmantel;		// dealmantel
	private String userlogintype;		// userlogintype
	private String userstate;		// userstate
	private Date updatedate;		// updatedate
	private Date lastlogintime;		// lastlogintime
	private String loginerrorcount;		// loginerrorcount
	
	public GUser() {
		super();
	}

	public GUser(String id){
		super(id);
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	@Length(min=1, max=100, message="loginname长度必须介于 1 和 100 之间")
	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	
	@Length(min=1, max=50, message="loginpassword长度必须介于 1 和 50 之间")
	public String getLoginpassword() {
		return loginpassword;
	}

	public void setLoginpassword(String loginpassword) {
		this.loginpassword = loginpassword;
	}
	
	@Length(min=1, max=200, message="username长度必须介于 1 和 200 之间")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@Length(min=0, max=10, message="usersex长度必须介于 0 和 10 之间")
	public String getUsersex() {
		return usersex;
	}

	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}
	
	@Length(min=0, max=50, message="useridcardnumber长度必须介于 0 和 50 之间")
	public String getUseridcardnumber() {
		return useridcardnumber;
	}

	public void setUseridcardnumber(String useridcardnumber) {
		this.useridcardnumber = useridcardnumber;
	}
	
	@Length(min=0, max=100, message="useremail长度必须介于 0 和 100 之间")
	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	
	@Length(min=0, max=50, message="usertel长度必须介于 0 和 50 之间")
	public String getUsertel() {
		return usertel;
	}

	public void setUsertel(String usertel) {
		this.usertel = usertel;
	}
	
	@Length(min=0, max=50, message="usermobile长度必须介于 0 和 50 之间")
	public String getUsermobile() {
		return usermobile;
	}

	public void setUsermobile(String usermobile) {
		this.usermobile = usermobile;
	}
	
	@Length(min=0, max=255, message="useraddress长度必须介于 0 和 255 之间")
	public String getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	
	@Length(min=0, max=50, message="userzipcode长度必须介于 0 和 50 之间")
	public String getUserzipcode() {
		return userzipcode;
	}

	public void setUserzipcode(String userzipcode) {
		this.userzipcode = userzipcode;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUserregtime() {
		return userregtime;
	}

	public void setUserregtime(Date userregtime) {
		this.userregtime = userregtime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUserendtime() {
		return userendtime;
	}

	public void setUserendtime(Date userendtime) {
		this.userendtime = userendtime;
	}
	
	@Length(min=0, max=50, message="userfeetype长度必须介于 0 和 50 之间")
	public String getUserfeetype() {
		return userfeetype;
	}

	public void setUserfeetype(String userfeetype) {
		this.userfeetype = userfeetype;
	}
	
	@Length(min=0, max=50, message="usertype长度必须介于 0 和 50 之间")
	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	
	@Length(min=0, max=50, message="userprovince长度必须介于 0 和 50 之间")
	public String getUserprovince() {
		return userprovince;
	}

	public void setUserprovince(String userprovince) {
		this.userprovince = userprovince;
	}
	
	@Length(min=0, max=50, message="usercity长度必须介于 0 和 50 之间")
	public String getUsercity() {
		return usercity;
	}

	public void setUsercity(String usercity) {
		this.usercity = usercity;
	}
	
	@Length(min=0, max=255, message="orgname长度必须介于 0 和 255 之间")
	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	
	@Length(min=0, max=255, message="orgunitname长度必须介于 0 和 255 之间")
	public String getOrgunitname() {
		return orgunitname;
	}

	public void setOrgunitname(String orgunitname) {
		this.orgunitname = orgunitname;
	}
	
	@Length(min=0, max=50, message="userfax长度必须介于 0 和 50 之间")
	public String getUserfax() {
		return userfax;
	}

	public void setUserfax(String userfax) {
		this.userfax = userfax;
	}
	
	@Length(min=0, max=50, message="certi_id长度必须介于 0 和 50 之间")
	public String getCertiId() {
		return certiId;
	}

	public void setCertiId(String certiId) {
		this.certiId = certiId;
	}
	
	@Length(min=0, max=50, message="dealman长度必须介于 0 和 50 之间")
	public String getDealman() {
		return dealman;
	}

	public void setDealman(String dealman) {
		this.dealman = dealman;
	}
	
	@Length(min=0, max=50, message="dealmantel长度必须介于 0 和 50 之间")
	public String getDealmantel() {
		return dealmantel;
	}

	public void setDealmantel(String dealmantel) {
		this.dealmantel = dealmantel;
	}
	
	@Length(min=0, max=50, message="userlogintype长度必须介于 0 和 50 之间")
	public String getUserlogintype() {
		return userlogintype;
	}

	public void setUserlogintype(String userlogintype) {
		this.userlogintype = userlogintype;
	}
	
	@Length(min=0, max=20, message="userstate长度必须介于 0 和 20 之间")
	public String getUserstate() {
		return userstate;
	}

	public void setUserstate(String userstate) {
		this.userstate = userstate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getLastlogintime() {
		return lastlogintime;
	}

	public void setLastlogintime(Date lastlogintime) {
		this.lastlogintime = lastlogintime;
	}
	
	public String getLoginerrorcount() {
		return loginerrorcount;
	}

	public void setLoginerrorcount(String loginerrorcount) {
		this.loginerrorcount = loginerrorcount;
	}
	
}