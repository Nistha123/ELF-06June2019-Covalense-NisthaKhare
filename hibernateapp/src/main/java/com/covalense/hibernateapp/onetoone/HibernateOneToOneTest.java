package com.covalense.hibernateapp.onetoone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class HibernateOneToOneTest {
	public static void main(String[] args){
		//Prepare the data
		int id = 30;
		EmployeeInfoBean data = PrepareDataUtil.prepareData(id);
		save(data);
		
	}//End of main
	
	private static void save(EmployeeInfoBean data) {
		Transaction transaction=null;	
		try(Session session = HibernateUtil.openSession()){
			 transaction = session.beginTransaction();
			 session.save(data);
			 transaction.commit();
		}catch (Exception e) {
			log.info(Arrays.toString(e.getStackTrace()));
			if(transaction!=null) {
				transaction.rollback();
			}
		}//End of catch
	}

}//End of class
