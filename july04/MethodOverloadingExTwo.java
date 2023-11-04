public class MethodOverloadingExTwo
{
	public void m1(int i ,double d)
	{
		System.out.println("m1 method with int  and  double parameters");

	}
	public void m1(float a, int i)
	{
		System.out.println("m1 method with float and int parameters ");
	}
	public static void main(String[]args)
	{
		MethodOverloadingExTwo mt = new MethodOverloadingExTwo();
		mt.m1(10,45.0);
		mt.m1(45.7f,20);
		System.out.println("End of Main Method");
	}
}