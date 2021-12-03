package com.th;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        
        EmployeeDAO employeedao = (EmployeeDAO) context.getBean("employeedao");
        
/*        Employee employee = new Employee();
        employee.setEmp_id(1004);
        employee.setEmp_name("James Jones");
        employee.setSalary(340000);
        
        employeedao.insert(employee);
        
        System.out.println("Record added successfully");
*/       
        ArrayList<Employee> emplist = (ArrayList<Employee>)employeedao.selectAll();
        System.out.println("Details of all Employees");
        for (Employee e:emplist)
        {
        	System.out.println(e);
        }
        
        context.close(); 
    }
}
