public class ChildExOne extends ParentExOne
{
	public ChildExOne(int i)
	{
	    System.out.println("Start of constructor with int parameter ");
	    //System.out.println("The value of i "+i);
	    System.out.println("End of constructor with int parameter");
	}
	private int m2()
	{
		System.out.println("Start of m2()non-static method of ChildExOne");
		System.out.println("End of m2()non-static method of ChildExOne");
		return 10;
	}
	private void m3()
	{
		System.out.println("Start of m3()non-static method of ChildExOne");
		System.out.println("End of m3()non-static method of ChildExOne");
	}
	@Override
	public int add(int a ,int b)
	{
		System.out.println("Start of add()non-static method of ChildExOne");
		int result = a+b;
		System.out.println("The result is "+result);
		System.out.println("End of add()non-static method of ChildExOne");
		return result;
	}
	@Override
	public double add(double a ,double b)
	{
		System.out.println("Start of add()non-static method of ChildExOne");
		double dResult = a+b;
		System.out.println("The Other result is "+dResult);
		System.out.println("End of add()non-static method of ChildExOne");
		return dResult;
	}
	@Override
	public boolean m1(boolean b)
	{
		System.out.println("Start of add()non-static method of ChildExOne");
		System.out.println("The value of b is "+b);
		System.out.println("End of add()non-static method of ChildExOne");
		return b;
	}
}