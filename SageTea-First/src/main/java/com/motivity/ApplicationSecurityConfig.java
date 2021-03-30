package com.motivity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter
{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
	/*	http.authorizeRequests().
		anyRequest()
		.authenticated()
		.and()
		.httpBasic();*/
		http.csrf().disable();
	}

//	@Override
	//@Bean
/*	protected UserDetailsService userDetailsService() {
		// TODO Auto-generated method stub
		User.builder().username("rama").password("1234")
	}*/
	

}
