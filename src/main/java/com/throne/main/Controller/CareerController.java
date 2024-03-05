package com.throne.main.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.throne.main.Model.Career;
import com.throne.main.Repository.CareerRepository;


@RestController
@RequestMapping("/api/throne")
public class CareerController 

{

	 @Autowired
	    private CareerRepository api;

	    @PostMapping("/SaveCareer")
	    public Career createCareer(@RequestBody Career career) 
	    {
	        // Save the inquiry using the repository
	        return api.save(career);
	    }

	    @GetMapping("/GetAllCareer")
	    public List<Career> findAllCareer() {
	        // Retrieve all inquiries from the repository
	        return api.findAll();
	    }
	    
	    @CrossOrigin("*")
	    @GetMapping("/GetByIdCareer/{id}")
	    public List<Career> GetByIdCareer(@PathVariable int id) throws NotFoundException 
	    {
	    	Career careerid = api.findById(id).orElse(null);
	        if (careerid != null) 
	        {
	            List<Career>CareerList = new ArrayList<>();
	            CareerList.add(careerid);
	            return CareerList;
	        } 
	        else 
	        {
	            throw new NotFoundException();
	        }
	    }
	}
