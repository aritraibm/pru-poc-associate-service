package com.pru.test.associate.service.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pru.test.associate.service.entity.EmployeeOnboarding;

@Repository
public interface EmployeeOnboardingRepo extends MongoRepository<EmployeeOnboarding, Long> {

}
