package com.zohocrmkunnu.service;

import java.util.List;

import com.zohocrmkunnu.entities.Contact;

public interface ContactService {

	public void saveContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact findContactById(long id);

	public Contact getContactsById(long id);
}
