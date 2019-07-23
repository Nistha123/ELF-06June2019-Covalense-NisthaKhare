package com.covalense.springcore_assignment.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.covalense.springcore_assignment.beans.Dell;
import com.covalense.springcore_assignment.beans.HP;
import com.covalense.springcore_assignment.beans.HardDisk;
import com.covalense.springcore_assignment.beans.PenDrive;
import com.covalense.springcore_assignment.interfaces.Laptop;
import com.covalense.springcore_assignment.interfaces.StorageDevice;

import lombok.extern.java.Log;

@Configuration
@Log
public class LaptopConfig {

	@Bean(name = "dell")
	public Laptop getdell() {
		return new Dell();
	}// End of getdell()

	@Bean(name = "hp")
	public Laptop getHP() {
		return new HP();
	}// End of getHP()

	@Bean(name = "PenDrive")
	public StorageDevice getPenDrive() {
		PenDrive p = new PenDrive();
		p.setCapacity(100);
		p.setReadingSpeed(18.9);
		p.setWritingSpeed(20.5);
		log.info("PenDrive Capacity is :" + p.getCapacity());
		log.info("PenDrive Reading Speed is :" + p.getCapacity());
		log.info("PenDrive Writing Speed is :" + p.getWritingSpeed());
		return p;
	}

	@Bean(name = "HardDisk")
	public StorageDevice getHardDisk() {
		HardDisk h = new HardDisk();
		h.setCapacity(100);
		h.setReadingSpeed(18.9);
		h.setWritingSpeed(20.5);
		log.info("HardDisk Capacity is :" + h.getCapacity());
		log.info("HardDisk Reading Speed is :" + h.getCapacity());
		log.info("HardDisk Writing Speed is :" + h.getWritingSpeed());

		return h;

	}

}// End of class
