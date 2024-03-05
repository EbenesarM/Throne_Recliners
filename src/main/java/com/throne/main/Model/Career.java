package com.throne.main.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Career")
public class Career
{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="ID")
   private int id;
   
   @Column
   private String Name;
   
   @Column
   private String Email;
   
   @Column
   private String City;
   
   @Column
   private String Role;

   
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public String getCity() {
	return City;
}

public void setCity(String city) {
	City = city;
}

public String getRole() {
	return Role;
}

public void setRole(String role) {
	Role = role;
}
   
   
}
