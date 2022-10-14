package com.segncis.app.fleetapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.segncis.app.fleetapp.models.Country;
import com.segncis.app.fleetapp.services.CountryService;


@Controller
public class CountryController {
	
	@Autowired private CountryService countryService;
	
	//Get All Countrys
	@GetMapping("/countries")
	public String findAll(Model model){		
		model.addAttribute("countries", countryService.findAll());
		return "country";
	}	
	
/*	@GetMapping("/countries")
	public String getCountries(Model model) {
		List<Country> countryList = countryService.getCountries();
		model.addAttribute("countries", countryList);
		return "country";
	}*/
	@RequestMapping("countries/findById") 
	@ResponseBody
	public Optional<Country> findById(Integer id)
	{
		return countryService.findById(id);
	} 
	
	/*@GetMapping("/countries/edit/{id}")
	public String editCountryForm(@PathVariable Integer id, Model model) {
		
		model.addAttribute("country", countryService.findById(id));
		return "country_new";
		
	}*/
	
	//Add Country
	@PostMapping(value="countries/addNew")
	public String addNew(Country country) {
		countryService.save(country);
		return "redirect:/countries";
	}	
	
	@RequestMapping(value="countries/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Country country) {
		countryService.save(country);
		return "redirect:/countries";
	}
	
	@RequestMapping(value="countries/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		countryService.delete(id);
		return "redirect:/countries";
	}  
}