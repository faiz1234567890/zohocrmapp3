package com.zohocrmkunnu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmkunnu.entities.Contact;
import com.zohocrmkunnu.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	
    @RequestMapping("/listcontacts")
	public String listAllContact(Model model) {
    	List<Contact> contacts = contactService.getAllContacts();
    	model.addAttribute("contacts", contacts);
		return"listAll_contact";
	}
    @RequestMapping("/contactInfo")
    public String contactInfo(@RequestParam("id")long id,Model model) {
    	Contact contact = contactService.findContactById(id);
    	model.addAttribute("contact", contact);
    	return"contact_info";
    	  }
    }

