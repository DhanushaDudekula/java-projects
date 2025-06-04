package hello;
import java.util.*;
class ArrayList1{
	public void ArrayList() {
		System.out.println("LIST OF STUDENTS");
	}
}
class LinekdList extends ArrayList{
	public void LinkedList() {
		System.out.println("LIST OF STUDENTS");
	}
}
class HashSet extends ArrayList{
	public void HashSet() {
		System.out.println("LIST OF STUDENTS");
	}
}
class HashMap extends ArrayList{
	public void HaahMap() {
		System.out.println("LIST OF STUDENTS");
	}
}

public class AllList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> student=new ArrayList<>();
		student.add("hi");
		student.add("hello");
		System.out.println(student);
		LinkedList<String> students=new LinkedList<>();
		students.add("hee");
		students.add("kee");
		System.out.println(students);
	}

}