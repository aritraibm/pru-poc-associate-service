package com.pru.test.associate.service.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_emplyee_onboarding")
public class EmployeeOnboarding {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long tblId;
	
	private String empId;
	private String xid;
	private String name;
	private String intranetId;
	private String location;
	private String site;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date onboardingDate;
	private String bgc;
	
}
