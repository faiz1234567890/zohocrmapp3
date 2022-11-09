package com.zohocrmkunnu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmkunnu.entities.Billing;
import com.zohocrmkunnu.entities.Contact;
import com.zohocrmkunnu.service.BillingService;
import com.zohocrmkunnu.service.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;
    
	@RequestMapping("/generateBill")
	public String viewBillingPage(@RequestParam("id")long id,Model model) {
		Contact contact = contactService.getContactsById(id);
		model.addAttribute("contact", contact);
		return"generate_bill";
	}
	 @RequestMapping("/saveBill")
	    public String saveBilling(@ModelAttribute("billing")Billing billing,Model model) {
		 billingService.saveOneBill(billing);
	 model.addAttribute("msg", "bill is generated");
	    	return"create_new_billing";
	 }

}
