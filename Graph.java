package dhanu;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
	public static void main(String[] args)
	{
		Map<String,List<String>>graph=new HashMap<>();
		graph.put("dhanu",Arrays.asList("redu"));
		graph.put("redu",Arrays.asList("dhanu","harsha"));
		graph.put("harsha",Arrays.asList("redu"));
		for(String person:graph.keySet()) {
			System.out.println(person+"is friends with"+graph.get(person));
		}
		
	}

}
