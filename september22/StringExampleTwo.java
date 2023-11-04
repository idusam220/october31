public class StringExampleTwo
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    StringBuffer sb1 = new StringBuffer("James");
	    sb1.append("Gosling");
	    StringBuilder sb2 = new StringBuilder("Kyle");
	    sb2.append("Symphson");
	    System.out.println(sb1);
	    System.out.println(sb2);
	    System.out.println("End of Main Method");

	}
}