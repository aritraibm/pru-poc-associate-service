package com.pru.test.associate.service.repo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pru.test.associate.service.entity.Associate;
import com.pru.test.associate.service.model.SkillExcelExport;

@Repository
public interface AssociateRepo extends JpaRepository<Associate, Long> {

	Associate findByAssociateId(Long associateId);
	
	@Query(value = "select * from tbl_associate_details where ibm_id like %:ibmId%", nativeQuery = true)
	public List<Associate> getExcelDetailsByAssociateId(@Param(value = "ibmId") String ibmId);

//	@Query(value="select * from tbl_associate_details where band= :band", nativeQuery= true)
//	List<Associate> searchAssociateDetailsSQL(@Param(value = "associateName") String associateName, @Param(value = "band") String band, @Param(value = "emailIbm") String emailIbm, @Param(value = "xid") String xid);
	
	@Query(value = "select * from tbl_associate_details where associate_name like %:associateName%", nativeQuery = true)
	public List<Associate> searchAssociateDetailsSQL(@Param(value = "associateName") String associateName);
	
	@Query(value = "select * from tbl_associate_details where as_on_date = :date", nativeQuery = true)
	public List<Associate> searchAssociateDetailsByDateSQL(Date date);
	
//	@Query(value = "SELECT asso.associate_name, asso.xid, (select skill_name from tbl_skills where skill_id=skill.skill_id) as skillName, skill.skill_rating \r\n"
//			+ "FROM tbl_associate_skills skill \r\n"
//			+ "INNER JOIN tbl_associate_details asso \r\n"
//			+ "ON asso.associate_id = skill.associate_id \r\n"
//			+ "WHERE asso.ibm_id like %:ibmId%", nativeQuery = true)
//	public List<SkillExcelExport> listAssociateSkillDetailsForExcelExportIbmId(@Param(value = "ibmId") String ibmId);

}
