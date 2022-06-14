package com.pru.test.associate.service.VO;

import org.springframework.stereotype.Component;

import com.pru.test.associate.service.entity.Associate;
import com.pru.test.associate.service.entity.AssociateSkill;



public class AssociateWithSkillTemplateVO {

	private Associate associate;
	private AssociateSkill associateSkill;
	
	public Associate getAssociate() {
		return associate;
	}
	public void setAssociate(Associate associate) {
		this.associate = associate;
	}
	public AssociateSkill getAssociateSkill() {
		return associateSkill;
	}
	public void setAssociateSkill(AssociateSkill associateSkill) {
		this.associateSkill = associateSkill;
	}
	public AssociateWithSkillTemplateVO(Associate associate, AssociateSkill associateSkill) {
		super();
		this.associate = associate;
		this.associateSkill = associateSkill;
	}
	public AssociateWithSkillTemplateVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RequestTemplateVO [associate=" + associate + ", associateSkill=" + associateSkill + "]";
	}
	
	
}
