package com.zohocrmkunnu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmkunnu.entities.Contact;
import com.zohocrmkunnu.entities.Lead;
import com.zohocrmkunnu.service.ContactService;
import com.zohocrmkunnu.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/viewCreate")
	public String viewCreateLeadPage() {
		return"create_new_lead";
	}
    @RequestMapping("/save")
	public String saveLead(@ModelAttribute("lead")Lead lead,Model model) {
    	leadService.saveOneLead(lead);
    	model.addAttribute("lead", lead);
		return"lead_info";
	}
    @RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id")long id,Model model) {
    	Lead lead = leadService.findLeadById(id);
    	Contact contact=new Contact();
    	contact.setFirstName(lead.getFirstName());
    	contact.setLastName(lead.getLastName());
    	contact.setEmail(lead.getEmail());
    	contact.setMobile(lead.getMobile());
    	contact.setSource(lead.getSource());
    	
    	contactService.saveContact(contact);
    	
    	leadService.deleteLeadById(id);
    	
    	List<Contact> contacts = contactService.getAllContacts();
    	model.addAttribute("contacts", contacts);
		return"listAll_contact";
    	}
    
    @RequestMapping("/listall")
    public String listAllLeads(Model model) {
    	List<Lead> lead= leadService.findAllLead();
    	model.addAttribute("lead", lead);
    	return"listall_leads";
    }
    @RequestMapping("/LeadInfo")
    public String leadInfo(@RequestParam("id")long id,Model model) {
    	Lead lead = leadService.findLeadById(id);
    	model.addAttribute("lead", lead);
    	return"lead_info";
    }
}
