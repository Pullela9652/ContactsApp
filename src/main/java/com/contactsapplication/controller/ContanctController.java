package com.contactsapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.contactsapplication.model.Contact;
import com.contactsapplication.service.ContactService;



@RestController
public class ContanctController {

	@Autowired
	private ContactService contactService;
	
	@GetMapping("/getContact")
	public String getContacts() {
		
		return "Welcome Restcontrollers";
	}
	
	

	@PostMapping("/contact")
	public String createContact(@RequestBody Contact contact) {

		return contactService.createConatct(contact);

	}
	
	
	@GetMapping("/contacts")
	public List<Contact> getAllContacts(){
		
		return contactService.getAllContact();
		
		
		
	}
	
	
	@GetMapping("/contact/{contactId}")
	public Contact getContact(@PathVariable Integer contactId) {
		
		return contactService.getContact(contactId);
		
	}
	
	
	@DeleteMapping("/contact/{contactId}")
	public String deleteContact(@PathVariable Integer contactId) {
		
		return contactService.deleteContact(contactId);
	}
	
	@PutMapping("/contact")
	public String updateContact(@RequestBody Contact contact) {
		
		return contactService.updateContact(contact);
		
	}

}
