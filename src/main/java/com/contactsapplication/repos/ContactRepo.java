package com.contactsapplication.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contactsapplication.model.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer> {

}
