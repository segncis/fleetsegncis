package com.segncis.app.fleetapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class Role extends Auditable<String> {

	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Id
	    private Integer id;

	    private String description;
	    private String details;
}
