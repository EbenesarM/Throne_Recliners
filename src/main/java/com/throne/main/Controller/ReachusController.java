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


import com.throne.main.Model.Reachus;

import com.throne.main.Repository.ReachusRepository;

@RestController
@RequestMapping("/api/throne/Reachus")
public class ReachusController 

{

    @Autowired
    private ReachusRepository api;

    @PostMapping("/SaveReachus")
    public Reachus createReachus(@RequestBody Reachus reachus) {
        // Save the reachus using the repository
        return api.save(reachus);
    }

    @GetMapping("/GetAllReachus")
    public List<Reachus> findAllReachus() {
        // Retrieve all reachus from the repository
        return api.findAll();
    }
    
    @CrossOrigin("*")
    @GetMapping("/GetByIdReachus/{reid}")
    public List<Reachus> GetById(@PathVariable int id) throws NotFoundException 
    {
    	Reachus reachid  = api.findById(id).orElse(null);
        if (reachid  != null) 
        {
            List<Reachus>ReachusList = new ArrayList<>();
            ReachusList.add(reachid );
            return ReachusList;
        } 
        else 
        {
            throw new NotFoundException();
        }
    }
	
	
}
