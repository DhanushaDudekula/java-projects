package XYZ;

import java.util.LinkedList;
import java.util.Scanner;

public class studentLinkedList {
	public static void main(String[] args) {
	LinkedList<String>students=new LinkedList<String>();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter names of 5 students:");
	for(int i=1;i<=5;i++) {
		System.out.println("enter the name of students"+i+":");
	    String name=sc.nextLine();
	    students.add(name);
	}
	System.out.println("students more are:");
	for(String student:students) {
		System.out.println(student);
	}
	sc.close();
	}
}



