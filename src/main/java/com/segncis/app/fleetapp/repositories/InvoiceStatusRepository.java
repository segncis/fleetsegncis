package com.segncis.app.fleetapp.repositories;

import com.segncis.app.fleetapp.models.InvoiceStatus;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Integer> {

	
}
