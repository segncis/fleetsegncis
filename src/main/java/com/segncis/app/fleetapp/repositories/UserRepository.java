package com.segncis.app.fleetapp.repositories;

import com.segncis.app.fleetapp.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);
	


	User findByFirstnameAndLastname(String firstname, String lastname);
	
	User findByMatricule(String matricule);
	
	
}
