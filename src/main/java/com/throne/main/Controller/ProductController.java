package com.throne.main.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.throne.main.Model.Product;
import com.throne.main.Repository.ProductRepository;



@RestController
@RequestMapping("/api/throne")
public class ProductController 

{

	 @Autowired
		private ProductRepository api;
	    
	    @CrossOrigin("*")
	    @GetMapping("/getAllProducts")
	    public List<Product> ProductMethod() throws NotFoundException
	    {
	    	
	    	List<Product> productmodel = api.findAll();
	        
	    	if(productmodel.size()==0)
	    	{
	    		throw new NotFoundException();
	    	}
	    	else
	    	{
	    		
	    		return productmodel;
	    	}
	    }
	    
	    @CrossOrigin("*")
	    @GetMapping("/getByCategory/{category}")
	   public List<Product> GetByCategory(@PathVariable String category ) throws NotFoundException
	    {
	    	
	    	List<Product> pmodel = api.findByCategory(category) != null ? api.findByCategory(category) :null;
	    	
	    	if(pmodel.size()==0)
	    	{
	    		
	    		throw new NotFoundException();
	    	
	    	}
	    	
	    	else
	    		
	    	{
	    		
	    	   return pmodel;
	    	}
	    	}
	    
	    @CrossOrigin("*")
	    @GetMapping("/getById/{id}")
	    public List<Product> GetById(@PathVariable int id) throws NotFoundException {
	        Product productidmodel = api.findById(id).orElse(null);
	        if (productidmodel != null) {
	            List<Product> productList = new ArrayList<>();
	            productList.add(productidmodel);
	            return productList;
	        } else {
	            throw new NotFoundException();
	        }
	    }


}