package com.throne.main.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Upholstery")
public class Upholstery 

{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column
	private String category;
	
	@Column
	private String title;
	
	@Column
	private String image;

	
	public int getId()
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getCategory() 
	{
		return category;
	}

	public void setCategory(String category) 
	{
		this.category = category;
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getImage()
	{
		return image;
	}

	public void setImage(String image)
	{
		this.image = image;
	}
	
	
	

}
