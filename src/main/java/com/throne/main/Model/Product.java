package com.throne.main.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Products")
public class Product 

{
 

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int product_id;
		
		@Column
		private String Product_title;
		
		@Column
		private String category;
		
		@Column
		private String Product_image;
		
		@Column
		private String Product_description;

		public int getProduct_id() {
			return product_id;
		}

		public void setProduct_id(int product_id) {
			this.product_id = product_id;
		}

		public String getProduct_title() {
			return Product_title;
		}

		public void setProduct_title(String product_title) {
			Product_title = product_title;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getProduct_image() {
			return Product_image;
		}

		public void setProduct_image(String product_image) {
			Product_image = product_image;
		}

		public String getProduct_description() {
			return Product_description;
		}

		public void setProduct_description(String product_description) {
			Product_description = product_description;
		}

		 
}
