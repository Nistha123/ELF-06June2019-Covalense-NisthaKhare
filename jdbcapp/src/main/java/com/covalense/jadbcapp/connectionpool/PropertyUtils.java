package com.covalense.jadbcapp.connectionpool;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.java.Log;

@Log
public class PropertyUtils {
	private static PropertyUtils prop = null;
	Properties properties;
	
	public static PropertyUtils getPropertyUtil() throws Exception {
		if(prop==null) {
			prop = new PropertyUtils();
		}
		return prop;
	}
	
	private PropertyUtils() throws Exception {
		properties = new Properties();
		properties.load(new FileInputStream("ConnectionPoolFile.properties"));
		
	}
	
	public String getProperty(String key) {
		return properties.getProperty(key);
	}
	

}
