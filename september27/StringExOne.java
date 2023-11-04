public class StringExOne
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		String s1 = "Robin";
		String s2 = new String("Robin");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));
		System.out.println("End of Main Method");
	}
}