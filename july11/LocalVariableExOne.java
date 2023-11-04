public class LocalVariableExOne
{
	String name;
	int number;
	public void m1()
	{
		System.out.println("Start of m1-method");
		int i =10;
		double d= 10.5;
		System.out.println("The value of i is :"+i);
		System.out.println("The value of d is:"+d);
		System.out.println("End of m1-method");
	}
	public void m2()
	{
		System.out.println("Start of m2-method");
		int a = 67;
		float m= 34.5f;
		System.out.println("The value of a is :"+a);
		System.out.println("The value of m is :"+m);
		System.out.println("End of m2-method");
	}
		public static void main(String[]args)
		{
			System.out.println("Start of Main Method");
			LocalVariableExOne lo = new LocalVariableExOne();
			lo.m1();
			lo.name ="James Gosling";
			lo.number =109;
			System.out.println("The value of instance variable name is :"+lo.name);
			System.out.println("The value of instance variable number is :"+lo.number);
			lo.m2();
			System.out.println("End of Main Method");
		
	}
}