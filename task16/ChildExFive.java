public class ChildExFive extends ParentExThree
{
	public ChildExFive(String firstName, double height, double income)
	{   
		this.firstName  = firstName;
		this.height     = height;
		this.income     = income;
		System.out.println("Your Firstname is : "+firstName+ ", Height : "+height +", Income : "+income);
	}
	public short m6(short m)
	{
		System.out.println("Start of m1() with short parameter of ChildExFive");
		System.out.println("The value of m is : "+m);
		System.out.println("End of m1() with short parameter of ChildExFive");
		return m;
	}
}