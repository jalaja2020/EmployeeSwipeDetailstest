package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.model.Employee;
import com.hcl.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	 @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	    public List<Employee> getAllEmployees(Model model)
	    {
		 
	        return empService.getAllEmployee();
	    }
	 
	 @RequestMapping(value = "/getAllEmployees/admin/{id}", method = RequestMethod.GET)
	    public List<Employee> getAdminEmployeeById(@RequestParam String id)
	    {
	        return empService.getEmployeeById(id,"admin");
	    }
	 
	 @RequestMapping(value = "/getAllEmployees/admin/location/{location}", method = RequestMethod.GET)
	    public List<Employee> getUserEmployeeByLocation(@RequestParam String location)
	    {
	      return empService.getEmployeeByLocation(location,"admin");
	    }
	 
	 @RequestMapping(value = "/getAllEmployees/admin/date/{date}", method = RequestMethod.GET)
	    public List<Employee> getUserEmployeeByDate(@RequestParam String date)
	    {
	      return empService.getEmployeeById(date,"admin");
	    }
}
