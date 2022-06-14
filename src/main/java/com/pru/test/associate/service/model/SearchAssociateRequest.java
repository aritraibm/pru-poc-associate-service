package com.pru.test.associate.service.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


public class SearchAssociateRequest {

	private String associateName;
    private String band;
    private String emailIbm;
    private String xid;
    
	public String getAssociateName() {
		return associateName;
	}
	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public String getEmailIbm() {
		return emailIbm;
	}
	public void setEmailIbm(String emailIbm) {
		this.emailIbm = emailIbm;
	}
	public String getXid() {
		return xid;
	}
	public void setXid(String xid) {
		this.xid = xid;
	}
	@Override
	public String toString() {
		return "SearchAssociateRequest [associateName=" + associateName + ", band=" + band + ", emailIbm=" + emailIbm
				+ ", xid=" + xid + "]";
	}
	public SearchAssociateRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SearchAssociateRequest(String associateName, String band, String emailIbm, String xid) {
		super();
		this.associateName = associateName;
		this.band = band;
		this.emailIbm = emailIbm;
		this.xid = xid;
	}
    
    
    
}
