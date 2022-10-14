package com.segncis.app.fleetapp;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.Authentication;
public class SpringSecurityAuditorAware implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		
		String username = authentication.getName();
		
		return Optional.ofNullable(username).filter(s -> !s.isEmpty());
	}

}
