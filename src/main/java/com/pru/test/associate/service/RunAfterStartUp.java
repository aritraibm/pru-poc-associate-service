package com.pru.test.associate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.pru.test.associate.service.entity.Associate;
import com.pru.test.associate.service.repo.AssociateRepo;

@Component
public class RunAfterStartUp {
	
	@Autowired
	private AssociateRepo associateRepo;
	
	@EventListener(ApplicationReadyEvent.class)
	public void runAfterStartup() {
		if(associateRepo.findAll().size() < 1) {
			associateRepo.save(new Associate("Test1", "123456", "test@abc.com","Yet to be started"));
			System.out.println("Associate created.....");
		}
	}

}
