package com.contactsapplication.service;

import java.util.List;

import com.contactsapplication.model.Contact;


public interface ContactService {
	
//create resource by using 
	
	public String createConatct(Contact contact);
	
	
	//get All contacts
	
	public List<Contact> getAllContact();
	
	//get One contact by using contact id
	
	public Contact getContact(int contactId);
	
	//Update contact 
	
	public String updateContact(Contact contact);
	
	//delete contact by using contact id 
	
	public String deleteContact(int contactId);

}
