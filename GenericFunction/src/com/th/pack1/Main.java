package com.th.pack1;
 
public class Main {
 
    public static void main(String[] args) {

        Integer[] intarr = {5,4,3,2,1};
        Test.printArray(intarr);
        System.out.println();
        String[] strarr = {"raj","raju","ravi"};
        Test.printArray(strarr);
        System.out.println();
        Item[] iarr = {new Item(10,"Books",300),new Item(20,"Paper",400)};
        Test.printArray(iarr);


 
    }
 
}