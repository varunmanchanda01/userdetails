package com.nagarro.userdetails.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.userdetails.entity.UserDetailsEntity;
import com.nagarro.userdetails.repo.UserDetailsRepo;
import com.nagarro.userdetails.response.dto.UserDetailsResponseTO;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsRepo userDetailsRepo;

	@Override
	public UserDetailsResponseTO getUserDetails(String id) {

		Optional<UserDetailsEntity> userDetails = userDetailsRepo.findById(Long.parseLong(id));
		UserDetailsResponseTO detailsResponseTO = new UserDetailsResponseTO();
		UserDetailsEntity detailsEntity = new UserDetailsEntity();
		if (userDetails.isPresent()) {
			detailsEntity = userDetails.get();
		}
		detailsResponseTO.setAge(detailsEntity.getAge());
		detailsResponseTO.setName(detailsEntity.getName());
		detailsResponseTO.setEmail(detailsEntity.getEmail());
		return detailsResponseTO;
	}
}