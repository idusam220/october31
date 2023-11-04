public class StringDemoFour
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    String s1 ="Nathan";
	    String s2 = "Jones";
	    String s3 = s1.concat(s2);
	    String s4 = s1+s2;
	    System.out.println(s1);
	    System.out.println(s2);
	    System.out.println(s3);
	    System.out.println(s4);
	    System.out.println(s3.equals(s4));
	    System.out.println("End of Main Method");	   

	}
}