package com.throne.main.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.throne.main.Model.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> 
{
   List<Product> findByCategory(String category);
}

