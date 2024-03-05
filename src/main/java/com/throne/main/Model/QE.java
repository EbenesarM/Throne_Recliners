package com.throne.main.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "enquiry")
public class QE
{
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    
	    @Column(name = "full_name")
	    private String fullName;
	    
	    @Column(name = "email")
	    private String email;

	    @Column(name = "phone_number")
	    private String phoneNumber;
	    
	    @Column(name = "location")
	    private String location;
	    
	    @Column(name = "product_name")
	    private String productName;
	    
	    @Column(name = "product_category")
	    private String productCategory;

	    @Column(name = "more_details")
	    private String moreDetails;

	    
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductCategory() {
			return productCategory;
		}

		public void setProductCategory(String productCategory) {
			this.productCategory = productCategory;
		}

		public String getMoreDetails() {
			return moreDetails;
		}

		public void setMoreDetails(String moreDetails) {
			this.moreDetails = moreDetails;
		}

	    
	    
	   
}