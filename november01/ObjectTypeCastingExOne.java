public class ObjectTypeCastingExOne
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		Object o = new String("Sam");
		StringBuffer sb = (StringBuffer)o;
		System.out.println("End of Main Method");
	}
}