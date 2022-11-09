package com.zohocrmkunnu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrmkunnu.dto.Email;
import com.zohocrmkunnu.util.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@ModelAttribute("email")String email,Model model) {
		model.addAttribute("email", email);
		return"compose_email";
	}
	@RequestMapping("/triggerEmail")
	public String triggerEmail(Email email,Model model) {
		emailService.sendSimpleMail(email.getEmail(), email.getSubject(), email.getContent());
		model.addAttribute("msg", "send email Successfully");
		return"compose_email";
	}

}
