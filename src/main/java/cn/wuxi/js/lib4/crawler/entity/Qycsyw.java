package cn.wuxi.js.lib4.crawler.entity;

import java.io.Serializable;
import java.util.Date;

public class Qycsyw implements Serializable {
    private Integer id;

    private String qyid;

    private Integer csywlxid;

    private String csywlx;

    private Integer balxid;

    private String balx;

    private Integer datastate;

    private String tag;

    private String xgr;

    private Date xgrqsj;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getBalxid() {
        return balxid;
    }

    public void setBalxid(Integer balxid) {
        this.balxid = balxid;
    }

    public String getBalx() {
        return balx;
    }

    public void setBalx(String balx) {
        this.balx = balx == null ? null : balx.trim();
    }

    public Integer getDatastate() {
        return datastate;
    }

    public void setDatastate(Integer datastate) {
        this.datastate = datastate;
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
}