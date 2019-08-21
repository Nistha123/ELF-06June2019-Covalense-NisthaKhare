package com.covalense.librarymanagementsystem.beans;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;


@JsonRootName("employee-response")
public class LibraryResponse implements Serializable{

private int statusCode;
	
	private String message;
	
	private String description;
	
	private List<UserInfoBean> lstInfoBean;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<UserInfoBean> getLstInfoBean() {
		return lstInfoBean;
	}

	public void setLstInfoBean(List<UserInfoBean> lstInfoBean) {
		this.lstInfoBean = lstInfoBean;
	}
	
	
}//End of LibraryResponse
