package com.covalense.javaapp.loggerexp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {

	public static final Logger loger = Logger.getLogger("Amazon");
	
	void connectDB()
	{
		loger.log(Level.SEVERE,"Hi,it's a SEVERE message of Register");
		loger.log(Level.WARNING,"Hi,it's a WARNING message of Register");
		loger.log(Level.INFO,"Hi,it's a INFO message of Register");
		loger.log(Level.CONFIG,"Hi,it's a CONFIG message of Register");
		loger.log(Level.FINE,"Hi,it's a FINE message of Register");
		loger.log(Level.FINER,"Hi,it's a FINER message of Register");
		loger.log(Level.FINEST,"Hi,it's a FINEST message of Register");
	}
	
	void store()
	{
		loger.log(Level.SEVERE,"Hi,it's a SEVERE message of store");
		loger.log(Level.WARNING,"Hi,it's a WARNING message of store");
		loger.log(Level.INFO,"Hi,it's a INFO message of store");
		loger.log(Level.CONFIG,"Hi,it's a CONFIG message of store");
		loger.log(Level.FINE,"Hi,it's a FINE message of store");
		loger.log(Level.FINER,"Hi,it's a FINER message of store");
		loger.log(Level.FINEST,"Hi,it's a FINEST message of store");
	}
}
