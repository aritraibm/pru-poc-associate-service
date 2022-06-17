package com.pru.test.associate.service.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pru.test.associate.service.VO.AssociateWithSkillTemplateVO;
import com.pru.test.associate.service.entity.Associate;
import com.pru.test.associate.service.model.AssociateRequest;
import com.pru.test.associate.service.model.SearchAssociateRequest;
import com.pru.test.associate.service.model.SkillExcelExport;
import com.pru.test.associate.service.service.AssociateService;
import com.pru.test.associate.service.serviceImpl.AssociateExcelExporter;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping(value = "/pru-associate")
public class AssociateController {
	
	@Autowired
	private AssociateService associateService;
	
	final Logger logger= LoggerFactory.getLogger(AssociateController.class);
	
	@PostMapping(value = "/save-associate")
	//@Retry(name = "save-associate", fallbackMethod = "invokeFallbackMethod")
	public AssociateWithSkillTemplateVO saveUser(@RequestBody AssociateWithSkillTemplateVO formData) {
		
		return associateService.saveAssociateDetails(formData);
	}

	@GetMapping(value = "/get-associate-with-skill-details-by-id/{associateId}")
	//@Retry(name = "get-associate-with-skill-details-by-id", fallbackMethod = "invokeFallbackMethod")
	public AssociateWithSkillTemplateVO getAssociateWithSkill(@PathVariable Long associateId) {
		
		return associateService.getAssociateWithSkillDetails(associateId);
	}
	
	@GetMapping(value = "/get-associate-details-by-id/{associateId}")
	//@Retry(name = "get-associate-details-by-id", fallbackMethod = "invokeFallbackMethod")
	public Associate getAssociate(@PathVariable Long associateId) {
		
		return associateService.getAssociateDetails(associateId);
	}
	
	
	@PostMapping(value = "/search-associate")
	// @Retry(name = "search-associate", fallbackMethod = "invokeFallbackMethod")
	public List<Associate> searchAssociate(@RequestBody SearchAssociateRequest formData) {
		
		return associateService.searchAssociateDetails(formData);
	}
	
	
	@GetMapping("/export-excel/{ibmId}")
    public void exportToExcelByIbmId(@PathVariable String ibmId, HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=Associates_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
        List<Associate> listAssociates = associateService.getAssociateDetailsForExcelExportIbmId(ibmId);
        List<SkillExcelExport> listAssociateSkills = associateService.getAssociateSkillDetailsForExcelExportIbmId(ibmId);
        
        //getAssociateSkillDetailsForExcelExportIbmId(String ibmId)
        AssociateExcelExporter excelExporter = new AssociateExcelExporter(listAssociates, listAssociateSkills);
        excelExporter.export(response);    
    }  
	
	
	@GetMapping("/export-excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=Associates_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
        List<Associate> listAssociates = associateService.getAssociateDetailsForExcelExport();
        AssociateExcelExporter excelExporter = new AssociateExcelExporter(listAssociates, null);
        excelExporter.export(response);    
    }  
	
	public String invokeFallbackMethod(Exception ex) {
		return "Service Error : "+ex.getMessage();
	}

}
