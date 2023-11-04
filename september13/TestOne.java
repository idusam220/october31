public class TestOne
{
	String name;
	int age;

	public TestOne(String name , int age)
	{
		this(10);
		this.name = name;
		this.age  = age;
		System.out.println("Name is "+name +" Age is "+age);
		System.out.println("End of constructor with String-int parameter");
	}

	public TestOne(double i)
	{
	    this(true);
	    System.out.println("The value of i is "+i);
	    System.out.println("End of constructor with double parameter");
	}
	public TestOne(int i)
	{
		System.out.println("Start of constructor with int parameter");
		System.out.println("The value of i is "+i);
		System.out.println("end of constructor with int parameter");
	}
	public TestOne(boolean b)
	{
		System.out.println("Start of constructor with boolean parameter");
		System.out.println("The value of b is "+b);
		System.out.println("End of constructor with boolean parameter");
	}
}