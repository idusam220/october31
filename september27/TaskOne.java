public class TaskOne
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		StringBuffer s1  = new StringBuffer("John");
		StringBuilder s2 = new StringBuilder("John");
		System.out.println(s1==s2);
		//System.out.println(s1.equals(s2));
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("End of Main Method");

	}
}