package com.zosh.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zosh.modal.Driver;

public interface DriverService  {
	
	public Driver findDriverById(Integer driverId);
	
	public Driver updateDriver(Driver driver);
	
	public void deleteDriver(Integer id);

}
