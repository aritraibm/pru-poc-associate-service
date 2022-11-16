package com.pru.test.associate.service.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document("employee_onboarding")
public class EmployeeOnboarding {
	
	@Id
	private Long empOnbrdId;	
	private String empId;
	private String xid;
	private String name;
	private String intranetId;
	private String location;
	private String site;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date onboardingDate;
	private String bgc;
	
	public Long getEmpOnbrdId() {
		return empOnbrdId;
	}
	public void setEmpOnbrdId(Long empOnbrdId) {
		this.empOnbrdId = empOnbrdId;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getXid() {
		return xid;
	}
	public void setXid(String xid) {
		this.xid = xid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntranetId() {
		return intranetId;
	}
	public void setIntranetId(String intranetId) {
		this.intranetId = intranetId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public Date getOnboardingDate() {
		return onboardingDate;
	}
	public void setOnboardingDate(Date onboardingDate) {
		this.onboardingDate = onboardingDate;
	}
	public String getBgc() {
		return bgc;
	}
	public void setBgc(String bgc) {
		this.bgc = bgc;
	}
	
}
