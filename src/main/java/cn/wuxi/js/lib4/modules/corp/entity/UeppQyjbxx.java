/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import cn.wuxi.js.lib4.common.persistence.DataEntity;

/**
 * 企业基本信息Entity
 * @author huangzhengyu
 * @version 2018-07-06
 */
public class UeppQyjbxx extends DataEntity<UeppQyjbxx> {
	
	private static final long serialVersionUID = 1L;
	private String qyid;		// qyid
	private String userid;		// userid
	private String qymc;		// qymc
	private String zzjgdm;		// zzjgdm
	private String yyzzzch;		// yyzzzch
	private String khyh;		// khyh
	private String yhzh;		// yhzh
	private String sfsyq;		// sfsyq
	private String gcjsryZs;		// gcjsry_zs
	private String gcjsryGjzcrs;		// gcjsry_gjzcrs
	private String gcjsryZjzcrs;		// gcjsry_zjzcrs
	private String sylxid;		// sylxid
	private String sylx;		// sylx
	private String provinceid;		// provinceid
	private String province;		// province
	private String cityid;		// cityid
	private String city;		// city
	private String countyid;		// countyid
	private String county;		// county
	private String zcdd;		// zcdd
	private String jjxzid;		// jjxzid
	private String jjxz;		// jjxz
	private String zczb;		// zczb
	private String zyfw;		// zyfw
	private String jyfw;		// jyfw
	private Date clrq;		// clrq
	private String qyjj;		// qyjj
	private String xxdd;		// xxdd
	private String yzbm;		// yzbm
	private String cz;		// cz
	private String email;		// email
	private String webaddress;		// webaddress
	private String lxr;		// lxr
	private String lxdh;		// lxdh
	private String fddbrRyid;		// fddbr_ryid
	private String fddbr;		// fddbr
	private String qyfzrRyid;		// qyfzr_ryid
	private String qyfzr;		// qyfzr
	private String cwfzrRyid;		// cwfzr_ryid
	private String cwfzr;		// cwfzr
	private String jsfzrRyid;		// jsfzr_ryid
	private String jsfzr;		// jsfzr
	private String aqfzrRyid;		// aqfzr_ryid
	private String aqfzr;		// aqfzr
	private String datastate;		// datastate
	private String tag;		// tag
	private String xgr;		// xgr
	private Date xgrqsj;		// xgrqsj
	private String xmjlzs;		// xmjlzs
	private String aqy;		// aqy
	private String zjy;		// zjy
	private String sgy;		// sgy
	private String tyshxydm;		// tyshxydm
	private String needupdateflag;		// needupdateflag

	private String photo;
	
	public UeppQyjbxx() {
		super();
	}

	public UeppQyjbxx(String id){
		super(id);
	}

	@Length(min=1, max=100, message="qyid长度必须介于 1 和 100 之间")
	public String getQyid() {
		return qyid;
	}

	public void setQyid(String qyid) {
		this.qyid = qyid;
	}
	
	@Length(min=0, max=100, message="userid长度必须介于 0 和 100 之间")
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	@Length(min=0, max=100, message="qymc长度必须介于 0 和 100 之间")
	public String getQymc() {
		return qymc;
	}

	public void setQymc(String qymc) {
		this.qymc = qymc;
	}
	
	@Length(min=0, max=50, message="zzjgdm长度必须介于 0 和 50 之间")
	public String getZzjgdm() {
		return zzjgdm;
	}

	public void setZzjgdm(String zzjgdm) {
		this.zzjgdm = zzjgdm;
	}
	
	@Length(min=0, max=50, message="yyzzzch长度必须介于 0 和 50 之间")
	public String getYyzzzch() {
		return yyzzzch;
	}

	public void setYyzzzch(String yyzzzch) {
		this.yyzzzch = yyzzzch;
	}
	
	@Length(min=0, max=100, message="khyh长度必须介于 0 和 100 之间")
	public String getKhyh() {
		return khyh;
	}

	public void setKhyh(String khyh) {
		this.khyh = khyh;
	}
	
	@Length(min=0, max=50, message="yhzh长度必须介于 0 和 50 之间")
	public String getYhzh() {
		return yhzh;
	}

	public void setYhzh(String yhzh) {
		this.yhzh = yhzh;
	}
	
	@Length(min=0, max=1, message="sfsyq长度必须介于 0 和 1 之间")
	public String getSfsyq() {
		return sfsyq;
	}

	public void setSfsyq(String sfsyq) {
		this.sfsyq = sfsyq;
	}
	
	public String getGcjsryZs() {
		return gcjsryZs;
	}

	public void setGcjsryZs(String gcjsryZs) {
		this.gcjsryZs = gcjsryZs;
	}
	
	public String getGcjsryGjzcrs() {
		return gcjsryGjzcrs;
	}

	public void setGcjsryGjzcrs(String gcjsryGjzcrs) {
		this.gcjsryGjzcrs = gcjsryGjzcrs;
	}
	
	public String getGcjsryZjzcrs() {
		return gcjsryZjzcrs;
	}

	public void setGcjsryZjzcrs(String gcjsryZjzcrs) {
		this.gcjsryZjzcrs = gcjsryZjzcrs;
	}
	
	public String getSylxid() {
		return sylxid;
	}

	public void setSylxid(String sylxid) {
		this.sylxid = sylxid;
	}
	
	@Length(min=0, max=8, message="sylx长度必须介于 0 和 8 之间")
	public String getSylx() {
		return sylx;
	}

	public void setSylx(String sylx) {
		this.sylx = sylx;
	}
	
	@Length(min=0, max=20, message="provinceid长度必须介于 0 和 20 之间")
	public String getProvinceid() {
		return provinceid;
	}

	public void setProvinceid(String provinceid) {
		this.provinceid = provinceid;
	}
	
	@Length(min=0, max=20, message="province长度必须介于 0 和 20 之间")
	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	
	@Length(min=0, max=20, message="cityid长度必须介于 0 和 20 之间")
	public String getCityid() {
		return cityid;
	}

	public void setCityid(String cityid) {
		this.cityid = cityid;
	}
	
	@Length(min=0, max=20, message="city长度必须介于 0 和 20 之间")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Length(min=0, max=20, message="countyid长度必须介于 0 和 20 之间")
	public String getCountyid() {
		return countyid;
	}

	public void setCountyid(String countyid) {
		this.countyid = countyid;
	}
	
	@Length(min=0, max=20, message="county长度必须介于 0 和 20 之间")
	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}
	
	@Length(min=0, max=100, message="zcdd长度必须介于 0 和 100 之间")
	public String getZcdd() {
		return zcdd;
	}

	public void setZcdd(String zcdd) {
		this.zcdd = zcdd;
	}
	
	public String getJjxzid() {
		return jjxzid;
	}

	public void setJjxzid(String jjxzid) {
		this.jjxzid = jjxzid;
	}
	
	@Length(min=0, max=50, message="jjxz长度必须介于 0 和 50 之间")
	public String getJjxz() {
		return jjxz;
	}

	public void setJjxz(String jjxz) {
		this.jjxz = jjxz;
	}
	
	@Length(min=0, max=50, message="zczb长度必须介于 0 和 50 之间")
	public String getZczb() {
		return zczb;
	}

	public void setZczb(String zczb) {
		this.zczb = zczb;
	}
	
	@Length(min=0, max=-1, message="zyfw长度必须介于 0 和 -1 之间")
	public String getZyfw() {
		return zyfw;
	}

	public void setZyfw(String zyfw) {
		this.zyfw = zyfw;
	}
	
	@Length(min=0, max=-1, message="jyfw长度必须介于 0 和 -1 之间")
	public String getJyfw() {
		return jyfw;
	}

	public void setJyfw(String jyfw) {
		this.jyfw = jyfw;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getClrq() {
		return clrq;
	}

	public void setClrq(Date clrq) {
		this.clrq = clrq;
	}
	
	@Length(min=0, max=-1, message="qyjj长度必须介于 0 和 -1 之间")
	public String getQyjj() {
		return qyjj;
	}

	public void setQyjj(String qyjj) {
		this.qyjj = qyjj;
	}
	
	@Length(min=0, max=200, message="xxdd长度必须介于 0 和 200 之间")
	public String getXxdd() {
		return xxdd;
	}

	public void setXxdd(String xxdd) {
		this.xxdd = xxdd;
	}
	
	@Length(min=0, max=20, message="yzbm长度必须介于 0 和 20 之间")
	public String getYzbm() {
		return yzbm;
	}

	public void setYzbm(String yzbm) {
		this.yzbm = yzbm;
	}
	
	@Length(min=0, max=50, message="cz长度必须介于 0 和 50 之间")
	public String getCz() {
		return cz;
	}

	public void setCz(String cz) {
		this.cz = cz;
	}
	
	@Length(min=0, max=100, message="email长度必须介于 0 和 100 之间")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Length(min=0, max=100, message="webaddress长度必须介于 0 和 100 之间")
	public String getWebaddress() {
		return webaddress;
	}

	public void setWebaddress(String webaddress) {
		this.webaddress = webaddress;
	}
	
	@Length(min=0, max=50, message="lxr长度必须介于 0 和 50 之间")
	public String getLxr() {
		return lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}
	
	@Length(min=0, max=50, message="lxdh长度必须介于 0 和 50 之间")
	public String getLxdh() {
		return lxdh;
	}

	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	
	@Length(min=0, max=100, message="fddbr_ryid长度必须介于 0 和 100 之间")
	public String getFddbrRyid() {
		return fddbrRyid;
	}

	public void setFddbrRyid(String fddbrRyid) {
		this.fddbrRyid = fddbrRyid;
	}
	
	@Length(min=0, max=25, message="fddbr长度必须介于 0 和 25 之间")
	public String getFddbr() {
		return fddbr;
	}

	public void setFddbr(String fddbr) {
		this.fddbr = fddbr;
	}
	
	@Length(min=0, max=100, message="qyfzr_ryid长度必须介于 0 和 100 之间")
	public String getQyfzrRyid() {
		return qyfzrRyid;
	}

	public void setQyfzrRyid(String qyfzrRyid) {
		this.qyfzrRyid = qyfzrRyid;
	}
	
	@Length(min=0, max=25, message="qyfzr长度必须介于 0 和 25 之间")
	public String getQyfzr() {
		return qyfzr;
	}

	public void setQyfzr(String qyfzr) {
		this.qyfzr = qyfzr;
	}
	
	@Length(min=0, max=100, message="cwfzr_ryid长度必须介于 0 和 100 之间")
	public String getCwfzrRyid() {
		return cwfzrRyid;
	}

	public void setCwfzrRyid(String cwfzrRyid) {
		this.cwfzrRyid = cwfzrRyid;
	}
	
	@Length(min=0, max=25, message="cwfzr长度必须介于 0 和 25 之间")
	public String getCwfzr() {
		return cwfzr;
	}

	public void setCwfzr(String cwfzr) {
		this.cwfzr = cwfzr;
	}
	
	@Length(min=0, max=100, message="jsfzr_ryid长度必须介于 0 和 100 之间")
	public String getJsfzrRyid() {
		return jsfzrRyid;
	}

	public void setJsfzrRyid(String jsfzrRyid) {
		this.jsfzrRyid = jsfzrRyid;
	}
	
	@Length(min=0, max=25, message="jsfzr长度必须介于 0 和 25 之间")
	public String getJsfzr() {
		return jsfzr;
	}

	public void setJsfzr(String jsfzr) {
		this.jsfzr = jsfzr;
	}
	
	@Length(min=0, max=100, message="aqfzr_ryid长度必须介于 0 和 100 之间")
	public String getAqfzrRyid() {
		return aqfzrRyid;
	}

	public void setAqfzrRyid(String aqfzrRyid) {
		this.aqfzrRyid = aqfzrRyid;
	}
	
	@Length(min=0, max=25, message="aqfzr长度必须介于 0 和 25 之间")
	public String getAqfzr() {
		return aqfzr;
	}

	public void setAqfzr(String aqfzr) {
		this.aqfzr = aqfzr;
	}
	
	public String getDatastate() {
		return datastate;
	}

	public void setDatastate(String datastate) {
		this.datastate = datastate;
	}
	
	@Length(min=0, max=50, message="tag长度必须介于 0 和 50 之间")
	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
	@Length(min=0, max=100, message="xgr长度必须介于 0 和 100 之间")
	public String getXgr() {
		return xgr;
	}

	public void setXgr(String xgr) {
		this.xgr = xgr;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getXgrqsj() {
		return xgrqsj;
	}

	public void setXgrqsj(Date xgrqsj) {
		this.xgrqsj = xgrqsj;
	}
	
	public String getXmjlzs() {
		return xmjlzs;
	}

	public void setXmjlzs(String xmjlzs) {
		this.xmjlzs = xmjlzs;
	}
	
	public String getAqy() {
		return aqy;
	}

	public void setAqy(String aqy) {
		this.aqy = aqy;
	}
	
	public String getZjy() {
		return zjy;
	}

	public void setZjy(String zjy) {
		this.zjy = zjy;
	}
	
	public String getSgy() {
		return sgy;
	}

	public void setSgy(String sgy) {
		this.sgy = sgy;
	}
	
	@Length(min=0, max=50, message="tyshxydm长度必须介于 0 和 50 之间")
	public String getTyshxydm() {
		return tyshxydm;
	}

	public void setTyshxydm(String tyshxydm) {
		this.tyshxydm = tyshxydm;
	}
	
	public String getNeedupdateflag() {
		return needupdateflag;
	}

	public void setNeedupdateflag(String needupdateflag) {
		this.needupdateflag = needupdateflag;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
}