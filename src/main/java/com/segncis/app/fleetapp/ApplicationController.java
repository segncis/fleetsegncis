package com.segncis.app.fleetapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ApplicationController {

	@GetMapping("/index")
	 public String goHome() {
		 return "index";
	 }
	
	
	@GetMapping("/login")
	 public String login() {
		 return "pages-login";
	 }
	
	@GetMapping("/logout")
	 public String logout() {
		 return "pages-login";
	 }
	
	@GetMapping("/register")
	 public String register() {
		 return "pages-register";
	 }
	
	@GetMapping("/accessDenied")
	 public String accessDenied() {
		 return "accessDenied";
	 }
	
	/*
	@GetMapping("/profile")
	 public String profile() {
		 return "users-profile"; 
	 }
	*/
}
