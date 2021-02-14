package com.hibernate;

import java.util.List;

public interface EmployeeDao
{
	String insertEmployee(EmployeeBean emp);
	EmployeeBean searchEmployee(int eid);
	String updateEmployee(EmployeeBean emp);
	String deleteEmployee(int eid);
	List<EmployeeBean> listEmployeees();

}
