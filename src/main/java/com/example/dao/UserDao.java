package com.example.dao;

import java.util.List;
import java.util.function.Consumer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Location;
import com.example.model.Users;
@Repository
public interface UserDao extends CrudRepository<Users,Long>{

	public Users findByUsernameAndPassword(String username, String password);

	
		
	

	
}
