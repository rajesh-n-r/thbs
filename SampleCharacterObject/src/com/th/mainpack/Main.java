package com.th.mainpack;

import java.util.Scanner;
import com.th.foppack.FileOperationClass;
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);            
            while(true)
              {
                  System.out.println("1. Add product in the file ");
                  System.out.println("2. Display all products from the file");
                  System.out.println("3. Exit");

                  System.out.println("Enter your choice");
                  int choice = sc.nextInt();              

                  switch(choice)
                  {
                  case 1:System.out.println("Enter product id");
                          int pId = sc.nextInt();
                         System.out.println("Enter product name");
                          String pName=sc.next();
                          System.out.println("Enter product price");
                          int pPrice=sc.nextInt();                          
                           System.out.println(FileOperationClass.WriteRec(pId, pName, pPrice));                          
                          break;
                  case 2:                      
                         FileOperationClass.ReadRecords();    
                         break;

                  default:
                          sc.close();
                          System.out.println("Bye Bye ..... ");
                          System.exit(0);


                  }// switch case


              }// while loop
 

    }// main method
 
}// Main class