package com.throne.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.throne.main.Model.Category;

public interface CatergoryRepository extends JpaRepository <Category, Integer>

{

	
}
