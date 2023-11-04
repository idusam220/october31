public class ChildExThree extends ParentExThree
{
	public ChildExThree(){}
	
	public ChildExThree(String firstName, String middleName, String lastName, double height, double income)
	{
		super(firstName,middleName,lastName,height,income);
		this.firstName  = firstName;
		this.middleName = middleName;
		this.lastName   = lastName;
		this.height     = height;
		this.income     = income;
		System.out.println("Your Firstname is : "+firstName+", Middle Name: "+middleName + ", Last Name: "+lastName+ ", Height : "+height +", Income : "+income);
	}
	public ChildExThree(String firstName, double height, double income)
	{
		super(firstName,height,income);
		this.firstName  = firstName;
		this.height     = height;
		this.income     = income;
		System.out.println("Your Firstname is : "+firstName+ ", Height : "+height +", Income : "+income);
	}
	public boolean m2(boolean m)
	{
		System.out.println("Start of m1() with boolean parameter of ChildExThree");
		System.out.println("The value of m is : "+m);
		System.out.println("End of m1() with boolean parameter of ChildExThree");
		return m;
	}
	public byte m2(byte m)
	{
		System.out.println("Start of m1() with byte parameter of ChildExThree");
		System.out.println("The value of m is : "+m);
		System.out.println("End of m1() with byte parameter of ChildExThree");
		return m;
	}
}