package XYZ;

abstract class Machine {
abstract void ATM();
public void ATM2()
{
	System.out.println("ATM using java with php");
}
}
 class bank extends Machine{
	 void ATM()
	 {
		 System.out.println("ATM machine using java");
	 }
 }
	 public class D
	 {
		 public static void main(String[] args)
		 {
			 bank b=new bank();
			 b.ATM();
			 b.ATM2();
		 }
	 }
 


