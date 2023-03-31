package com.rajabrahman.springbootproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajabrahman.springbootproject.model.Booking;
import com.rajabrahman.springbootproject.repository.BookingRepository;


@RestController
public class BookingController {
	@Autowired
	  BookingRepository bkrep;
  @PostMapping("/getBooking")
  public Booking getbooking(@RequestBody Booking bk) {
  return bkrep.save(bk);
  }
	@RequestMapping("/demo")
	public List<Booking> getName() {
		return bkrep.findAll();
	}
	@GetMapping("/raja")
	public String getNa() {
		return "raja";
	}
	

}
