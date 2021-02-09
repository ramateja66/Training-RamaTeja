package com.springwithhibernate;

public interface EmployeeDao
{
	String insertEmployee(EmployeeBean emp);
	EmployeeBean searchEmployee(int eid);
	String updateEmployee(EmployeeBean emp);
	String deleteEmployee(int eid);

}
