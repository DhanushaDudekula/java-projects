package hello;
import java.util.LinkedHashMap;
public class SimpleMap {
		public static void main(String[] args) {
			LinkedHashMap<Integer,String> items=new LinkedHashMap<>();
			items.put(1,"Dhanu");
			items.put(2,"Aari");
			items.put(3,"Baasi");
			items.put(1,"Dhanu");
			System.out.println(items);
		}
	}

