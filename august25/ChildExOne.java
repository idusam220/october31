public class ChildExOne extends ParentExOne
{
	public void m1(int i)
	{
	   System.out.println("Start of m1 method of ChildExOne");
	   System.out.println("Your value is "+i);
	   System.out.println("End of m1 method of class ChildExOne");
	}
	public double m2(double childValue)
	{
		System.out.println("Start of m2 method of class ChildExOne ");
		System.out.println("The child value is "+childValue);
		System.out.println("End of m2 method of class ChildExOne");
		return childValue;

	}
	public Object m3()
	{
		System.out.println("Start of m3 method of class ChildExOne");
		System.out.println("End of m3 method of class ChildExOne");
		return null;
	}
}