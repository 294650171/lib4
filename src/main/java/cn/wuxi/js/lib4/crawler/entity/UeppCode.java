package cn.wuxi.js.lib4.crawler.entity;

import java.io.Serializable;

public class UeppCode extends UeppCodeKey implements Serializable {
    private String parentcodetype;

    private String codeinfo;

    private String codedesc;

    private Integer orderid;

    private static final long serialVersionUID = 1L;

    public String getParentcodetype() {
        return parentcodetype;
    }

    public void setParentcodetype(String parentcodetype) {
        this.parentcodetype = parentcodetype == null ? null : parentcodetype.trim();
    }

    public String getCodeinfo() {
        return codeinfo;
    }

    public void setCodeinfo(String codeinfo) {
        this.codeinfo = codeinfo == null ? null : codeinfo.trim();
    }

    public String getCodedesc() {
        return codedesc;
    }

    public void setCodedesc(String codedesc) {
        this.codedesc = codedesc == null ? null : codedesc.trim();
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }
}