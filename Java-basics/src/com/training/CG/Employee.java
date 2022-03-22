package com.training.CG;

import java.util.HashMap;

public class Employee {
	 String empId;
	 String empName;
     String empDept;
    String empSalary;
    Employee(){
    	System.out.println("constructor called");
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
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	public HashMap calculate() {
		// TODO Auto-generated method stub
		return null;
	}

}