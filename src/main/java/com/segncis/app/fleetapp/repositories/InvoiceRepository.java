package com.segncis.app.fleetapp.repositories;

import com.segncis.app.fleetapp.models.Invoice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

	
}
