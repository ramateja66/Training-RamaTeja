package com.motivity;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@EnableWebSecurity
@RestController
public class RegistrationController {
	
	@Autowired
	private Operations operations;
	
	@GetMapping("/")
	public String welcomeMessage()
	{
		boolean status=operations.established();
		if(status)
		{
			return "Hello Postman";
		}
		
		return "Not Connected";
	}
	
	@RequestMapping(value="/employeer",method=RequestMethod.POST)
	public void insertEmployees(@RequestBody Employeer emp)
	{
		operations.erinsert(emp);
	}
	
	@RequestMapping(value="/employee/{id}",method=RequestMethod.POST)
	public void insertEmployee(@RequestBody Employee emp,@PathVariable int id)
	{
		operations.insert(emp,id);
	}
	@RequestMapping(value="/view/{id}",method=RequestMethod.GET)
	public void viewEmployee(@PathVariable int id)
	{
		Employee ee=operations.view(id);
		 System.out.println(ee.getUsername()+"--"+ee.getPassword());
	}
	
	
}
	
	

