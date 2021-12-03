package com.th.Mainpack;

import java.util.ArrayList;
import java.util.Scanner;

import com.th.Model.Book;
import com.th.bookdao.BookOperationsImpl;
//import com.th.model.Book;
 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         Scanner sc = new Scanner(System.in);

         BookOperationsImpl  bop = new BookOperationsImpl();
         while(true)
          {
              System.out.println("1.Display all books in the  BookStore ");
            /*  System.out.println("2.  Add a Department  detail in db");
              System.out.println("3. Retrive department using department_id");
              System.out.println("4. Retrive department using department_name");
              System.out.println("5. Update manager_id for a department using department_id");*/
              System.out.println("6. Exit");

              System.out.println("Enter your choice");
              int choice = sc.nextInt();              

              switch(choice)
              {
              case 1:    

                     ArrayList<Book> blist = bop.getAllBooks();
                     for (Book b:blist)
                     {
                         System.out.println(b);
                     }


                     break;


            /*  case 1:System.out.println("Enter department id");
                      int dId = sc.nextInt();
                     System.out.println("Enter department name");
                      String dName=sc.next();
                      System.out.println("Enter   Manager Id");
                      int mId=sc.nextInt();    
                      System.out.println("Enter  Location Id");
                      int lId = sc.nextInt();
                      Department d1 = new Department(dId,dName,mId,lId);
                      System.out.println(dop.addADepartment(d1));

                      break;

              case 3:
                  System.out.println("Enter department id to be retived");
                  int rdId = sc.nextInt();

                  Department d = dop.getADepartment(rdId);
                  System.out.println(d);

                    break;
              case 4:
                  System.out.println("Enter department name to be retived");
                  String rdname = sc.next();

                  Department d2 = dop.getADepartmentbyName(rdname);
                  System.out.println(d2);

                    break;   

              case 5:
                          System.out.println("Enter manager_id to be updated");
                          int umId = sc.nextInt();
                          System.out.println("Enter Department_id to be updated");
                          int udId = sc.nextInt(); 

                          System.out.println(dop.setManagerId(udId, umId));

                            break;  */  


              default:
                      sc.close();
                      bop.closeConnection();
                      System.out.println("Bye Bye ..... ");
                      System.exit(0);


              }// switch case


          }// while loop
    }
}