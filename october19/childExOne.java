public class ChildExOne extends ParentExOne
{
	static int age = 20;
	String userName = "Patric";

	public ChildExOne()
	{
		System.out.println("ChildExOne");
	}
	{
		System.out.println("ChildExOne instance block");
	}
	static  
	{
		System.out.println("ChildExOne Static Block");
		System.out.println(age);

	}
	public static void main(String[]args)
	{
		System.out.println("Start of child Main Method");
		ParentExOne p1 = new ParentExOne();
		ChildExOne c1  = new ChildExOne();
		System.out.println("End of child Main Method");
	}
}