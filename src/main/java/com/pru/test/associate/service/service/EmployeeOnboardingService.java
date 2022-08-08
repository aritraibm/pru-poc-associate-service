package com.pru.test.associate.service.service;

import java.util.List;

import com.pru.test.associate.service.entity.EmployeeOnboarding;

public interface EmployeeOnboardingService {
	
	public EmployeeOnboarding saveEmployeeOnboarding(EmployeeOnboarding onboarding);	
	
	public List<EmployeeOnboarding> saveAllOnBoardingChecklist(List<EmployeeOnboarding> onboardings);
	
	public EmployeeOnboarding getEmployeeOnboardingById(Long Id);
	
	public List<EmployeeOnboarding> getAllEmployeeOnboarding();
	
	public void deleteEmployeeOnboarding(Long employeeOnboardingId);

}
