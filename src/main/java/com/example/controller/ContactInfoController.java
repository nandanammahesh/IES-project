package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.dto.Contact;
import com.example.service.ContactService;

@Controller
public class ContactInfoController {
	@Autowired
	private ContactService contactService;
	
	// for display form
		@GetMapping("/")
		public String loadIESForm(Model model) {
			return "mainIES";
		}

	// for display form
	@GetMapping("loadForm")
	public String loadContactForm(Model model) {
		Contact contactObj = new Contact();
		model.addAttribute("contact", contactObj);
		return "index";
	}

	// for submit button
	@PostMapping("saveContact")
	public String handleSubmitButton(@ModelAttribute("contact") Contact c, RedirectAttributes rattr) {
		boolean isSaved = contactService.saveContact(c);
		if (isSaved) {
			if(c.getContactId()!=null) {
			rattr.addFlashAttribute("succmsg", "contact is updated successfully");
		}
			else {
				rattr.addFlashAttribute("succmsg", "contact is saved successfully");
			}
		}
			else {
			rattr.addFlashAttribute("errmsg", "failed to save contact");
		}
		
		return "redirect:loadForm";
	}

	// for view all contacts hyper link
	@GetMapping("/viewContacts")
	public String handleViewCnctsHyperLink(Model model) {
		List<Contact> allContacts=contactService.getAllContacts();
		model.addAttribute("contacts", allContacts);
		return "viewContacts";

	}
}
