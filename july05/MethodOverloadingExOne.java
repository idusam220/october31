public class MethodOverloadingExOne
{
	public void m1(int i)
	{
		System.out.println("Start of m1-method");
		System.out.println("End of m1-method");
	}
	void m1(float j)
	{
		System.out.println("Start of m1-method");
		System.out.println("End of m1-method");
	}
	public double subtract(double a,double b)
	{
		System.out.println("Start of subtract method");
		double output = a-b;
		return output;
	}
	public int subtract(int i ,int j)
	{
		System.out.println("Start of subtract method");
		int result =i-j;
		System.out.println("Bye subtract method");
		return result;
	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		MethodOverloadingExOne me = new MethodOverloadingExOne();
		double finalOutput =me.subtract(90.0,70.0);
		int finalResult  = me.subtract(60,30);
		me.m1(67);
		me.m1(56.7f);
		System.out.println("End of Main Method");
	}
}