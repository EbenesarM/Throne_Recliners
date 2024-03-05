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

import com.throne.main.Model.QE;
import com.throne.main.Repository.QErepository;

@RestController
@RequestMapping("/api/throne")
public class QEcontroller {

    @Autowired
    private QErepository api;

    @PostMapping("/SaveEnquiries")
    public QE createQE(@RequestBody QE qemodel) {
        // Save the inquiry using the repository
        return api.save(qemodel);
    }

    @GetMapping("/GetAllEnquiries")
    public List<QE> findAllQE() {
        // Retrieve all inquiries from the repository
        return api.findAll();
    }
    
    @CrossOrigin("*")
    @GetMapping("/GetByIdEnquiries/{id}")
    public List<QE> GetById(@PathVariable int reid) throws NotFoundException 
    {
    	QE qemodelid = api.findById(reid).orElse(null);
        if (qemodelid != null) 
        {
            List<QE>QEList = new ArrayList<>();
            QEList.add(qemodelid);
            return QEList;
        } 
        else 
        {
            throw new NotFoundException();
        }
    }
}