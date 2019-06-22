package com.covalense.javaapp.loggerexp;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.swing.text.SimpleAttributeSet;


public class AmazonLoger {
	
	public static final Logger loger = Logger.getLogger("Amazon");
	
	public static void main(String[] args) {
		
		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);
		
		try {
			FileHandler fh = new FileHandler("AmazonLogger.log");
			fh.setFormatter(new SimpleFormatter());
			fh.setLevel(Level.CONFIG);
			
			loger.addHandler(fh);
			
			Register r = new Register();
			r.connectDB();
			r.store();
			
			Login l = new Login();
			l.validateUser();
			
			
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
	}

}
