package com.th;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
* Hello world!
*
*/
public class App
{
/**
* @param args
*/
public static void main( String[] args )
{
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
context.scan("com.th");
context.refresh();

Student student = (Student) context.getBean("student");
student.setRegno(1001);
student.setName("Rajesh");
Chair chair = student.getChair();
chair.setType("raj");
chair.setColour("Black");

Address address=student.getAddress();
address.setDoorNo("1002");
address.setStreet("dm");
address.setCity("bangalore");
address.setState("karnataka");
address.setPin("560030");


System.out.println(student.getChair().getType());
System.out.println(student.getChair());
System.out.println(student);
System.out.println("____________------------------");
System.out.println(student.getRegno());
System.out.println(student.getName());
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
// System.out.println(student.getAddress());

}
}