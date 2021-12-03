package com.th;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDAO implements CRUDOperations {

	private JdbcTemplate jdbcTemplate;
	
	
	
	public EmployeeDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}


	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}




	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}




	public void insert(Employee employee) {
		
		if (employee != null)
		{
			jdbcTemplate.update
						 ("insert into employees value(?,?,?)", new Object[] 
								 {employee.getEmp_id(), employee.getEmp_name(), employee.getSalary()}
						 );
		}
		
	}




	public List<Employee> selectAll() {
		
		return jdbcTemplate.query("select * from employees",
								new RowMapper<Employee>()
								{

									@Override
									public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
										Employee employee = new Employee();
										employee.setEmp_id(rs.getInt(1));
										employee.setEmp_name(rs.getString(2));
										employee.setSalary(rs.getInt(3));
										
										return employee;
										
									}
								
								});

	}




	public ArrayList<Employee> selectAll1() {
		// TODO Auto-generated method stub
		return null;
	}
}
