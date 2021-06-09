package com.movieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.movieapp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

	@Query("from User where loginId like:loginId and password like:password")
	public User userLogin(String loginId,String password);
}
