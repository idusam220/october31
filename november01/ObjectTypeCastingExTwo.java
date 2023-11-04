public class ObjectTypeCastingExTwo
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		Object o = new String("SamVenant");
		String s = (String)o;
		System.out.println("End of Main Method");
	}
}