package com.th.mainpack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {		
		File file2 = new File("C:\\\\Users\\\\user676\\\\Files\\\\myfile2.txt");		
		try(InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			FileWriter fw = new FileWriter(file2);	
				BufferedWriter bw = new BufferedWriter(fw);
				)
		{
			System.out.println("Enter your inputs:");
			String str = br.readLine();
			while(!(str.equalsIgnoreCase("END")))
			{
				System.out.println(str);
				bw.write(str);
				bw.newLine();
				str=br.readLine();
			}
			System.out.println("All data added successfully!!!");
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
