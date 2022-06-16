package com.pru.test.associate.service.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

public class SkillExcelExport {

	private String associateName;
    private String xid;
    private String skillName;
    private String skillRating;
    
	public String getAssociateName() {
		return associateName;
	}
	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}
	public String getXid() {
		return xid;
	}
	public void setXid(String xid) {
		this.xid = xid;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getSkillRating() {
		return skillRating;
	}
	public void setSkillRating(String skillRating) {
		this.skillRating = skillRating;
	}
	@Override
	public String toString() {
		return "SkillExcelExport [associateName=" + associateName + ", xid=" + xid + ", skillName=" + skillName
				+ ", skillRating=" + skillRating + "]";
	}
	public SkillExcelExport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SkillExcelExport(String associateName, String xid, String skillName, String skillRating) {
		super();
		this.associateName = associateName;
		this.xid = xid;
		this.skillName = skillName;
		this.skillRating = skillRating;
	}
    
	
	
}
