public class ChildExFive extends ParentExThree
{
	private int e2()
	{
	System.out.println("Start of e2 of class ChildExFive");
	System.out.println("End of e2 of class ChildExFive");
	return 33;

	}
	private double e1(boolean e)
	{
	System.out.println("Start of e1 of class ChildExFive");
	System.out.println("The value of b is "+e);
	System.out.println("End of e1 of class ChildExFive");
	return 123;

	}
	public void e4(boolean b)
	{
	    System.out.println("Start of e4 method of ChildExFive");
	    System.out.println("The value of b is "+b);
	    System.out.println("End of e4 method of class ChildExFive");
	}
	public void e3()
	{
	    System.out.println("Start of e3 method of ChildExFive");
	    System.out.println("End of e3 method of class ChildExFive");
	}
	public static void main(String[]args)
	{
		System.out.println("Start of ChildExFive Main Method");
        ChildExFive c5 = new ChildExFive();		
		int cvalueTwo = c5.e2();
		System.out.println("Child Five value is "+cvalueTwo);
		System.out.println("End of ChildExFive Main Method");


	}
}