package com.hcl.model;
import java.util.Date;

public class Employee {
	String empId;
	String empName;
	String swipeIn;
	String swipeOut;
	Date createDate;
	String locationName;
	public Employee() {}
	public Employee(String empId, String empName, String swipeIn, String swipeOut, Date createDate, String locationName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.swipeIn = swipeIn;
		this.swipeOut = swipeOut;
		this.createDate = createDate;
		this.locationName = locationName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getSwipeIn() {
		return swipeIn;
	}
	public void setSwipeIn(String swipeIn) {
		this.swipeIn = swipeIn;
	}
	public String getSwipeOut() {
		return swipeOut;
	}
	public void setSwipeOut(String swipeOut) {
		this.swipeOut = swipeOut;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

}
