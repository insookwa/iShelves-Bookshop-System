/**
 * modal class for handling books 
 */
package com.niktec.ishealves.books;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
public class Books {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY  )
	private int id;
	private String title;
	private String authour;
	private String category;
	private String details;
	private String award;
	private int price;
	
	@Lob
	private MultipartFile data;
	
	public Books() {

	}


	public Books(String title, String authour, String category, String details, String award, int price, MultipartFile data) {
		super();
		this.title = title;
		this.authour = authour;
		this.category = category;
		this.details = details;
		this.award = award;
		this.price = price;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthour() {
		return authour;
	}

	public void setAuthour(String authour) {
		this.authour = authour;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getAward() {
		return award;
	}

	public void setAward(String award) {
		this.award = award;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public MultipartFile getData() {
		return data;
	}

	public void setData(MultipartFile data) {
		this.data = data;
	}
	
	
	
	
	
	
	
	

}
