public class StringDemoTwo
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    String firstName = new String("James");
	    String lastName  = new String("Gosling");
	    String fullName = firstName.concat(lastName);
	    System.out.println("fullName is: "+fullName);
	    System.out.println(firstName==lastName);
	    System.out.println(firstName.equals(lastName));
	    System.out.println("End of Main Method");	   

	}
}