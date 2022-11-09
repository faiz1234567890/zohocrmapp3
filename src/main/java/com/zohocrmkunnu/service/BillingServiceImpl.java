package com.zohocrmkunnu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmkunnu.entities.Billing;
import com.zohocrmkunnu.repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepository billingRepo;

	@Override
	public void saveOneBill(Billing billing) {
    billingRepo.save(billing);	
	}




}
