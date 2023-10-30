package com.app.codewithsatish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.codewithsatish.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
