package com.segncis.app.fleetapp.models;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Table(name="vehicle_model")
@EntityListeners(Auditable.class)
public class VehicleModel extends CommonObject {


}
