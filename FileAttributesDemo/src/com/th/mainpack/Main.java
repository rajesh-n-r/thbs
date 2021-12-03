package com.th.mainpack;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		// file1 is logical name given to physical file  C:\\Users\\Admin\\Desktop\\file1th.txt
		File file1 = new File("C:\\\\Users\\\\user676\\\\Files\\\\myfile3.txt");
		
		try {
			file1.createNewFile();
			System.out.println("File created successfully!!! : myfile3.txt ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The absolute path: "+file1.getAbsolutePath());
		System.out.println("The name of the file: "+file1.getName());
		System.out.println("The Parent of the file:"+file1.getParent());
		
		File file2 = new File("C:\\Users\\user676\\Files\\myfile4.txt");  // this only ref created
		// file gets created only by using createNewFile()
		
		try {
			file2.createNewFile();
			System.out.println("File created successfully!!! : myfile4.txt ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File dir = new File("C:\\Users\\user676\\Files");
		
		File[] filelist = dir.listFiles();
		
		for (File f:filelist)
		{
			if (f.isFile())
				System.out.println("Filename:  "+f.getName());
		}
		
		

	}

}
