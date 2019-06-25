package com.covalense.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class PVR {

	synchronized void book() {
		
		for(int i=0 ; i<5 ; i++) {
			log.info("" + i);
			
			try {
				wait(2000,56);
				//Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
