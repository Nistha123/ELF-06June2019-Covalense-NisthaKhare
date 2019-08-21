package com.covalense.librarymanagementsystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.covalense.librarymanagementsystem.beans.UserInfoBean;

public interface UserRepository extends CrudRepository<UserInfoBean, Integer> {
	
	/*
	 * @Query("Select e from EmployeeOtherInfoBean e where e.infobean=:id") public
	 * EmployeeOtherInfoBean findByID(@Param("id") EmployeeInfoBean id);
	 */

}//End of interface