package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Credentials;
import com.example.model.FileUpload;
import com.example.model.Location;
import com.example.model.Users;
import com.example.service.UserService;

@RestController
@CrossOrigin
public class LoginController {
	@Autowired 
	private UserService service;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Users getRoleByLogin(@RequestBody Users u) {
		System.out.println(u.getUsername());
		System.out.println(u.getPassword());
		
		Users user = service.getRoleByLogin(u.getUsername(),u.getPassword());
		return user;
	}
	
	@GetMapping(value = "/loginTest")
	public String getRoleByLogin1() {
		
         		
		//Users u = service.getRoleByLogin(username,password);
		return "test";
	}
	@RequestMapping(value = "/uploadLocation", method = RequestMethod.POST)
	public Location saveLocation(@RequestBody FileUpload fileName) {
		
		Location loc = service.saveLocation(fileName);
		return loc;
	}
	

}
