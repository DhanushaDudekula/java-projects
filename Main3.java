package dhanu;

import java.util.TreeSet;
public class Main3{
	public static void main(String[] args) {
		TreeSet<Integer> booksIds=new TreeSet<>();
		booksIds.add(5002);
		booksIds.add(4008);
		booksIds.add(5005);
		booksIds.add(4999);
		booksIds.add(5001);
		System.out.println("First book Id:"+booksIds.first());
		System.out.println("Last book Id:"+booksIds.last());
		System.out.println(" book Id higher  than 4999:"+booksIds.higher(4999));
		System.out.println("book Id lower than 5005:"+booksIds.lower(5005));
		
	}

}
