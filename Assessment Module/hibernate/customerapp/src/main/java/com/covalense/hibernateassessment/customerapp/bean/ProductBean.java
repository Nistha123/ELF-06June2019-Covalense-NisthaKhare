package com.covalense.hibernateassessment.customerapp.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class ProductBean implements Serializable{
	
	@Id
	@Column(name = "pId")
	private int productId;
	@Column(name = "pName")
	private String productName;
	@Column(name = "price")
	private double price;
	@Column(name = "weight")
	private double weight;
	@Column(name = "colour")
	private String colour;
	

}//End of class
