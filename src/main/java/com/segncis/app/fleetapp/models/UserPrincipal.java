	package com.segncis.app.fleetapp.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.segncis.app.fleetapp.repositories.RoleRepository;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class UserPrincipal implements UserDetails {

	private User user;

	public UserPrincipal(User user) {
		this.user = user;
	}	
	@Autowired private RoleRepository roleRepository;
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		//return Collections.singleton(new SimpleGrantedAuthority("USER"));
		List<GrantedAuthority> authorities = new ArrayList<>();
		for(Role role: user.getRoles()){
			authorities.add(new SimpleGrantedAuthority(role.getDescription()));
		}
		//return Collections.singleton(new SimpleGrantedAuthority("USER"));
		return authorities;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}
	
/*
	public String getName() {
		return user.getName();
	}
	
	public String getEmail() {
		return user.getEmail();
	}
*/
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	} 
}
