package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.EmployeeDAOImpl;
import com.hcl.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDAOImpl empDao;
	
	public List<Employee> getAllEmployee(){
		return empDao.getAllEmployees();
	}

	public List<Employee> getEmployeeById(String id,String user){
		if(user.equalsIgnoreCase("admin")) {
			
		return empDao.getAdminEmployeeById(id);
		}else {
		return empDao.getAllEmployees();
		}
	}

	public List<Employee> getEmployeeByLocation(String location,String user){
		if(user.equalsIgnoreCase("admin")) {
		return empDao.getAdminEmployeeByLocation( location);
		}else {
		return empDao.getAllEmployees();
		}
	}
	
	public List<Employee> getEmployeeByDate(String date,String user){
		if(user.equalsIgnoreCase("admin")) {
		return empDao.getAdminEmployeeByDate(date);
		}else {
		return empDao.getAllEmployees();
		}
	}
}
