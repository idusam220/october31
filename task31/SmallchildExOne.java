public class SmallChildExOne extends ChildExThree
{
	private double e1(boolean b)
	{
	  System.out.println("Start of e1 method of sub class SmallChildExOne");
	  System.out.println("value of b is "+b);
	  System.out.println("End of e1 method of sub class SmallChildExOne");
	  return 567;

	}
	public void e4(boolean b)
	{
	    System.out.println("Start of e4 method of SmallChildExOne");
	    System.out.println("The value b is "+b);
	    System.out.println("End of e4 method of class SmallChildExOne");
	}
	public void e3()
	{
	    System.out.println("Start of e3 method of SmallChildExOne");
	    System.out.println("End of e3 method of class SmallChildExOne");
	}
	public static void main(String[]args)
	{
		System.out.println("Start of SmallChildExOne Main Method");
		SmallChildExOne s1 = new SmallChildExOne();
		double svalue = s1.e1(false);
		System.out.println("Small child value is "+svalue);
		System.out.println("End of SmallChildExOne Main Method");
	}
}