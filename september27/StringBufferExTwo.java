public class StringBufferExTwo
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		StringBuffer s1 = new StringBuffer("Eric");
		StringBuffer s2 = new StringBuffer("Eric");
		s1=s2;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println("End of Main Method");
	}
}