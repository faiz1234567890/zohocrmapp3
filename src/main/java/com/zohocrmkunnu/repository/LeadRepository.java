package com.zohocrmkunnu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrmkunnu.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
