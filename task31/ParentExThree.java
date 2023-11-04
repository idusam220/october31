public class ParentExThree
{
	private double e1(double a)
	{
	    System.out.println("Start of e1 method of ParentExThree");
	    System.out.println("The value of a is "+a);
	    System.out.println("End of e1 method of ParentExThree class");
	    return a;
	}
	private int e2()
	{
	    System.out.println("Start of e2 method of ParentExThree");
	    System.out.println("End of e2 method of ParentExThree class");
	    return 90;
	}
	public void e4(boolean b)
	{
	    System.out.println("Start of e4 method of ParentExThree");
	    System.out.println("The value of b is "+b);
	    System.out.println("End of e4 method of ParentExThree class");
	}
	public void e3()
	{
	    System.out.println("Start of e3 method of ParentExThree");
	    System.out.println("End of e3 method of ParentExThree class");
	}
	public static void main(String[]args)

	{
		System.out.println("Start of ParentExThree Main Method");
		ParentExThree p3 = new ParentExThree();
		p3.e1(24);
		int pvalue = p3.e2();
		System.out.println("Parent value is "+pvalue);
		System.out.println("End of ParentExThree Main Method");
	}
}