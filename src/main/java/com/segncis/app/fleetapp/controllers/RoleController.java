package com.segncis.app.fleetapp.controllers;

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

import com.segncis.app.fleetapp.models.Role;
import com.segncis.app.fleetapp.models.User;
import com.segncis.app.fleetapp.services.RoleService;
import com.segncis.app.fleetapp.services.UserService;

@Controller
public class RoleController {

@Autowired private RoleService roleService;
@Autowired private UserService userService;
	

//Get All roles
@GetMapping("/roles")
public String findAll(Model model){		
	model.addAttribute("roles", roleService.findAll());
	return "roleUser";
}	
// Role des Username
@GetMapping("/security/user/Edit/{id}")
public String editUser(@PathVariable Integer id, Model model){
    User user = userService.findById(id).get();
    model.addAttribute("user", user);
    model.addAttribute("userRoles", roleService.getUserRoles(user));
    model.addAttribute("userNotRoles", roleService.getUserNotRoles(user));
    return "userRole";
}

@RequestMapping("/security/role/assign/{userId}/{roleId}")
public String assignRole(@PathVariable Integer userId, 
                         @PathVariable Integer roleId){
    roleService.assignUserRole(userId, roleId);
    return "redirect:/user/Edit/"+userId;
}

@RequestMapping("/security/role/unassign/{userId}/{roleId}")
public String unassignRole(@PathVariable Integer userId,
                           @PathVariable Integer roleId){
    roleService.unassignUserRole(userId, roleId);
    return "redirect:/user/Edit/"+userId;
}


@RequestMapping("roles/findById") 
@ResponseBody
public Optional<Role> findById(Integer id)
{
	return roleService.findById(id);
}

//Add role
@PostMapping(value="roles/addNew")
public String addNew(Role role) {
	roleService.save(role);
	return "redirect:/roles";
}	

@RequestMapping(value="roles/update", method = {RequestMethod.PUT, RequestMethod.GET})
public String update(Role role) {
	roleService.save(role);
	return "redirect:/roles";
}

@RequestMapping(value="roles/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
public String delete(Integer id) {
	roleService.delete(id);
	return "redirect:/roles";
}
	
	
	
	
}
