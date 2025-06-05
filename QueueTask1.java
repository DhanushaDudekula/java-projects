package hello;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTask1 {
	public static void main(String[] args) {
		Queue<String>kidsQueue=new LinkedList<String>();
		kidsQueue.add("kid 1");
		kidsQueue.add("kid 2");
		kidsQueue.add("kid 3");
		while(!kidsQueue.isEmpty()) {
			String kid=kidsQueue.poll();
			System.out.println("got icecream:"+kid);
			kidsQueue.add("kid 4");
			while(!kidsQueue.isEmpty()) {
				String kids=kidsQueue.poll();
				System.out.println("got icecream:"+  kid);
			
			
		}
	}
	}
}
