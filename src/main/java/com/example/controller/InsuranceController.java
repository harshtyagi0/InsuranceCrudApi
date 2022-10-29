package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.InsurancePlan;
import com.example.service.InsuranceService;
 
@RestController
@RequestMapping("/InsurancePlan")
public class InsuranceController {

	@Autowired
	private InsuranceService service;
	
	//For Adding Plan
	@PostMapping("/addd")
	public String add(@RequestBody InsurancePlan ip) {
		return service.add(ip);
}
	
	//For Fetching plans
	@GetMapping("/view")
	public List<InsurancePlan> view(){
		return service.view();
	}
	
	//For Updating in plan
	@PutMapping("/updatte")
	public String update(@RequestBody InsurancePlan ip) {
		return service.update(ip);
	}
	
	//For Deleting the Plan
	@DeleteMapping("/remove/{id}")
    public String delete(@PathVariable("id") int id) {
	return service.delete(id);
	}
}
