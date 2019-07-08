package com.covalense.designpattern.builder;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class EmployeeDataTwo {

	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	private long phone;
	private String email;
	private String designation;
	private Date dob;
	private int AccountNo;
	private Date joining_date;
	private int DepartmentId;
	private int ManagerId;
	
	private EmployeeDataTwo(EmployeeDataTwoBuilder builder) {
		id           =      builder.id            ;
		name         =		builder.name          ;
		age          =		builder.age           ;
		gender       =		builder.gender        ;
		salary       =		builder.salary        ;
		phone        =		builder.phone         ;
		email        =		builder.email         ;
		designation  =		builder.designation   ;
		dob          =		builder.dob           ;
		AccountNo    =		builder.AccountNo     ;
		joining_date =		builder.joining_date  ;
		DepartmentId =		builder.DepartmentId  ;
		ManagerId    =		builder.ManagerId;    ;
	}

	public static class EmployeeDataTwoBuilder {

		private int id;
		private String name;
		private int age;
		private String gender;
		private double salary;
		private long phone;
		private String email;
		private String designation;
		private Date dob;
		private int AccountNo;
		private Date joining_date;
		private int DepartmentId;
		private int ManagerId;
		
		public EmployeeDataTwoBuilder id(int id) {
			this.id=id;
			return this;
		}
		public EmployeeDataTwoBuilder name(String name) {
			this.name=name;
			return this;
		}
		public EmployeeDataTwoBuilder age(int age) {
			this.age=age;
			return this;
		}
		public EmployeeDataTwoBuilder gender(String gender) {
			this.gender=gender;
			return this;
		}
		public EmployeeDataTwoBuilder salary(Double salary) {
			this.salary=salary;
			return this;
		}
		public EmployeeDataTwoBuilder phone(Long phone) {
			this.phone=phone;
			return this;
		}
		public EmployeeDataTwoBuilder email(String email) {
			this.email=email;
			return this;
		}
		public EmployeeDataTwoBuilder designation(String designation) {
			this.designation=designation;
			return this;
		}
		public EmployeeDataTwoBuilder dob(Date dob) {
			this.dob=dob;
			return this;
		}
		public EmployeeDataTwoBuilder AccountNo(int AccountNo) {
			this.AccountNo=AccountNo;
			return this;
		}
		public EmployeeDataTwoBuilder joining_date(Date joining_date) {
			this.joining_date=joining_date;
			return this;
		}
		public EmployeeDataTwoBuilder DepartmentId(int DepartmentId) {
			this.DepartmentId=DepartmentId;
			return this;
		}
		public EmployeeDataTwoBuilder ManagerId(int ManagerId) {
			this.ManagerId=ManagerId;
			return this;
		}
		
		public EmployeeDataTwo build() {
			return new EmployeeDataTwo(this);
		}
		
		
	}//end of inner class

}// end of class
