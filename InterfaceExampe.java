package XYZ;
interface printable{
	void print();
}
class message implements printable
{
	public void print()
	{
		System.out.println("Hello from interface");
	}
	}
public class InterfaceExampe
{
	public static void main(String[] args)
	{
		message msg=new message();
		msg.print();
	}
}
