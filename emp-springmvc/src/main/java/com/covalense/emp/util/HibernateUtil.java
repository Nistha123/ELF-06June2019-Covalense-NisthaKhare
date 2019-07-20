package com.covalense.emp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.Data;

public class HibernateUtil {
	@Autowired
	private SessionFactory sessionfactory;
	public Session openSession() {
		
		return sessionfactory.openSession();
	}//end of method

}//end of class
