package com.pru.test.associate.service.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.pru.test.associate.service.entity.Associate;
import com.pru.test.associate.service.model.SkillExcelExport;

@Repository
public class AssociateSkillWithoutJPARepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<SkillExcelExport> listAssociateSkillDetailsForExcelExportIbmId(String ibmId){
		SkillExcelExport skillExcelExportModel= null;
		
		
		StringBuffer sqlQuery = new StringBuffer("SELECT asso.associate_name, asso.xid, (select skill_name from tbl_skills where skill_id=skill.skill_id), skill.skill_rating\r\n"
				+ "FROM tbl_associate_skills skill\r\n"
				+ "INNER JOIN tbl_associate_details asso\r\n"
				+ "ON asso.associate_id = skill.associate_id\r\n"
				+ "WHERE asso.ibm_id= :ibmId");
		
		
		Query query= entityManager.createNativeQuery(sqlQuery.toString());
		query.setParameter("ibmId", ibmId);
		
		//try {
			
			List<Object[]> obj= query.getResultList();
			List<SkillExcelExport> skillExcelExportModelList= new ArrayList<>();
			
			if(!obj.isEmpty()) {
				for(Object[] record : obj) {
					skillExcelExportModel= new SkillExcelExport();
					skillExcelExportModel.setAssociateName(String.valueOf(record[0]));
					skillExcelExportModel.setXid(String.valueOf(record[1]));
					skillExcelExportModel.setSkillName(String.valueOf(record[2]));
					skillExcelExportModel.setSkillRating(String.valueOf(record[3]));
					skillExcelExportModelList.add(skillExcelExportModel);
				}
			}
		//}
			
			return skillExcelExportModelList;
		//	return Arrays.asList(skillExcelExportModel);
		
	}
	
//	@Query(value = "SELECT asso.associate_name, asso.xid, (select skill_name from tbl_skills where skill_id=skill.skill_id) as skillName, skill.skill_rating \r\n"
//			+ "FROM tbl_associate_skills skill \r\n"
//			+ "INNER JOIN tbl_associate_details asso \r\n"
//			+ "ON asso.associate_id = skill.associate_id \r\n"
//			+ "WHERE asso.ibm_id like %:ibmId%", nativeQuery = true)
//	public List<SkillExcelExport> listAssociateSkillDetailsForExcelExportIbmId(@Param(value = "ibmId") String ibmId);

}
