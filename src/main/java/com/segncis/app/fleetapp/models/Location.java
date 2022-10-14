package com.segncis.app.fleetapp.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Table(name="location")
public class Location{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	private String description;
	private String details;
	
	@ManyToOne
	@JoinColumn(name="countryid", insertable=false, updatable=false)
	private Country country;
	private Integer countryid;
	
	@ManyToOne
	@JoinColumn(name="stateid", insertable=false, updatable=false)
	private State state;	
	private Integer stateid;
		
	private String city;
	private String address;
	
	
}
