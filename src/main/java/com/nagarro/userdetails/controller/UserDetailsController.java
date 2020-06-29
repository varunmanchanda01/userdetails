package com.nagarro.userdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.userdetails.response.dto.UserDetailsResponseTO;
import com.nagarro.userdetails.service.UserDetailsService;

@RestController
public class UserDetailsController {

	@Autowired
	private UserDetailsService userDetailsService;

	@GetMapping(value = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserDetailsResponseTO> getUserDetailsUsingId(@PathVariable("id") String id) {
		return new ResponseEntity<>(userDetailsService.getUserDetails(id), HttpStatus.OK);
	}

}
