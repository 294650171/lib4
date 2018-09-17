package cn.wuxi.js.lib4.crawler.mohurd.bean;

public class CorpDetailVO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String zzjgdm;

	private String fddbr;

	private String jjxz;

	private String province;

	private String zcdd;

	private String xxdd;

	public CorpDetailVO() {
		// TODO Auto-generated constructor stub
	}

	public String getFddbr() {
		return fddbr;
	}

	public void setFddbr(String fddbr) {
		this.fddbr = fddbr;
	}

	public String getJjxz() {
		return jjxz;
	}

	public void setJjxz(String jjxz) {
		this.jjxz = jjxz;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getZcdd() {
		return zcdd;
	}

	public void setZcdd(String zcdd) {
		this.zcdd = zcdd;
	}

	public String getXxdd() {
		return xxdd;
	}

	public void setXxdd(String xxdd) {
		this.xxdd = xxdd;
	}

	public String getZzjgdm() {
		return zzjgdm;
	}

	public void setZzjgdm(String zzjgdm) {
		this.zzjgdm = zzjgdm;
	}

	@Override
	public String toString() {
		return "CorpDetailVO [zzjgdm=" + zzjgdm + ", fddbr=" + fddbr
				+ ", jjxz=" + jjxz + ", province=" + province + ", zcdd="
				+ zcdd + ", xxdd=" + xxdd + "]";
	}

}
