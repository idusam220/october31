public class StringDemoThree
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    String s1 = new String("Kyle");
	    s1.concat("Symphson");
	    String s2 = s1.concat("Bond");
	    s1= s1.concat("Miller");
	    System.out.println(s1);
	    System.out.println(s2);
	    System.out.println("End of Main Method");	   

	}
}