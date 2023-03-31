package com.rajabrahman.springbootproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int seatno;
	private String mvname;
	private String thname;
	public int getSeatno() {
		return seatno;
	}
	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}
	public String getMvname() {
		return mvname;
	}
	public void setMvname(String mvname) {
		this.mvname = mvname;
	}
	public String getThname() {
		return thname;
	}
	public void setThname(String thname) {
		this.thname = thname;
	}
	public Booking(String mvname, String thname) {
		super();
		this.mvname = mvname;
		this.thname = thname;
	}
	
	
public Booking() {
	
}
}
