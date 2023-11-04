public class ChildExTwo extends ParentExOne
{
	// public ChildExTwo()
	// {

	// }
	public ChildExTwo(boolean b)
	{
	    System.out.println("Start of constructor with boolean parameter");
	    System.out.println("The value of b "+b);
	    System.out.println("End of constructor with boolean parameter ");
	}
	public static void p1()
	{
		System.out.println("Start of p1()static method of ChildExTwo");
		System.out.println("End of p1()static method of ChildExTwo");
	} 
	public boolean p2(int i)
	{
		System.out.println("Start of m2()non-static method of ChildExTwo");
		System.out.println("Value i is"+i);
		System.out.println("End of m2()non-static method of ChildExTwo");
		return true;
	}
	@Override
	public int add(int a ,int b)
	{
		System.out.println("Start of add()non-static method of ChildExTwo");
		int result = a+b;
		System.out.println("The result is "+result);
		System.out.println("End of add()non-static method of ChildExTwo");
		return result;
	}
	@Override
	public double add(double a ,double b)
	{
		System.out.println("Start of add()non-static method of ChildExTwo");
		double dResult = a+b;
		System.out.println("The Other result is "+dResult);
		System.out.println("End of add()non-static method of ChildExTwo");
		return dResult;
	}
	@Override
	public boolean m1(boolean b)
	{
		System.out.println("Start of add()non-static method of ChildExTwo");
		System.out.println("The value of b is "+b);
		System.out.println("End of add()non-static method of ChildExTwo");
		return b;
	}


}