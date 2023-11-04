public class TestOne
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   String s1 = "james";
	   String s2 = new String("Kyle");
	   StringBuffer s3 = new StringBuffer("Jack");
	   StringBuilder s4 = new StringBuilder("James");
	   System.out.println(s2.length());
	   //System.out.println(s1==s4);
	   System.out.println(s3.charAt(2));
	   System.out.println(s3.reverse());
	   s2.toUpperCase();
	   s1.toLowerCase();
	   System.out.println(s1);
	   System.out.println(s2);
	   System.out.println(s3);
	   System.out.println(s4);
	   System.out.println("End of Main Method");
	}
}