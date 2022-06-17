package com.pru.test.associate.service.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pru.test.associate.service.VO.AssociateWithSkillTemplateVO;
import com.pru.test.associate.service.entity.Associate;
import com.pru.test.associate.service.entity.AssociateSkill;
import com.pru.test.associate.service.model.SearchAssociateRequest;
import com.pru.test.associate.service.model.SkillExcelExport;
import com.pru.test.associate.service.repo.AssociateRepo;
import com.pru.test.associate.service.repo.AssociateSkillRepo;
import com.pru.test.associate.service.repo.AssociateSkillWithoutJPARepo;
import com.pru.test.associate.service.service.AssociateService;

@Service
public class AssociateServiceImpl implements AssociateService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private AssociateRepo associateRepo;

	@Autowired
	private AssociateSkillWithoutJPARepo associateSkillWithoutJPARepo;

	@Autowired
	private AssociateSkillRepo associateSkillRepo;

	@Value("${skill.service.url}")
	private String skillServiceUrl;

	@Override
	@Transactional
	public AssociateWithSkillTemplateVO saveAssociateDetails(AssociateWithSkillTemplateVO formData) {

		Associate asso = formData.getAssociate();
		asso.setActiveInactive("Active");
		Associate associateResponse = associateRepo.save(asso);

		List<AssociateSkill> assoSkill = formData.getAssociateSkill();
		List<AssociateSkill> saveAssoSkill = new ArrayList<>();
		for (AssociateSkill skillTabheader : assoSkill) {
			skillTabheader.setAssociateId(associateResponse.getAssociateId());
			saveAssoSkill.add(skillTabheader);
		}
		List<AssociateSkill> associateSkillResponse = associateSkillRepo.saveAll(saveAssoSkill);

		AssociateWithSkillTemplateVO responseVO = new AssociateWithSkillTemplateVO();
		responseVO.setAssociate(associateResponse);
		responseVO.setAssociateSkill(associateSkillResponse);

		return responseVO;
	}

	public HttpHeaders restHeader() {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		return headers;
	}

	@Override
	public AssociateWithSkillTemplateVO getAssociateWithSkillDetails(Long associateId) {

		AssociateWithSkillTemplateVO responseTemplateVO = new AssociateWithSkillTemplateVO();
		Associate associate = getAssociateDetails(associateId);
		HttpEntity<String> entity = new HttpEntity<String>(restHeader());
		// List<AssociateSkill> skills= (List<AssociateSkill>)
		// restTemplate.getForObject(skillServiceUrl+"/pru-skill/get-skill/"+associate.getAssociateId(),
		// AssociateSkill.class);
		ResponseEntity<List> skills = restTemplate.exchange(
				skillServiceUrl + "/pru-skill/get-skill/" + associate.getAssociateId(), HttpMethod.GET, entity,
				new ParameterizedTypeReference<List>() {
				}, associate.getAssociateId());

		responseTemplateVO.setAssociate(associate);
		responseTemplateVO.setAssociateSkill(skills.getBody());

		return responseTemplateVO;
	}

	@Override
	public Associate getAssociateDetails(Long associateId) {

		return associateRepo.findByAssociateId(associateId);
	}

	@Override
	public List<Associate> searchAssociateDetails(SearchAssociateRequest formData) {
		// TODO Auto-generated method stub

		String associateName = formData.getAssociateName();
		String band = formData.getBand();
		String emailIbm = formData.getEmailIbm();
		String xid = formData.getXid();

		// return
		// associateRepo.searchAssociateDetailsSQL(associateName,band,emailIbm,xid);
		return associateRepo.searchAssociateDetailsSQL(associateName);
		// return null;
	}

	@Override
	public List<Associate> getAssociateDetailsForExcelExportIbmId(String ibmId) {
		// TODO Auto-generated method stub
		return associateRepo.getExcelDetailsByAssociateId(ibmId);
	}

	@Override
	public List<Associate> getAssociateDetailsForExcelExport() {
		// TODO Auto-generated method stub
		return associateRepo.findAll();
	}

	@Override
	public List<SkillExcelExport> getAssociateSkillDetailsForExcelExportIbmId(String ibmId) {
		// TODO Auto-generated method stub
		return associateSkillWithoutJPARepo.listAssociateSkillDetailsForExcelExportIbmId(ibmId);
	}

}
