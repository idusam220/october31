public class ParentOne
{
    String name;
    int    age;
	public void m1(int i)
	{
	   System.out.println("Start of m1 method of class ParentOne");
	   System.out.println("The value of i is "+i);
	   System.out.println("End of m1 method of class ParentOne");

	}
	public boolean m1(boolean value)
	{
		System.out.println("Start of m1 method of class ParentOne");
		System.out.println("End of m1 method of class ParentOne");
		return value;
	}
	public double m1(double value)
	{
		System.out.println("Start of m1 method of class ParentOne");
		System.out.println("End of m1 method of class ParentOne");
		return value;
	}
	public int m2(int value)
	{
		System.out.println("Start of m2 method of class ParentOne");
		System.out.println("End of m2 method of class ParentOne");
		return value;
	}
}