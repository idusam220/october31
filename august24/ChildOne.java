public class ChildOne extends ParentOne
{
	public void m1(int valueOne)
	{
	   System.out.println("Start of m1 method of class ChildOne");
	   System.out.println("The value One is "+valueOne);
	   System.out.println("End of m1 method of class ChildOne");
	}
	public boolean m1(boolean valueTwo)
	{
		System.out.println("Start of m1 method of class ChildOne");
		System.out.println("End of m1 method of class ChildOne");
        return valueTwo;
	}
	public int m2(int valueThree)
	{
		System.out.println("Start of m2 method of class ChildOne");
		System.out.println("End of m2 method of class ChildOne");
		return valueThree;
	}
}