package com.th.pack1;
 
public class Test {

    public static <T>  void printArray(T[] arr)
    {
        for (T ele:arr)
        {
            System.out.print(ele+"  ");
        }
    }
 
}