package com.nagarro.userdetails.service;

import org.springframework.stereotype.Service;

import com.nagarro.userdetails.response.dto.UserDetailsResponseTO;

@Service
public interface UserDetailsService {

	public UserDetailsResponseTO getUserDetails(String id);

}
