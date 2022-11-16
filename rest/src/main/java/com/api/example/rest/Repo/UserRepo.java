package com.api.example.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.example.rest.Models.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
