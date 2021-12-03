package com.th.foppack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 

import com.th.ppack.Product;
 
public class FileOperationClass {    

    public static String WriteRec(int pId,String pName,int pPrice)
    {
        Product product = new Product(pId,pName,pPrice);
        String pstr = product.getpId()+":"+product.getpName()+":"+product.getpPrice();

        try(FileWriter output = new FileWriter("C:\\Users\\rajesh_ravindrareddy\\eclipse_file\\myproduct.txt",true);
            BufferedWriter bw = new BufferedWriter(output);    )
        {            
            bw.write(pstr);
            bw.newLine();
            return("Record added succssfully!!!");            

        } catch (IOException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            return(e.getMessage());
        }    

    }


    public static void ReadRecords()
    {
        try(FileReader input = new FileReader("C:\\Users\\rajesh_ravindrareddy\\eclipse_file\\myproduct.txt");
             BufferedReader br = new BufferedReader(input);    )
        {
            String str;
            while((str=br.readLine())!=null)
            {
                // 10:books:300
                //slist[0] = 10, slist[1]=books  slist[2] = 300
                // substring
                String[] slist= str.split(":");
                int pId = Integer.parseInt(slist[0]);
                String pName=slist[1];
                int pPrice = Integer.parseInt(slist[2]);
                Product product = new Product(pId,pName,pPrice);
                System.out.println(product);

            }


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


 
}
