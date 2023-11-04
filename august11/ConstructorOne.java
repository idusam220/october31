//Defined or declared class ConstructorOne
public class ConstructorOne
{
	static int i;
	String name;
	double income;
	//Defined or declared constructorOne
	public ConstructorOne( int i, String name, double income)
	{
		System.out.println("Start of Parameterized constructor");
		this.i = i;
		this.name = name;
		this.income = income;
		System.out.println("The value of i is : "+i + " Name is : "+name + " Income is : "+income);
		System.out.println("End of constructorOne");
	}
	public void n3()
	{
		System.out.println("n3 non-static method");

	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		ConstructorOne c1 = new ConstructorOne(10,"nathan",8500.00);
		c1.n3();
		System.out.println("End of Main Method");

	}
}