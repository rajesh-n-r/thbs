package com.th.pack1;
 
public class Main {
 
    public static void main(String[] args) {

        Test<String,String> tob = new Test<String, String>("Rajesh", "Reddy");
        System.out.println("Welcome!!!"+tob.getOb1()+"  "+tob.getOb2());

        Test<Integer,String> tob1 = new Test<Integer, String>(100, "Books");
        System.out.println(tob1);

        Test<Integer,Item> tob2 = new Test<Integer, Item>(1000, new Item(1,"Books",300));
        System.out.println(tob2);


    }
 
}