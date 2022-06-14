package com.pru.test.associate.service.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pru.test.associate.service.entity.Associate;

@Repository
public interface AssociateRepo extends JpaRepository<Associate, Long> {

	Associate findByAssociateId(Long associateId);

//	@Query(value="select * from tbl_associate_details where band= :band", nativeQuery= true)
//	List<Associate> searchAssociateDetailsSQL(@Param(value = "associateName") String associateName, @Param(value = "band") String band, @Param(value = "emailIbm") String emailIbm, @Param(value = "xid") String xid);
	
	@Query(value = "select * from tbl_associate_details where associate_name like %:associateName%", nativeQuery = true)
	public List<Associate> searchAssociateDetailsSQL(@Param(value = "associateName") String associateName);
	
}
