package com.th.mainpack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.th.spack.Student;

public class Main {

	public static void main(String[] args) {
		
		// Lets learn Serialization 
		 File file1 = new File("C:\\\\Users\\\\user676\\\\Files\\student.dat");
		 
		try( FileOutputStream output = new FileOutputStream(file1);
		 ObjectOutputStream out = new ObjectOutputStream(output);
		 
		 FileInputStream input = new FileInputStream(file1);
		 ObjectInputStream in = new ObjectInputStream(input);)
		{
			Student s1 = new Student(10,"Dheerendra",80);
			out.writeObject(s1);
			Student s2 = new Student(20,"Rachana",80);
			out.writeObject(s2);
			System.out.println("Students records written into the file");
			// Deserialization
			// 1. no new object is created 
			// 2. to read all the objects from the file we can use availiable() method 
			// 3. FileInputStream object gets you the total size of the file using availiable()
			
			while(input.available()>0)
			{
				Student s=(Student)in.readObject();
				System.out.println(s);
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
