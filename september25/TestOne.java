public class TestOne
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   String        s1 = "James";
	   String        s2 = new String("Kyle");
	   StringBuffer  s3 = new StringBuffer("Nathan");
	   StringBuilder s4 = new StringBuilder("Jack");
	   s1.toUpperCase();
	   s2.toLowerCase();
	   // s3.toUpperCase();==>toUppercase doesn't belong to stringbuffer and stringbuilder.
	   // s4.toLowerCase();
	   System.out.println(s1);
	   System.out.println(s2);
	   System.out.println(s3);
	   System.out.println(s4);
	   System.out.println("End of Main Method");
	}
}