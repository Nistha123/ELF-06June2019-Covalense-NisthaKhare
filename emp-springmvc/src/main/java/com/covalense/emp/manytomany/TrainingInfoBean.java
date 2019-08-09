package com.covalense.emp.manytomany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.covalense.emp.dto.EmployeeInfoBean;

import lombok.Data;

@Data
@Entity
@Table(name = "training_info")
public class TrainingInfoBean implements Serializable{
	
	@Id
	@Column(name = "Course_ID")
	private int courseid ;
	@Column(name = "Course_name")
	private String course_name;
	@Column(name = "Duration")
	private int duration;
	@Column(name = "Course_Type")
	private String course_type;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_training" ,
				joinColumns = {@JoinColumn(name="Course_ID")},
				inverseJoinColumns = {@JoinColumn(name = "id")})
	List<EmployeeInfoBean> lstInfoBean;
}//End of class
