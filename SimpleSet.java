package hello;
import java.util.LinkedHashSet;
public class SimpleSet {
	public static void main(String[] args) {
		LinkedHashSet<String> items=new LinkedHashSet<>();
		items.add("Dhanu");
		items.add("Aari");
		items.add("Baasi");
		items.add("Dhanu");
		System.out.println(items);
	}
}

