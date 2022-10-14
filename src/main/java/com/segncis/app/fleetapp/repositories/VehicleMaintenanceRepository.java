package com.segncis.app.fleetapp.repositories;

import com.segncis.app.fleetapp.models.VehicleMaintenance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance, Integer> {

	
}
