package com.pru.test.associate.service.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pru.test.associate.service.VO.AssociateWithSkillTemplateVO;
import com.pru.test.associate.service.entity.Associate;
import com.pru.test.associate.service.model.AssociateRequest;
import com.pru.test.associate.service.model.SearchAssociateRequest;
import com.pru.test.associate.service.model.SkillExcelExport;


public interface AssociateService {

	
	public AssociateWithSkillTemplateVO saveAssociateDetails(AssociateWithSkillTemplateVO formData);

	public AssociateWithSkillTemplateVO getAssociateWithSkillDetails(Long associateId);

	public Associate getAssociateDetails(Long associateId);

	public List<Associate> searchAssociateDetails(SearchAssociateRequest formData);

	public List<Associate> getAssociateDetailsForExcelExportIbmId(String ibmId);

	public List<Associate> getAssociateDetailsForExcelExport();

	public List<SkillExcelExport> getAssociateSkillDetailsForExcelExportIbmId(String ibmId);

	public Map<String, List<SkillExcelExport>> getlistAssociateSkillDetailsForExcelExport();

	
}
