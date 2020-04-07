package com.control.textlocal.reports.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.control.textlocal.reports.model.Reports;

public interface ReportingRepository extends MongoRepository<Reports,String>{
	Page<Reports> findAll(Pageable pageable);
}

