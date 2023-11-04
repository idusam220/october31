public class MainOne
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    ChildExOne c1 = new ChildExOne();
	    c1.m1();
	    c1.m11();
	    boolean childValue = c1.m2();
	    System.out.println("Child value is "+childValue);
	    System.out.println("End of Main Method");
	}
}