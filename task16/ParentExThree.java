public class ParentExThree
{

	public String firstName;
	public String middleName;
	public String lastName;
	public double height;
	public double income;

	public ParentExThree(){}

	public ParentExThree(String firstName, String middleName, String lastName, double height, double income)
	{
		System.out.println("Start of ParentExThree() constructor with full names");
		this.firstName  = firstName;
		this.middleName = middleName;
		this.lastName   = lastName;
		this.height     = height;
		this.income     = income;
		System.out.println("Your Firstname is : "+firstName+", Middle Name: "+middleName + ", Last Name: "+lastName+ ", Height : "+height +", Income : "+income);
		System.out.println("End of ParentExThree() constructor with full names");

	}
	public ParentExThree(String firstName, double height, double income)
	{
		this(false);
		System.out.println("Start of ParentExThree() constructor with firstName ");
		this.firstName  = firstName;
		this.height     = height;
		this.income     = income;
		System.out.println("Your Firstname is : "+firstName+ ", Height : "+height +", Income : "+income);
		System.out.println("End of ParentExThree() constructor with firstName");

	}
	public ParentExThree(boolean b)
	{
		System.out.println("Start of ParentExThree() constructor with boolean parameter");
		System.out.println("The value of b is :"+b);
		System.out.println("End of ParentExThree() constructor with boolean parameter");
	}
	public int m1(int i)
	{
		System.out.println("Start of m1() with int parameter of ParentExThree");
		System.out.println("The value of i is : "+i);
		System.out.println("End of m1() with int parameter of ParentExThree");
		return i;
	}
	public double m1(double i)
	{
		System.out.println("Start of m1() with double parameter of ParentExThree");
		System.out.println("The value of i is : "+i);
		System.out.println("End of m1() with double parameter of ParentExThree");
		return i;
	}
	public char m1(char i)
	{
		System.out.println("Start of m1() with char parameter of ParentExThree");
		System.out.println("The value of i is : "+i);
		System.out.println("End of m1() with char parameter of ParentExThree");
		return i;
	}

}