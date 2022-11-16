package com.pru.test.associate.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
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
	
}
