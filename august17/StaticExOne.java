public class StaticExOne
{
	static String  companyName;
	static double  bonus;
	static int     zipcode;
	       String  location;

	public StaticExOne()
	{
	  System.out.println("Start of Non-parameterized constructor");
	  location = "Florida";
	  System.out.println("End of constructor");

	}
	public StaticExOne(String location)
	{
		System.out.println("Start of parameter constructor");
		this.location = location;
		System.out.println("Your location is : "+location);

	}
	public static void s1()
	{
		System.out.println("Start of static s1 method");
		System.out.println("Company name is : "+companyName);
		System.out.println("Company bonusis : "+bonus);
		System.out.println("zipcode is : "+zipcode);
		System.out.println("Hi");
		m2();
		System.out.println("End of static s1 method");
    }
	public static void m2()
	{
		System.out.println("Start of static m2 method");
		int zipcode  = 456456;
		double bonus = 8500.00;
		System.out.println("Local variable zipcode is : "+zipcode);
		System.out.println("Local variable Bonus is : "+bonus);
		System.out.println("StaticExOne class variable is : "+companyName);
		System.out.println("StaticExOne class variable is : "+StaticExOne.zipcode);
		System.out.println("StaticExOne class variable is : "+StaticExOne.bonus);
		System.out.println("End of static m2 method");
    }
	public static void main(int i)
	{
		System.out.println("Start of static main method");
		System.out.println("Hello");
		System.out.println("End of static main method");
		
	}
	public static void main(String[]args)
	{
		System.out.println("Start of StaticExOne Main method");
		StaticExOne h1 = new StaticExOne();
		StaticExOne h2 = new StaticExOne("Rwanda");
		s1();       // s1()   is   a static method.
		main('A'); //  main() is   a static method.
		m2();     //   m2()   is   a static method.
		System.out.println("End of StaticExOne Main method");
	}

}