public class MethodExTwo
{
	public void n1(int i)
	{
     System.out.println("Start of n1-method");
     n2();
     System.out.println("End of n1-method");

	}
	public void n2()
	{
		System.out.println("Start of n2-method");
		n3(12.6);
		System.out.println("End of n2-method");

	}
	public void n3(double b)
	{
		System.out.println("Start of n3-method");
		System.out.println("End of n3-method");

	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		MethodExTwo me = new MethodExTwo();
		me.n1(40);
		me.n3(45.6);
		System.out.println("End of Main Method");
	}
}