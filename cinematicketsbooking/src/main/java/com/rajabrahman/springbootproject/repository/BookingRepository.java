package com.rajabrahman.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajabrahman.springbootproject.model.Booking;

public interface BookingRepository extends JpaRepository<Booking,Long>{
	

}
