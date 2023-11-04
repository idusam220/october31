public class StringExOne
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    String s1 = "Harris";
	    String s2 = new String("Tyson");
	    s1.toUpperCase();
	    String s3 = "Eric";
	    String s4 = s2.toLowerCase();
	    System.out.println(s1==s2);
	    System.out.println(s3.equals(s1));
	    System.out.println(s3==s1);
	    System.out.println(s1.equals(s2));
	    System.out.println("End of Main Method");
	}
}