package hello;
interface message{
	void say();
}
public class LambdaExample {
	public static void  main(String[] args) {
	message hellomessage=()->System.out.println("this is Lambda");
	hellomessage.say();
}
}
