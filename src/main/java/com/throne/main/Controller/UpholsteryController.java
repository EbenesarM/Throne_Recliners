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

import com.throne.main.Model.Upholstery;
import com.throne.main.Repository.UpholsteryRepository;

@RestController
@RequestMapping("/api/throne/Upholstery")
public class UpholsteryController
      {

		 @Autowired
		    private UpholsteryRepository api;

		    @PostMapping("/SaveUpholstery")
		    public Upholstery createUpholstery(@RequestBody Upholstery upholstery) 
		    {
		        // Save the inquiry using the repository
		        return api.save(upholstery);
		    }

	
	@CrossOrigin("*")
	@GetMapping("/GetAllUpholsteries")
	
	public List<Upholstery> getallup() throws NotFoundException
	{
		
		 List<Upholstery> upholstery = api.findAll();
		 if(upholstery.size() == 0)
		 {
			  
			 throw new NotFoundException();
			 
		 }
		 else
		 {
			 return upholstery;
		 }
		
	}
	
	 @CrossOrigin("*")
	    @GetMapping("/getByCategory/{upholsterycat}")
	   public List<Upholstery> upgetmethod(@PathVariable String upholsterycat ) throws NotFoundException
	    {
	    	
	    	List<Upholstery> upholstery = api.findByCategory(upholsterycat) != null ? api.findByCategory(upholsterycat) :null;
	    	
	    	if(upholstery.size()==0)
	    	{
	    		
	    		throw new NotFoundException();
	    	
	    	}
	    	
	    	else
	    		
	    	{
	    		
	    	   return upholstery;
	    	}
	    	}
	 
	  @CrossOrigin("*")
	    @GetMapping("/getById/{upid}")
	    public List<Upholstery> GetByIdup(@PathVariable int upid) throws NotFoundException
	  {
		  Upholstery upholsteryid = api.findById(upid).orElse(null);
	        if (upholsteryid != null) {
	            List< Upholstery >  upholsteryList = new ArrayList<>();
	            upholsteryList.add(upholsteryid);
	            return  upholsteryList;
	        } 
	        else
	        {
	            throw new NotFoundException();
	        }
	    }

}
