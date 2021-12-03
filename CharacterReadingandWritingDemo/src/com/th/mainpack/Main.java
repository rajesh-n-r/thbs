package com.th.mainpack;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// file2 is the destination file -----> myfile
      File file2 = new File("C:\\Users\\user676\\Files\\myfile.txt");
      
      try(InputStreamReader ir = new InputStreamReader(System.in);
        	  BufferedReader br = new BufferedReader(ir);
        	  FileWriter fw = new FileWriter(file2);
        	  BufferedWriter bw = new BufferedWriter(fw);	  
        		  )
          {
        	  
          }
      
         	  
	}
}
