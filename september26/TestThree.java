public class TestThree
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   Object s1 = new String("Sam");
	   Object s2 = new StringBuffer("James");
	   Object s3 = new StringBuilder("Kyle");
	   Object s4 = "Venant";
	   System.out.println(s1.append(s3));
	   System.out.println(s3.append(s1));
	   System.out.println(s1+s4);
	   System.out.println(s1);
	   System.out.println(s2);
	   System.out.println(s3);
	   System.out.println(s4);
	   System.out.println("End of Main Method");
	}
}