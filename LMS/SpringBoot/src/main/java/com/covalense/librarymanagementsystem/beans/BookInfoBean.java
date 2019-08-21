package com.covalense.librarymanagementsystem.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Book_Info")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@JsonRootName(value = "Book-info")
public class BookInfoBean implements Serializable {
	
	@Id
	@JsonProperty(value = "bookId")
	@Column(name="bookId")
	private Integer bookId;
	
	@JsonProperty(value = "title")
	@Column(name="title")
	private String Book_Title;
	
	@JsonProperty(value = "category")
	@Column(name="Category")
	private String category;
	
	@JsonProperty(value = "price")
	@Column(name="price")
	private Double price;
	
	@JsonProperty(value = "quantity")
	@Column(name="quantity")
	private Integer bookQuantity;
	
	@JsonProperty(value = "availablebooks")
	@Column(name="availablebooks")
	private Integer noOfAvailablebooks;
	
	@JsonProperty(value = "Issuedbooks")
	@Column(name="Issuedbooks")
	private Integer noOfIssuedbooks;
	
	@JsonProperty(value = "Status")
	@Column(name="Status")
	private String status;
	
	@JsonProperty(value = "author")
	@Column(name="author")
	private String author;
	
	@JsonProperty(value = "publisher")
	@Column(name="publisher")
	private String publisher;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBook_Title() {
		return Book_Title;
	}

	public void setBook_Title(String book_Title) {
		Book_Title = book_Title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getBookQuantity() {
		return bookQuantity;
	}

	public void setBookQuantity(Integer bookQuantity) {
		this.bookQuantity = bookQuantity;
	}

	public Integer getNoOfAvailablebooks() {
		return noOfAvailablebooks;
	}

	public void setNoOfAvailablebooks(Integer noOfAvailablebooks) {
		this.noOfAvailablebooks = noOfAvailablebooks;
	}

	public Integer getNoOfIssuedbooks() {
		return noOfIssuedbooks;
	}

	public void setNoOfIssuedbooks(Integer noOfIssuedbooks) {
		this.noOfIssuedbooks = noOfIssuedbooks;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	

}//End of BookInfoBean
