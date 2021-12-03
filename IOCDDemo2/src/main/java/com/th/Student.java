package com.th;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component("student") //to recognise in main and we'll create obj using this i think
public class Student {



private int regno;
private String name;
private Chair chair;
private Address address;



public Student() {
super();
}



// public Student(Chair chair) {
// super();
// this.chair = chair;
// }



public int getRegno() {
return regno;
}



public void setRegno(int regno) {
this.regno = regno;
}



public String getName() {
return name;
}



public void setName(String name) {
this.name = name;
}



public Chair getChair() {
return chair;
}



@Autowired
public void setChair(Chair chair) {
this.chair = chair;
}




public Address getAddress() {
return address;
}



@Autowired
public void setAddress(Address address) {
this.address = address;
}



@Override
public String toString() {
return "Student [regno=" + regno + ", name=" + name + ", chair=" + chair + ", address=" + address + "]";
}








}