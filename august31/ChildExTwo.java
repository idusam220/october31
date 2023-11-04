public class ChildExTwo extends ParentExOne
{
	public void m1(double b)
	{
	  System.out.println("Start of m1 method of class ChildExTwo");
	   System.out.println("value of b is "+b);
	   System.out.println("End of m1 method of class ChildExTwo");
	
	}
	private int m3()
	{
		System.out.println("Start of m3 method of class ChildExTwo");
		System.out.println("End of m3 method of class ChildExTwo");
		return 77;
	}
	public static void main(String[]args)
	{
		System.out.println("Start of ChildExTwo Main Method");
		ChildExTwo c2 = new ChildExTwo();
		int childExtwoValue = c2.m3();
		System.out.println("End of ChildExTwo Main Method");
	}
}