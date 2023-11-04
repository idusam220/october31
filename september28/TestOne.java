public final class  TestOne
{
	public int id;
	public String name;
	public double age;
	public TestOne(int id,String name,double age)
	{
		System.out.println("Start of TestOne() constructor");
		this.id =id;
		this.name=name;
		this.age=age;
		System.out.println("End of TestOne() constructor");

	}
	public void m1()
	{
		System.out.println("Start of m1()non-static method");
		System.out.println("End of m1() non-static method");
	}
	public double m1(double valueOne)
	{
		System.out.println("Start of m1(double)non-static method");
		System.out.println("The value is ="+valueOne);
		System.out.println("End of m1(double)non-static method");
		return valueOne;

	}
	public static boolean m2(boolean valueOne)
	{
		System.out.println("Start of m2(boolean)static method");
		System.out.println("The value is ="+valueOne);
		System.out.println("End of m2(boolean)static method");
		return valueOne;

	}
	public String toString()
	{
		return "Id = "+id +", Name is :"+name+" , Age is = "+age;
	}

}