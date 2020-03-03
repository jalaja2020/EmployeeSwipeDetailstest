package com.hcl.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hcl.model.Employee;

public class EmployeeDAOImpl  {

	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
        
		Employee emp = new Employee();
		emp.setEmpId("101");
		emp.setEmpName("test");
		emp.setLocationName("hyd");
		emp.setSwipeIn("10AM");
		emp.setSwipeOut("5pM");
		emp.setCreateDate(new Date());
		employees.add(emp);
		
		Employee emp1 = new Employee();
		emp1.setEmpId("102");
		emp1.setEmpName("test1");
		emp1.setLocationName("hyd1");
		emp1.setSwipeIn("11AM");
		emp1.setSwipeOut("5pM");
		emp1.setCreateDate(new Date());
		employees.add(emp1);
		
		return employees;
	}
	public List<Employee> getAdminEmployeeById(String id) {
		List<Employee> employees = getAllEmployees();
		List<Employee> employeeById = new ArrayList<Employee>();
		for(Employee emp : employees) {
			if(id.equalsIgnoreCase(emp.getEmpId())) {
				 employeeById.add(emp);
			}
		}
		return employeeById;
	}
	public List<Employee> getAdminEmployeeByLocation(String location) {
		List<Employee> employees = getAllEmployees();
		List<Employee> employeeByLoc = new ArrayList<Employee>();
		for(Employee emp : employees) {
			if(location.equalsIgnoreCase(emp.getLocationName())) {
				employeeByLoc.add(emp);
			}
		}
		return employeeByLoc;
	}
	public List<Employee> getAdminEmployeeByDate(String date) {
		 SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		 Date date1;
			List<Employee> employees = getAllEmployees();
			List<Employee> employeeByLoc = new ArrayList<Employee>();
		try {
			date1 = formatter.parse(date);
		
		for(Employee emp : employees) {
			if(date1.equals(emp.getCreateDate())) {
				employeeByLoc.add(emp);
			}
		}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeeByLoc;
		
	}
	

}
