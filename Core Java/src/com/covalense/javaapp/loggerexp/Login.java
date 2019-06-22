package com.covalense.javaapp.loggerexp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Login {

	public static final Logger loger = Logger.getLogger("Amazon");
	
	int a=10;
	
	void validateUser()
	{
		loger.log(Level.SEVERE,"Hi,it's a SEVERE message of validateUser");
		loger.log(Level.WARNING,"Hi,it's a WARNING message of validateUser");
		loger.log(Level.INFO,"Hi,it's a INFO message of validateUser");
		loger.log(Level.CONFIG,"Hi,it's a CONFIG message of validateUser");
		loger.log(Level.FINE,"Hi,it's a FINE message of validateUser");
		loger.log(Level.FINER,"Hi,it's a FINER message of validateUser");
		loger.log(Level.FINEST,"Hi,it's a FINEST message of validateUser");
		
	}
}
