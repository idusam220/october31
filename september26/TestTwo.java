public class TestTwo
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   String s1 = new String("Nathan");
	   String s2 = "Jones";
	   StringBuffer s3 = new StringBuffer("David");
	   Object s4 = new StringBuffer("Willey");
	   StringBuilder s5 = new StringBuilder("Chirs");
	   Object s6 = new StringBuilder("Wokes");
	   System.out.println(s1.concat(s2));
	   System.out.println(s2+s1);
	   System.out.println(s3.append(s4));
	   System.out.println(s5.append(s6));
	   System.out.println(s1);
	   System.out.println(s2);
	   System.out.println(s3);
	   System.out.println(s4);
	   System.out.println(s5);
	   System.out.println(s6);
	   System.out.println("End of Main Method");
	}
}