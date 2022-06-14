package com.pru.test.associate.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pru.test.associate.service.entity.Associate;
import com.pru.test.associate.service.entity.AssociateSkill;

@Repository
public interface AssociateSkillRepo extends JpaRepository<AssociateSkill, Long> {
	
	
}
