package com.throne.main.Repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.throne.main.Model.Upholstery;

public interface UpholsteryRepository extends JpaRepository<Upholstery , Integer> 

{
 List<Upholstery> findByCategory(String category);
}
