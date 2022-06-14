package com.pru.test.associate.service.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="tbl_associate_details")
//@NamedQuery(name = "User.getUserByNamedJPQL", query = "FROM User WHERE userId = ?1")
public class Associate {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long associateId;
    private String associateName;
    private String engagementName;
    private String majorFunction;
    private String band;
    private String primaryContact;
    private String emailIbm;
    private String emailPru;
    private String xid;
    private String prudentialManager;
    private Date endDate;
    private String location;
    private String city;
    private String billType;
    private String billCode;
    private String role;
    private Date asOnDate;
    private Date pruExpDate;
    private Date itExpDate;
    private Date ibmDate;
    private String experienceWithPru;
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
    private String activeInactive;
    
	public Long getAssociateId() {
		return associateId;
	}
	public void setAssociateId(Long associateId) {
		this.associateId = associateId;
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
	public String getEmailPru() {
		return emailPru;
	}
	public void setEmailPru(String emailPru) {
		this.emailPru = emailPru;
	}
	public String getXid() {
		return xid;
	}
	public void setXid(String xid) {
		this.xid = xid;
	}
	public String getPrudentialManager() {
		return prudentialManager;
	}
	public void setPrudentialManager(String prudentialManager) {
		this.prudentialManager = prudentialManager;
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
	public Date getPruExpDate() {
		return pruExpDate;
	}
	public void setPruExpDate(Date pruExpDate) {
		this.pruExpDate = pruExpDate;
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
	public String getExperienceWithPru() {
		return experienceWithPru;
	}
	public void setExperienceWithPru(String experienceWithPru) {
		this.experienceWithPru = experienceWithPru;
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
	public String getActiveInactive() {
		return activeInactive;
	}
	public void setActiveInactive(String activeInactive) {
		this.activeInactive = activeInactive;
	}
	
	public Associate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Associate(Long associateId, String associateName, String engagementName, String majorFunction, String band,
			String primaryContact, String emailIbm, String emailPru, String xid, String prudentialManager, Date endDate,
			String location, String city, String billType, String billCode, String role, Date asOnDate, Date pruExpDate,
			Date itExpDate, Date ibmDate, String experienceWithPru, String careerExperience, String experienceWithIbm,
			String skillset, String resourceCriticality, String atImmigrationVisaRisks, Long backupSuccessorResource,
			String keyContingencyGroup, String additionalContingency, String visaType, String workPermitValidUntil,
			String extensionUpdates, Date visaMaxOutDate, String timeLeftInUs, String h1bNominations,
			String riskMitigationComments, String planInCaseOfExtensionAmendmentRejection, String activeInactive) {
		super();
		this.associateId = associateId;
		this.associateName = associateName;
		this.engagementName = engagementName;
		this.majorFunction = majorFunction;
		this.band = band;
		this.primaryContact = primaryContact;
		this.emailIbm = emailIbm;
		this.emailPru = emailPru;
		this.xid = xid;
		this.prudentialManager = prudentialManager;
		this.endDate = endDate;
		this.location = location;
		this.city = city;
		this.billType = billType;
		this.billCode = billCode;
		this.role = role;
		this.asOnDate = asOnDate;
		this.pruExpDate = pruExpDate;
		this.itExpDate = itExpDate;
		this.ibmDate = ibmDate;
		this.experienceWithPru = experienceWithPru;
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
		this.activeInactive = activeInactive;
	}
	
	@Override
	public String toString() {
		return "Associate [associateId=" + associateId + ", associateName=" + associateName + ", engagementName="
				+ engagementName + ", majorFunction=" + majorFunction + ", band=" + band + ", primaryContact="
				+ primaryContact + ", emailIbm=" + emailIbm + ", emailPru=" + emailPru + ", xid=" + xid
				+ ", prudentialManager=" + prudentialManager + ", endDate=" + endDate + ", location=" + location
				+ ", city=" + city + ", billType=" + billType + ", billCode=" + billCode + ", role=" + role
				+ ", asOnDate=" + asOnDate + ", pruExpDate=" + pruExpDate + ", itExpDate=" + itExpDate + ", ibmDate="
				+ ibmDate + ", experienceWithPru=" + experienceWithPru + ", careerExperience=" + careerExperience
				+ ", experienceWithIbm=" + experienceWithIbm + ", skillset=" + skillset + ", resourceCriticality="
				+ resourceCriticality + ", atImmigrationVisaRisks=" + atImmigrationVisaRisks
				+ ", backupSuccessorResource=" + backupSuccessorResource + ", keyContingencyGroup="
				+ keyContingencyGroup + ", additionalContingency=" + additionalContingency + ", visaType=" + visaType
				+ ", workPermitValidUntil=" + workPermitValidUntil + ", extensionUpdates=" + extensionUpdates
				+ ", visaMaxOutDate=" + visaMaxOutDate + ", timeLeftInUs=" + timeLeftInUs + ", h1bNominations="
				+ h1bNominations + ", riskMitigationComments=" + riskMitigationComments
				+ ", planInCaseOfExtensionAmendmentRejection=" + planInCaseOfExtensionAmendmentRejection
				+ ", activeInactive=" + activeInactive + "]";
	}
    
	
}
