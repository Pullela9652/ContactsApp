package com.contactsapplication.serviceImpl;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.contactsapplication.model.Contact;
import com.contactsapplication.repos.ContactRepo;
import com.contactsapplication.service.ContactService;

@Service
public class ServiceImpl implements ContactService {

	@Autowired(required=true)
	private ContactRepo contactRepo;

	@Override
	public String createConatct(Contact contact) {
		contact = contactRepo.save(contact);
		if (contact.getContactId() != null) {

			return "Saved Contact";

		} else {

			return "not Saved Contact";

		}

	}

	@Override
	public List<Contact> getAllContact() {

		return contactRepo.findAll();
	}

	@Override
	public Contact getContact(int contactId) {

		Optional<Contact> con = contactRepo.findById(contactId);

		if (con.isPresent()) {

			return con.get();

		} else {
			return null;

		}

	}

	@Override
	public String updateContact(Contact contact) {

		Contact contact2 = contactRepo.save(contact);
		if (contact2.getContactId() != null) {

			return "Update Contail details Successfully";

		} else {
			return "Not updated ContactDetails";

		}

	}

	@Override
	public String deleteContact(int contactId) {

		if (contactRepo.existsById(contactId)) {

			contactRepo.deleteById(contactId);
			return "Contact Deleted success fully";

		} else {
			return "Contact Not deleted Successfully";
		}
	}

}
