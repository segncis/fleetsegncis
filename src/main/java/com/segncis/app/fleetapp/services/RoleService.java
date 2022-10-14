package com.segncis.app.fleetapp.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.segncis.app.fleetapp.models.Role;
import com.segncis.app.fleetapp.models.User;
import com.segncis.app.fleetapp.repositories.RoleRepository;
import com.segncis.app.fleetapp.repositories.UserRepository;


@Service
public class RoleService {

	
	@Autowired private RoleRepository roleRepository;
	@Autowired private UserRepository userRepository;
	
	public List<Role>findAll() {
		return roleRepository.findAll();
	}
	
	public Optional<Role>findById(int id){
		return roleRepository.findById(id);
		
	}
	
	public void delete (int id) {
		roleRepository.deleteById(id);
	}
	
	public void save(Role role) {
		roleRepository.save(role);
	}
	
	
	//Assign Role to User
	public void assignUserRole(Integer userId, Integer roleId){
	    User user  = userRepository.findById(userId).orElse(null);
	    Role role = roleRepository.findById(roleId).orElse(null);
	   Set<Role> userRoles = user.getRoles();
	   userRoles.add(role);
	   user.setRoles(userRoles);
	   userRepository.save(user);
	}
	
	//Unassign Role to User
	public void unassignUserRole(Integer userId, Integer roleId){
	    User user  = userRepository.findById(userId).orElse(null);
	    user.getRoles().removeIf(x -> x.getId()==roleId);
	    userRepository.save(user);
	}
	
	public Set<Role> getUserRoles(User user){
	    return user.getRoles();
	}
	
	public Set<Role> getUserNotRoles( User user){
		
		return roleRepository.getUserNotRoles(user.getId());
		
	}
	
}
