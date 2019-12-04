package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Location;


public interface LocationDao extends CrudRepository<Location,Long>{
	public Location save(Location loc);
}
