public class MainOne
{
	public static void main(String[]args)
	{
	System.out.println("Start of Main Method");
	ChildExOne c1 = new ChildExOne();
	ChildExOne c2 = new ChildExOne('a');
	ChildExOne c3 = new ChildExOne(true);
	String childValueOne = c1.sendHi();
	System.out.println("Child value One is = "+childValueOne);
	System.out.println("End of Main Method");
	}
}