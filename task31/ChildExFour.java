public class ChildExFour extends ParentExThree
{
	private double e1(boolean c)
	{
	System.out.println("Start of e1 of class ChildExFour");
	System.out.println("The value of c is "+c);
	System.out.println("End of e1 of class ChildExFour");
	return 56;

	}
	public void e4(boolean c)
	{
	    System.out.println("Start of e4 method of ChildExFour");
	    System.out.println("The value of c is "+c);
        System.out.println("End of e4 method of ChildExFour class");
	}
	public void e3()
	{
	    System.out.println("Start of e3 method of ChildExFour");
	    System.out.println("End of e3 method of ChildExFour class");
	}
	public static void main(String[]args)
	{
		System.out.println("Start of ChildExFour Main Method");
        ChildExFour c4 = new ChildExFour();		
		double value =c4.e1(true);
		System.out.println("The printed value is"+value);
		System.out.println("End of ChildExFour Main Method");


	}
}