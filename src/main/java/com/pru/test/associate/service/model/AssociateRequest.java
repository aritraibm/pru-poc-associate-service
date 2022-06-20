package com.pru.test.associate.service.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


public class AssociateRequest {

	private String associateName;
    private String engagementName;
    private String majorFunction;
    private String band;
    private String primaryContact;
    private String emailIbm;
    private String emailClient;
    private String xid;
    private String clientManager;
    private Date endDate;
    private String location;
    private String city;
    private String billType;
    private String billCode;
    private String role;
    private Date asOnDate;
    private Date clientExpDate;
    private Date itExpDate;
    private Date ibmDate;
    private String experienceWithClient;
    private String careerExperience;
    private String experienceWithIbm;
    private String skillset;
    private String resourceCriticality;
    private String atImmigrationVisaRisks;
    private Long backupSuccessorResource;
    private String keyContingencyGroup;
    private String additionalContingency;
    private String visaType;
    private String workPermitValidUntil;
    private String extensionUpdates;
    private Date visaMaxOutDate;
    private String timeLeftInUs;
    private String h1bNominations;
    private String riskMitigationComments;
    private String planInCaseOfExtensionAmendmentRejection;
    
	public AssociateRequest(String associateName, String engagementName, String majorFunction, String band,
			String primaryContact, String emailIbm, String emailClient, String xid, String clientManager, Date endDate,
			String location, String city, String billType, String billCode, String role, Date asOnDate,
			Date clientExpDate, Date itExpDate, Date ibmDate, String experienceWithClient, String careerExperience,
			String experienceWithIbm, String skillset, String resourceCriticality, String atImmigrationVisaRisks,
			Long backupSuccessorResource, String keyContingencyGroup, String additionalContingency, String visaType,
			String workPermitValidUntil, String extensionUpdates, Date visaMaxOutDate, String timeLeftInUs,
			String h1bNominations, String riskMitigationComments, String planInCaseOfExtensionAmendmentRejection) {
		super();
		this.associateName = associateName;
		this.engagementName = engagementName;
		this.majorFunction = majorFunction;
		this.band = band;
		this.primaryContact = primaryContact;
		this.emailIbm = emailIbm;
		this.emailClient = emailClient;
		this.xid = xid;
		this.clientManager = clientManager;
		this.endDate = endDate;
		this.location = location;
		this.city = city;
		this.billType = billType;
		this.billCode = billCode;
		this.role = role;
		this.asOnDate = asOnDate;
		this.clientExpDate = clientExpDate;
		this.itExpDate = itExpDate;
		this.ibmDate = ibmDate;
		this.experienceWithClient = experienceWithClient;
		this.careerExperience = careerExperience;
		this.experienceWithIbm = experienceWithIbm;
		this.skillset = skillset;
		this.resourceCriticality = resourceCriticality;
		this.atImmigrationVisaRisks = atImmigrationVisaRisks;
		this.backupSuccessorResource = backupSuccessorResource;
		this.keyContingencyGroup = keyContingencyGroup;
		this.additionalContingency = additionalContingency;
		this.visaType = visaType;
		this.workPermitValidUntil = workPermitValidUntil;
		this.extensionUpdates = extensionUpdates;
		this.visaMaxOutDate = visaMaxOutDate;
		this.timeLeftInUs = timeLeftInUs;
		this.h1bNominations = h1bNominations;
		this.riskMitigationComments = riskMitigationComments;
		this.planInCaseOfExtensionAmendmentRejection = planInCaseOfExtensionAmendmentRejection;
	}
	
	public AssociateRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getAssociateName() {
		return associateName;
	}
	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}
	public String getEngagementName() {
		return engagementName;
	}
	public void setEngagementName(String engagementName) {
		this.engagementName = engagementName;
	}
	public String getMajorFunction() {
		return majorFunction;
	}
	public void setMajorFunction(String majorFunction) {
		this.majorFunction = majorFunction;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public String getPrimaryContact() {
		return primaryContact;
	}
	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}
	public String getEmailIbm() {
		return emailIbm;
	}
	public void setEmailIbm(String emailIbm) {
		this.emailIbm = emailIbm;
	}
	public String getEmailClient() {
		return emailClient;
	}
	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}
	public String getXid() {
		return xid;
	}
	public void setXid(String xid) {
		this.xid = xid;
	}
	public String getClientManager() {
		return clientManager;
	}
	public void setClientManager(String clientManager) {
		this.clientManager = clientManager;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}
	public String getBillCode() {
		return billCode;
	}
	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getAsOnDate() {
		return asOnDate;
	}
	public void setAsOnDate(Date asOnDate) {
		this.asOnDate = asOnDate;
	}
	public Date getClientExpDate() {
		return clientExpDate;
	}
	public void setClientExpDate(Date clientExpDate) {
		this.clientExpDate = clientExpDate;
	}
	public Date getItExpDate() {
		return itExpDate;
	}
	public void setItExpDate(Date itExpDate) {
		this.itExpDate = itExpDate;
	}
	public Date getIbmDate() {
		return ibmDate;
	}
	public void setIbmDate(Date ibmDate) {
		this.ibmDate = ibmDate;
	}
	public String getExperienceWithClient() {
		return experienceWithClient;
	}
	public void setExperienceWithClient(String experienceWithClient) {
		this.experienceWithClient = experienceWithClient;
	}
	public String getCareerExperience() {
		return careerExperience;
	}
	public void setCareerExperience(String careerExperience) {
		this.careerExperience = careerExperience;
	}
	public String getExperienceWithIbm() {
		return experienceWithIbm;
	}
	public void setExperienceWithIbm(String experienceWithIbm) {
		this.experienceWithIbm = experienceWithIbm;
	}
	public String getSkillset() {
		return skillset;
	}
	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}
	public String getResourceCriticality() {
		return resourceCriticality;
	}
	public void setResourceCriticality(String resourceCriticality) {
		this.resourceCriticality = resourceCriticality;
	}
	public String getAtImmigrationVisaRisks() {
		return atImmigrationVisaRisks;
	}
	public void setAtImmigrationVisaRisks(String atImmigrationVisaRisks) {
		this.atImmigrationVisaRisks = atImmigrationVisaRisks;
	}
	public Long getBackupSuccessorResource() {
		return backupSuccessorResource;
	}
	public void setBackupSuccessorResource(Long backupSuccessorResource) {
		this.backupSuccessorResource = backupSuccessorResource;
	}
	public String getKeyContingencyGroup() {
		return keyContingencyGroup;
	}
	public void setKeyContingencyGroup(String keyContingencyGroup) {
		this.keyContingencyGroup = keyContingencyGroup;
	}
	public String getAdditionalContingency() {
		return additionalContingency;
	}
	public void setAdditionalContingency(String additionalContingency) {
		this.additionalContingency = additionalContingency;
	}
	public String getVisaType() {
		return visaType;
	}
	public void setVisaType(String visaType) {
		this.visaType = visaType;
	}
	public String getWorkPermitValidUntil() {
		return workPermitValidUntil;
	}
	public void setWorkPermitValidUntil(String workPermitValidUntil) {
		this.workPermitValidUntil = workPermitValidUntil;
	}
	public String getExtensionUpdates() {
		return extensionUpdates;
	}
	public void setExtensionUpdates(String extensionUpdates) {
		this.extensionUpdates = extensionUpdates;
	}
	public Date getVisaMaxOutDate() {
		return visaMaxOutDate;
	}
	public void setVisaMaxOutDate(Date visaMaxOutDate) {
		this.visaMaxOutDate = visaMaxOutDate;
	}
	public String getTimeLeftInUs() {
		return timeLeftInUs;
	}
	public void setTimeLeftInUs(String timeLeftInUs) {
		this.timeLeftInUs = timeLeftInUs;
	}
	public String getH1bNominations() {
		return h1bNominations;
	}
	public void setH1bNominations(String h1bNominations) {
		this.h1bNominations = h1bNominations;
	}
	public String getRiskMitigationComments() {
		return riskMitigationComments;
	}
	public void setRiskMitigationComments(String riskMitigationComments) {
		this.riskMitigationComments = riskMitigationComments;
	}
	public String getPlanInCaseOfExtensionAmendmentRejection() {
		return planInCaseOfExtensionAmendmentRejection;
	}
	public void setPlanInCaseOfExtensionAmendmentRejection(String planInCaseOfExtensionAmendmentRejection) {
		this.planInCaseOfExtensionAmendmentRejection = planInCaseOfExtensionAmendmentRejection;
	}
	@Override
	public String toString() {
		return "AssociateRequest [associateName=" + associateName + ", engagementName=" + engagementName
				+ ", majorFunction=" + majorFunction + ", band=" + band + ", primaryContact=" + primaryContact
				+ ", emailIbm=" + emailIbm + ", emailClient=" + emailClient + ", xid=" + xid + ", clientManager="
				+ clientManager + ", endDate=" + endDate + ", location=" + location + ", city=" + city + ", billType="
				+ billType + ", billCode=" + billCode + ", role=" + role + ", asOnDate=" + asOnDate + ", clientExpDate="
				+ clientExpDate + ", itExpDate=" + itExpDate + ", ibmDate=" + ibmDate + ", experienceWithClient="
				+ experienceWithClient + ", careerExperience=" + careerExperience + ", experienceWithIbm="
				+ experienceWithIbm + ", skillset=" + skillset + ", resourceCriticality=" + resourceCriticality
				+ ", atImmigrationVisaRisks=" + atImmigrationVisaRisks + ", backupSuccessorResource="
				+ backupSuccessorResource + ", keyContingencyGroup=" + keyContingencyGroup + ", additionalContingency="
				+ additionalContingency + ", visaType=" + visaType + ", workPermitValidUntil=" + workPermitValidUntil
				+ ", extensionUpdates=" + extensionUpdates + ", visaMaxOutDate=" + visaMaxOutDate + ", timeLeftInUs="
				+ timeLeftInUs + ", h1bNominations=" + h1bNominations + ", riskMitigationComments="
				+ riskMitigationComments + ", planInCaseOfExtensionAmendmentRejection="
				+ planInCaseOfExtensionAmendmentRejection + "]";
	}
    

}
