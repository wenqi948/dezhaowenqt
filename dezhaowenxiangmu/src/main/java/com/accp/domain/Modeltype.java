package com.accp.domain;

public class Modeltype {
    private String cartypeid;

    private Integer engineid;

    private Integer ctsid;

    private String cartypename;

    private Float ckprice;
    
    private String ctsnames;
 
    public String getCtsnames() {
		return ctsnames;
	}

	public void setCtsnames(String ctsnames) {
		this.ctsnames = ctsnames;
	}

	public String getEnginename() {
		return enginename;
	}

	public void setEnginename(String enginename) {
		this.enginename = enginename;
	}

	private String enginename;

    public String getCartypeid() {
        return cartypeid;
    }

    public void setCartypeid(String cartypeid) {
        this.cartypeid = cartypeid;
    }

    public Integer getEngineid() {
        return engineid;
    }

    public void setEngineid(Integer engineid) {
        this.engineid = engineid;
    }

    public Integer getCtsid() {
        return ctsid;
    }

    public void setCtsid(Integer ctsid) {
        this.ctsid = ctsid;
    }

    public String getCartypename() {
        return cartypename;
    }

    public void setCartypename(String cartypename) {
        this.cartypename = cartypename;
    }

    public Float getCkprice() {
        return ckprice;
    }

    public void setCkprice(Float ckprice) {
        this.ckprice = ckprice;
    }
}