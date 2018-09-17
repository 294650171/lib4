package cn.wuxi.js.lib4.crawler.entity;

import java.io.Serializable;
import java.util.Date;

public class Qyzs implements Serializable {
    private String zsjlid;

    private String qyid;

    private Integer csywlxid;

    private String csywlx;

    private Integer zslxid;

    private String zslx;

    private Integer sfzzz;

    private String zsbh;

    private Date zsyxqrq;

    private Date zsyxzrq;

    private String fzdw;

    private Date fzrq;

    private String bz;

    private String tag;

    private String xgr;

    private Date xgrqsj;

    private Integer datastate;

    private String printno;

    private static final long serialVersionUID = 1L;

    public String getZsjlid() {
        return zsjlid;
    }

    public void setZsjlid(String zsjlid) {
        this.zsjlid = zsjlid == null ? null : zsjlid.trim();
    }

    public String getQyid() {
        return qyid;
    }

    public void setQyid(String qyid) {
        this.qyid = qyid == null ? null : qyid.trim();
    }

    public Integer getCsywlxid() {
        return csywlxid;
    }

    public void setCsywlxid(Integer csywlxid) {
        this.csywlxid = csywlxid;
    }

    public String getCsywlx() {
        return csywlx;
    }

    public void setCsywlx(String csywlx) {
        this.csywlx = csywlx == null ? null : csywlx.trim();
    }

    public Integer getZslxid() {
        return zslxid;
    }

    public void setZslxid(Integer zslxid) {
        this.zslxid = zslxid;
    }

    public String getZslx() {
        return zslx;
    }

    public void setZslx(String zslx) {
        this.zslx = zslx == null ? null : zslx.trim();
    }

    public Integer getSfzzz() {
        return sfzzz;
    }

    public void setSfzzz(Integer sfzzz) {
        this.sfzzz = sfzzz;
    }

    public String getZsbh() {
        return zsbh;
    }

    public void setZsbh(String zsbh) {
        this.zsbh = zsbh == null ? null : zsbh.trim();
    }

    public Date getZsyxqrq() {
        return zsyxqrq;
    }

    public void setZsyxqrq(Date zsyxqrq) {
        this.zsyxqrq = zsyxqrq;
    }

    public Date getZsyxzrq() {
        return zsyxzrq;
    }

    public void setZsyxzrq(Date zsyxzrq) {
        this.zsyxzrq = zsyxzrq;
    }

    public String getFzdw() {
        return fzdw;
    }

    public void setFzdw(String fzdw) {
        this.fzdw = fzdw == null ? null : fzdw.trim();
    }

    public Date getFzrq() {
        return fzrq;
    }

    public void setFzrq(Date fzrq) {
        this.fzrq = fzrq;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getXgr() {
        return xgr;
    }

    public void setXgr(String xgr) {
        this.xgr = xgr == null ? null : xgr.trim();
    }

    public Date getXgrqsj() {
        return xgrqsj;
    }

    public void setXgrqsj(Date xgrqsj) {
        this.xgrqsj = xgrqsj;
    }

    public Integer getDatastate() {
        return datastate;
    }

    public void setDatastate(Integer datastate) {
        this.datastate = datastate;
    }

    public String getPrintno() {
        return printno;
    }

    public void setPrintno(String printno) {
        this.printno = printno == null ? null : printno.trim();
    }
}