package cn.wuxi.js.lib4.crawler.mohurd.bean;

public class CorpCaVO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String csywlx;

	private String zsbh;

	private String fzdw;

	private String fzrq;

	private String zsyxzrq;

	// 资质名称，由企业资质类别 (CertType)+企业资质序列(TradeType)+专业名称+资质等级(CertLevel)组成
	private String zzmc;

	// 资质序列
	private String zzxl;

	// 专业名称
	private String zzlb;

	// 资质等级
	private String zzdj;

	public String getCsywlx() {
		return csywlx;
	}

	public void setCsywlx(String csywlx) {
		this.csywlx = csywlx;
	}

	public String getZsbh() {
		return zsbh;
	}

	public void setZsbh(String zsbh) {
		this.zsbh = zsbh;
	}

	public String getFzdw() {
		return fzdw;
	}

	public void setFzdw(String fzdw) {
		this.fzdw = fzdw;
	}

	public String getFzrq() {
		return fzrq;
	}

	public void setFzrq(String fzrq) {
		this.fzrq = fzrq;
	}

	public String getZsyxzrq() {
		return zsyxzrq;
	}

	public void setZsyxzrq(String zsyxzrq) {
		this.zsyxzrq = zsyxzrq;
	}

	public String getZzmc() {
		return zzmc;
	}

	public void setZzmc(String zzmc) {
		this.zzmc = zzmc;
	}

	public String getZzxl() {
		return zzxl;
	}

	public void setZzxl(String zzxl) {
		this.zzxl = zzxl;
	}

	public String getZzlb() {
		return zzlb;
	}

	public void setZzlb(String zzlb) {
		this.zzlb = zzlb;
	}

	public String getZzdj() {
		return zzdj;
	}

	public void setZzdj(String zzdj) {
		this.zzdj = zzdj;
	}

	@Override
	public String toString() {
		return "CorpCaVO [csywlx=" + csywlx + ", zsbh=" + zsbh + ", fzdw="
				+ fzdw + ", fzrq=" + fzrq + ", zsyxzrq=" + zsyxzrq + ", zzmc="
				+ zzmc + ", zzxl=" + zzxl + ", zzlb=" + zzlb + ", zzdj=" + zzdj
				+ "]";
	}

}
