package com.pru.test.associate.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
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
}
