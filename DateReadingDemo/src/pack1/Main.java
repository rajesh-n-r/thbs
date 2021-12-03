package pack1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter person details:");
		int id= sc.nextInt();
		String d = sc.next();
		
		DateFormat  df = new SimpleDateFormat("dd/MM/yyyy");
		Date dob = df.parse(d);
		Person p = new Person(id,dob);
		System.out.println(p);
		sc.close();
		
		
		
		

	}

}
