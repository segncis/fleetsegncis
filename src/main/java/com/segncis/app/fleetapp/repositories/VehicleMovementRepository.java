package com.segncis.app.fleetapp.repositories;


import com.segncis.app.fleetapp.models.VehicleMovement;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {

	
}
