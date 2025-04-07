package Student_Managment_System;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setDetails("Prajwal", 23);
		student.setStudentDetails(04, "FSD");		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Name : ");
		String name=scanner.nextLine();
		System.out.println("Enter A Age : ");
		int age=scanner.nextInt();
		System.out.println("Enter Student Id : ");
		int studid=scanner.nextInt();
		System.out.println("Enter Cource Name : ");
		String cource= scanner.next();
		
		Student student2=new Student();
		student2.setDetails(name, age);
		student2.setStudentDetails(studid, cource);
		
		student.showStudentDetails();
		student2.showStudentDetails();
		
	}
}
