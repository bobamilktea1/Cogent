package com.cogent.Batch65_SpringBootTwo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.Batch65_SpringBootTwo.entity.Performer;
import com.cogent.Batch65_SpringBootTwo.repo.PerformerRespository;

@RestController
public class PerformerController {

	@Autowired
	PerformerRespository performerRespository;
	
	@PostMapping("addpfm")
	public Performer addpfm(@RequestBody Performer newPerformer) {
		System.out.println("Adding record to database");
	    return performerRespository.save(newPerformer);
	}
	
	@GetMapping("getpfm")
	public List<Performer> getPerformer() {
		System.out.println("Getting record to database");
		return performerRespository.findAll();
			}
	
	@DeleteMapping
	
		public void deletePerformer(@PathVariable int id) {			
			System.out.println("Deleting record to database");
			performerRespository.deleteById(id);
	}
}
