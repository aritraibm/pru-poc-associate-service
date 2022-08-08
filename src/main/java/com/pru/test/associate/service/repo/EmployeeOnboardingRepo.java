package com.pru.test.associate.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pru.test.associate.service.entity.EmployeeOnboarding;

@Repository
public interface EmployeeOnboardingRepo extends JpaRepository<EmployeeOnboarding, Long> {

}
