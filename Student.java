package sample;

import java.util.Scanner;

public class Student {
	Scanner sc=new Scanner(System.in);
	String name;
	int id;
	float marks;
public void Name() {

	System.out.println("Enter the Student name:");
	name=sc.next();
	
}
public void Studentid() {
	
	System.out.println("Enter the Student id:");
	id=sc.nextInt();
	
}
public void marks() {
	
	System.out.println("Enter the Student id:");
	marks=sc.nextFloat();
	
}
public static void main(String[]args) {
	Student s=new Student();
	s.Name();
	s.Studentid();
	s.marks();
	System.out.println("The student name was:"+s.name);
	System.out.println("The Student id was:"+s.id);
	System.out.println("The Student id was:"+s.marks);
}

}
