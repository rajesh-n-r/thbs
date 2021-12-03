package com.th;

import java.util.List;

public interface CRUDOperations {

	void insert (Employee employee);
	List<Employee> selectAll();
	
}
