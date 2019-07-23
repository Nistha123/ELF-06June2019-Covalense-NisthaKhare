package com.covalense.springcore_assignment.beans;

import com.covalense.springcore_assignment.interfaces.StorageDevice;

import lombok.Data;
import lombok.extern.java.Log;

@Log
@Data
public class PenDrive implements StorageDevice{
	private int capacity;
	private double writingSpeed;
	private double readingSpeed;

	public void write() {
		log.info("HardDisk write() method ");
	}//End of write()

	public void read() {
		log.info("HardDisk read() method ");
	}//End of read()

	public void format() {
		log.info("HardDisk format() method ");
	}//End of format()

}//End of class
