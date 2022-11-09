package com.zohocrmkunnu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmkunnu.entities.Lead;
import com.zohocrmkunnu.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void saveOneLead(Lead lead) {
      leadRepo.save(lead);		
	}

	@Override
	public Lead findLeadById(long id) {
      Optional<Lead> findById = leadRepo.findById(id);	
      Lead lead = findById.get();
      return lead;
	}

	@Override
	public void deleteLeadById(long id) {
     leadRepo.deleteById(id);		
	}

	@Override
	public List<Lead> findAllLead() {
		List<Lead> lead = leadRepo.findAll();
		return lead;
	}



}
