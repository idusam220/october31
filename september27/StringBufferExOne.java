public class StringBufferExOne
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		StringBuffer sb1 = new StringBuffer("Kyle");
		StringBuffer sb2 = new StringBuffer("Kyle");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb2.equals(sb1));
		System.out.println("End of Main Method");
	}
}