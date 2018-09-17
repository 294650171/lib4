package cn.wuxi.js.lib4.crawler.entity;

import java.io.Serializable;

public class CorpCertMapping implements Serializable {
		
    private String certname;

    private String majortypename;

    private String majortypeno;

    private String tradetypename;
    
    private String tradetypeno;

    private String certtypename;
    
	private String certtypeno;
 

    private static final long serialVersionUID = 1L;

    public String getCertname() {
        return certname;
    }

    public void setCertname(String certname) {
        this.certname = certname == null ? null : certname.trim();
    }

    public String getMajortypename() {
        return majortypename;
    }

    public void setMajortypename(String majortypename) {
        this.majortypename = majortypename == null ? null : majortypename.trim();
    }

    public String getMajortypeno() {
        return majortypeno;
    }

    public void setMajortypeno(String majortypeno) {
        this.majortypeno = majortypeno == null ? null : majortypeno.trim();
    }

    public String getTradetypename() {
        return tradetypename;
    }

    public void setTradetypename(String tradetypename) {
        this.tradetypename = tradetypename == null ? null : tradetypename.trim();
    }

    public String getCerttypename() {
        return certtypename;
    }

    public void setCerttypename(String certtypename) {
        this.certtypename = certtypename == null ? null : certtypename.trim();
    }

	public String getTradetypeno() {
		return tradetypeno;
	}

	public void setTradetypeno(String tradetypeno) {
		this.tradetypeno = tradetypeno;
	}

	public String getCerttypeno() {
		return certtypeno;
	}

	public void setCerttypeno(String certtypeno) {
		this.certtypeno = certtypeno;
	}

	@Override
	public String toString() {
		return "CorpCertMapping [certname=" + certname + ", majortypename="
				+ majortypename + ", majortypeno=" + majortypeno
				+ ", tradetypename=" + tradetypename + ", tradetypeno="
				+ tradetypeno + ", certtypename=" + certtypename
				+ ", certtypeno=" + certtypeno + "]";
	}
    
	
    
}