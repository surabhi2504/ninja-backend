package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="location_data")
@Entity

public class Location {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Location_Id;

	private String Location_name;
	public String getLocation_name() {
		return Location_name;
	}
	public void setLocation_name(String location_name) {
		Location_name = location_name;
	}
	public Long getLocation_Id() {
		return Location_Id;
	}
	public void setLocation_Id(Long location_Id) {
		Location_Id = location_Id;
	}
}
