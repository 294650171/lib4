package cn.wuxi.js.lib4.crawler.entity;

import java.io.Serializable;

public class UeppCodeKey implements Serializable {
    private String parentcode;

    private String codetype;

    private String code;

    private static final long serialVersionUID = 1L;

    public String getParentcode() {
        return parentcode;
    }

    public void setParentcode(String parentcode) {
        this.parentcode = parentcode == null ? null : parentcode.trim();
    }

    public String getCodetype() {
        return codetype;
    }

    public void setCodetype(String codetype) {
        this.codetype = codetype == null ? null : codetype.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}