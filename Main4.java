package dhanu;
import java.util.Scanner;
import java.util.TreeSet;
 public class Main4{
	 public static void main(String[] args) {
		 TreeSet<String> products=new TreeSet<>();
		 products.add("keyboard");
	     products.add("mouse");
	     products.add("monitor");
	     products.add("cpu");
	     products.add("webscan");
	     Scanner scanner=new Scanner(System.in);
	     System.out.println("enetr product name to search");
	     String input=scanner.nextLine().toLowerCase();
	     if(products.contains(input)) {
		     System.out.println(" product \""+input+"\" found in the list.");
		    }else{
			     System.out.println("product \""+input+"\" not found.");
		    }
		    scanner.close()	;
		    }
 }
