package com.covalense.javaapp.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import lombok.extern.java.Log;

@Log
public class TestPencil {
	public static void main(String[] args) {		

		Pencil p1 = new Pencil();
		
		FutureTask<Integer> ft = new FutureTask<Integer>(p1);
		
		Thread t1 = new Thread(ft);
		
		t1.start();
		
		try {
			int i = ft.get();
			log.info("" + i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
