package com.covalense.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.covalense.springboot.dto.EmployeeInfoBean;
import com.covalense.springboot.dto.EmployeeOtherInfoBean;

public interface EmployeeRepository extends CrudRepository<EmployeeInfoBean, Integer> {
	
	@Query("Select e from EmployeeOtherInfoBean e where e.infobean=:id")
	public EmployeeOtherInfoBean findByID(@Param("id") EmployeeInfoBean id);

}//End of interface