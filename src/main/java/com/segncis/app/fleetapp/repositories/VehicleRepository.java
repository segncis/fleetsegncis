package com.segncis.app.fleetapp.repositories;

import com.segncis.app.fleetapp.models.Vehicle;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

	
}
