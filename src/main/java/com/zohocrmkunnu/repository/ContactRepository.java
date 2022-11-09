package com.zohocrmkunnu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmkunnu.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
