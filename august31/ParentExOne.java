public class ParentExOne
{
	String name;
	double income;
	public void m1(double a)
	{
	   System.out.println("Start of m1 method of class ParentExOne");
	   System.out.println("value of a is "+a);
	   System.out.println("End of m1 method of class ParentExOne");
	}
	public void m2(boolean a)
	{
	   System.out.println("Start of m2 method of class ParentExOne");
	   System.out.println("value of a is "+a);
	   System.out.println("End of m2 method of class ParentExOne");
	}
	private int m3()
	{
		System.out.println("Start of m3 method of class ParentExOne");
		System.out.println("End of m3 method ");
		return 18;
	}
	public static void main(String[]args)
	{
		System.out.println("Start of ParentExOne Main method");
		ParentExOne p1 = new ParentExOne();
		int parentExOneValue = p1.m3();
		System.out.println("Parent ex One value is "+parentExOneValue);
		System.out.println("End of ParentExOne Main Method");
	}
}