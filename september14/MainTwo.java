public class MainTwo
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    ChildExTwo c1 = new ChildExTwo("James Gosling",65,9000.00);
	    String greetings = c1.greet();
	    System.out.println("Message for you : "+greetings);
	    System.out.println("End of Main Method");
	}
}