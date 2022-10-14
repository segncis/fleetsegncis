package com.segncis.app.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.segncis.app.fleetapp.models.Employee;
import com.segncis.app.fleetapp.models.User;
import com.segncis.app.fleetapp.repositories.EmployeeRepository;
import com.segncis.app.fleetapp.repositories.UserRepository;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private UserRepository userrepository;
	
	//Get All Employees
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}	
	
	//Get Employee By Id
	public Optional<Employee> findById(int id) {
		return employeeRepository.findById(id);
	}	
	
	//Delete Employee
	public void delete(int id) {
		employeeRepository.deleteById(id);
	}
	
	//Update Employee
	public void save( Employee employee) {
		employeeRepository.save(employee);
	}
	
	//Get Employee by username
	public Employee findByUsername(String un) {
		return employeeRepository.findByUsername(un);
	}
	
	public void assignUsername(int id){
		Employee employee = employeeRepository.findById(id).orElse(null);
		User user = userrepository.findByFirstnameAndLastname(
				employee.getFirstname(),
				employee.getLastname());
		employee.setUsername(user.getUsername());
		employeeRepository.save(employee);
	}
	
	public void assignUsernameMatricule(int id){
		Employee employee = employeeRepository.findById(id).orElse(null);
		User user = userrepository.findByMatricule(
				employee.getMatricule());
		employee.setUsername(user.getUsername());
		employeeRepository.save(employee);
	}
}
