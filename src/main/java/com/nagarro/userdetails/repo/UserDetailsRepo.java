package com.nagarro.userdetails.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.userdetails.entity.UserDetailsEntity;

@Repository
public interface UserDetailsRepo  extends JpaRepository<UserDetailsEntity,Long>{

}
