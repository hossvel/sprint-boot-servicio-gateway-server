package com.devhoss.app.gatewayserver.security;

import org.springframework.context.annotation.Bean;

import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;

import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class SpringSecurityConfig {
	
	@SuppressWarnings("removal")
	@Bean
	public SecurityWebFilterChain configure(ServerHttpSecurity http) {
		return http.authorizeExchange().anyExchange().authenticated().and().csrf().disable().build();
		
		
	}
	
}