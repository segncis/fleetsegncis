package com.segncis.app.fleetapp.models;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Table(name="employeetype")
public class EmployeeType extends CommonObject {
	
	
	

	public EmployeeType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeType(Integer id, String description, String details) {
		super(id, description, details);
		// TODO Auto-generated constructor stub
	}
}
