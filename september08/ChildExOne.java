public class ChildExOne extends ParentExThree
{
	public void m3(int i)
	{
      System.out.println("Start of m3() of ChildExOne with int parameter");
      System.out.println("The value of i is "+i);
      System.out.println("End of m3() of ChildExOne with int parameter");

	}
	public static void m2(double a)
	{
	    System.out.println("Start of m2() of ChildExOne with double parameter");
	    System.out.println("The value of a is "+a);
	    System.out.println("Start of m2() of ChildExOne with double parameter");

	}
	public boolean m1(boolean a)
	{
		System.out.println("Start of non-static m1() of ChildExOne with boolean parameter");
		System.out.println("The value of a is "+a);
		System.out.println("End of m1() of ChildExOne with boolean parameter");
		return a;
	}
}