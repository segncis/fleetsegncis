package com.segncis.app.fleetapp.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Table(name="employee")
public class Employee{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String photo;
	
	@Column(name="username")
	private String username;
	
	@Column(name="matricule")
	private String matricule;
	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", photo=" + photo + ", username=" + username + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", title=" + title + ", city=" + city + ", address=" + address + ", phone="
				+ phone + ", email=" + email + "]";
	}

	public Employee(Integer id, String photo, String username, String firstname, String lastname, String title,
			String city, String address, String phone, String email, String matricule) {
		super();
		this.id = id;
		this.photo = photo;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.title = title;
		this.city = city;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.matricule= matricule;
		
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String firstname;
	private String lastname;
	
	private String title;

	private String city;
	private String address;
	private String phone;
	private String email;
	


	public Employee() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
