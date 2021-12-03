package com.th.pack1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		File file1 = new File("C:\\\\Users\\\\user676\\\\Files\\\\myfile.txt");	
		File file2 = new File("C:\\\\Users\\\\user676\\\\Files\\\\myfile1.txt");
		try(FileReader ir = new FileReader(file1);
			BufferedReader br = new BufferedReader(ir);
			//FileWriter fw = new FileWriter(file2);	 // Rewrite mode 
				FileWriter fw = new FileWriter(file2,true); // append mode 
				BufferedWriter bw = new BufferedWriter(fw);
				)
		{
			String str;
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
				bw.write(str);
				bw.newLine();
			}
			
			System.out.println("file copied successfully!!!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
