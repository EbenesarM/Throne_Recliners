package com.throne.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.throne.main.Model.Category;
import com.throne.main.Repository.CatergoryRepository;

@RestController
@RequestMapping("api/throne")
public class CategoryController

{
    @Autowired
	private CatergoryRepository api;
    
    @CrossOrigin("*")
    @GetMapping("/getallcategories")
    public List<Category> CategoryMethod() throws NotFoundException
    {
    	
    	List<Category> catmodel = api.findAll();
        
    	if(catmodel.size()==0)
    	{
    		throw new NotFoundException();
    	}
    	else
    	{
    		
    		return catmodel;
    	}
    }
    
}
