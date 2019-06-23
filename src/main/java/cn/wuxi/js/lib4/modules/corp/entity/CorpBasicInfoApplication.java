/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.entity;

import cn.wuxi.js.lib4.common.persistence.ActEntity;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import cn.wuxi.js.lib4.common.persistence.DataEntity;

/**
 * 企业基本信息修改申请表Entity
 * @author aaronhuang
 * @version 2019-01-31
 */
public class CorpBasicInfoApplication extends ActEntity<CorpBasicInfoApplication> {
	
	private static final long serialVersionUID = 1L;

	public static final String DATASTATE_TODO = "0";//待审核
	public static final String DATASTATE_PASS = "1";//通过
	public static final String DATASTATE_REJECT = "2"; //驳回
	
	public static final String TYPE_EDIT = "1";//修改
	public static final String TYPE_REGISTER = "2";//注册

	private String qyid;		// qyid
	private String userid;		// userid
	private String qymc;		// 企业名称
	private String zzjgdm;		// 组织机构代码
	private String yyzzzch;		// 营业执照注册号
	private String khyh;		// khyh
	private String yhzh;		// yhzh
	private String sfsyq;		// sfsyq
	private String gcjsryZs;		// gcjsry_zs
	private String gcjsryGjzcrs;		// gcjsry_gjzcrs
	private String gcjsryZjzcrs;		// gcjsry_zjzcrs
	private String sylxid;		// sylxid
	private String sylx;		// sylx
	private String provinceid;		// provinceid
	private String province;		// 省
	private String cityid;		// cityid
	private String city;		// 市
	private String countyid;		// countyid
	private String county;		// 区/县
	private String zcdd;		// zcdd
	private String jjxzid;		// jjxzid
	private String jjxz;		// 企业经济性质
	private String zczb;		// 注册资本(万元)
	private String zyfw;		// zyfw
	private String jyfw;		// jyfw
	private Date clrq;		// 成立日期
	private String qyjj;		// qyjj
	private String xxdd;		// 详细地点
	private String yzbm;		// yzbm
	private String cz;		// cz
	private String email;		// 邮箱
	private String webaddress;		// webaddress
	private String lxr;		// 企业联系人
	private String lxdh;		// 企业联系电话
	private String fddbrRyid;		// 法人代表身份证
	private String fddbr;		// 法人代表
	private String qyfzrRyid;		// qyfzr_ryid
	private String qyfzr;		// qyfzr
	private String cwfzrRyid;		// cwfzr_ryid
	private String cwfzr;		// cwfzr
	private String jsfzrRyid;		// jsfzr_ryid
	private String jsfzr;		// jsfzr
	private String aqfzrRyid;		// aqfzr_ryid
	private String aqfzr;		// aqfzr
	private String datastate;		// datastate
	private String tag;		// 来源标识
	private String xgr;		// xgr
	private Date xgrqsj;		// xgrqsj
	private String xmjlzs;		// xmjlzs
	private String aqy;		// aqy
	private String zjy;		// zjy
	private String sgy;		// sgy
	private String tyshxydm;		// 统一社会信用代码
	private String type;		// 申请类型：1 修改 2 注册
	private String procInsId;		// proc_ins_id


	private String photo;
	
	private String approveOpinion;
	
	//临时属性
	private CommonsMultipartFile attachmentFile;

	public CorpBasicInfoApplication() {
		super();
	}

	public CorpBasicInfoApplication(String id){
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
	
	@Length(min=0, max=100, message="企业名称长度必须介于 0 和 100 之间")
	public String getQymc() {
		return qymc;
	}

	public void setQymc(String qymc) {
		this.qymc = qymc;
	}
	
	@Length(min=0, max=50, message="组织机构代码长度必须介于 0 和 50 之间")
	public String getZzjgdm() {
		return zzjgdm;
	}

	public void setZzjgdm(String zzjgdm) {
		this.zzjgdm = zzjgdm;
	}
	
	@Length(min=0, max=50, message="营业执照注册号长度必须介于 0 和 50 之间")
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
	
	@Length(min=0, max=20, message="省长度必须介于 0 和 20 之间")
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
	
	@Length(min=0, max=20, message="市长度必须介于 0 和 20 之间")
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
	
	@Length(min=0, max=20, message="区/县长度必须介于 0 和 20 之间")
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
	
	@Length(min=0, max=50, message="企业经济性质长度必须介于 0 和 50 之间")
	public String getJjxz() {
		return jjxz;
	}

	public void setJjxz(String jjxz) {
		this.jjxz = jjxz;
	}
	
	@Length(min=0, max=50, message="注册资本(万元)长度必须介于 0 和 50 之间")
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
	
	@Length(min=0, max=200, message="详细地点长度必须介于 0 和 200 之间")
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
	
	@Length(min=0, max=100, message="邮箱长度必须介于 0 和 100 之间")
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
	
	@Length(min=0, max=50, message="企业联系人长度必须介于 0 和 50 之间")
	public String getLxr() {
		return lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}
	
	@Length(min=0, max=50, message="企业联系电话长度必须介于 0 和 50 之间")
	public String getLxdh() {
		return lxdh;
	}

	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	
	@Length(min=0, max=100, message="法人代表身份证长度必须介于 0 和 100 之间")
	public String getFddbrRyid() {
		return fddbrRyid;
	}

	public void setFddbrRyid(String fddbrRyid) {
		this.fddbrRyid = fddbrRyid;
	}
	
	@Length(min=0, max=25, message="法人代表长度必须介于 0 和 25 之间")
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
	
	@Length(min=0, max=50, message="来源标识长度必须介于 0 和 50 之间")
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
	
	@Length(min=0, max=50, message="统一社会信用代码长度必须介于 0 和 50 之间")
	public String getTyshxydm() {
		return tyshxydm;
	}

	public void setTyshxydm(String tyshxydm) {
		this.tyshxydm = tyshxydm;
	}
	
	@Length(min=0, max=50, message="proc_ins_id长度必须介于 0 和 50 之间")
	public String getProcInsId() {
		return procInsId;
	}

	public void setProcInsId(String procInsId) {
		this.procInsId = procInsId;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public CommonsMultipartFile getAttachmentFile() {
		return attachmentFile;
	}

	public void setAttachmentFile(CommonsMultipartFile attachmentFile) {
		this.attachmentFile = attachmentFile;
	}

	public String getApproveOpinion() {
		return approveOpinion;
	}

	public void setApproveOpinion(String approveOpinion) {
		this.approveOpinion = approveOpinion;
	}
}