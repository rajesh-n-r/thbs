package com.th.mainpack;

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
		File file2 = new File("C:\\\\Users\\\\user676\\\\Files\\\\myfile6.txt");
		
		
		try(FileInputStream  input = new FileInputStream(file1);
		BufferedInputStream bis = new BufferedInputStream(input);
		
		FileOutputStream output = new FileOutputStream(file2);
		BufferedOutputStream bos = new BufferedOutputStream(output);)
		{
			
// to get file size of myfile.txt  :  take the FileInputStream  object(input) and use the available method
			byte[]  barray = new byte[input.available()];
			bis.read(barray); // ----->  read all data from file1 to barray
			bos.write(barray);
			
			System.out.println("File written successfully!!!!");
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
