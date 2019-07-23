package com.covalense.springcore_assignment.beans;

import com.covalense.springcore_assignment.interfaces.StorageDevice;

import lombok.Data;
import lombok.extern.java.Log;

@Log
@Data
public class HardDisk implements StorageDevice{
	private int capacity;
	private double writingSpeed;
	private double readingSpeed;

	public void write() {
		log.info("HardDisk write() method ");
	}

	public void read() {
		log.info("HardDisk read() method ");
	}

	public void format() {
		log.info("HardDisk format() method ");
	}

}//End of class
