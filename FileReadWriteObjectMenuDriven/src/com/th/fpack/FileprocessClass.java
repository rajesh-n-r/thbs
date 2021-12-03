package com.th.fpack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.th.spack.Student;

public class FileprocessClass {
	File file1 = new File("C:\\\\Users\\\\user676\\\\Files\\\\student1.dat");
	
	public String WriteObject(int id,String name,int marks)
	{
				 
		try( FileOutputStream output = new FileOutputStream(file1,true); // append mode 
		 ObjectOutputStream out = new ObjectOutputStream(output);)		
		{
			Student s = new Student(id,name,marks);
			out.writeObject(s);			
			out.reset();
		     return("Students record written successfully!!!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return e.getMessage();
		} 
		
	}
	
	
	public void ReadObjects()
	{
		// File file1 = new File("C:\\Users\\Admin\\Desktop\\student1.dat");
				 
				try( 
							 
				 FileInputStream input = new FileInputStream(file1);
				 ObjectInputStream in = new ObjectInputStream(input);)
				{										
					while((input.available())>0)
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
