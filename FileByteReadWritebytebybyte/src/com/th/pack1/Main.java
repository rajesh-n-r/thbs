package com.th.pack1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		File file1 = new File("C:\\\\Users\\\\user676\\\\Files\\\\myfile.txt");	
		File file2 = new File("C:\\\\Users\\\\user676\\\\Files\\\\myfile.txt");
		
		
		try(FileInputStream  input = new FileInputStream(file1);
		BufferedInputStream bis = new BufferedInputStream(input);
		
		FileOutputStream output = new FileOutputStream(file2);
		BufferedOutputStream bos = new BufferedOutputStream(output);)
		{
			int c;
			while((c=bis.read())!=-1) // EOF condition for byte files 
					{	
				       bos.write(c);
				       System.out.print((char)c);
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
