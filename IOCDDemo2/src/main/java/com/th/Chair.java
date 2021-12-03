package com.th;



import org.springframework.stereotype.Component;



@Component("chair")
public class Chair {



String type;
String colour;

public Chair() {
super();
}



public String getType() {
return type;
}



public void setType(String type) {
this.type = type;
}



public String getColour() {
return colour;
}



public void setColour(String colour) {
this.colour = colour;
}



@Override
public String toString() {
return "Chair [type=" + type + ", colour=" + colour + "]";
}



}