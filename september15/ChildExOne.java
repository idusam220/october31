public class ChildExOne extends ParentExOne
{
	// public int id;
	// public String name;
	// public double income;
	public int contactNumber;
	public double weight;

	public ChildExOne(int id,String name,double income ,int contactNumber,double weight)
	{
	  super(id,name,income);
	  this.contactNumber = contactNumber;
	  this.weight        = weight;
	  System.out.println("Your contact number is : "+contactNumber + " weight : "+weight);
	}
	@Override
	public char m1(char i)
	{
		System.out.println("Start of m1(char) ChildExOne method");
		System.out.println("End of m1(char) ChildExOne method");
		return i;
	}
	public ChildExOne(int i)
	{
		super(10);
		System.out.println("Start of ChildExOne() constructor");
		System.out.println("The value of i is "+i);
		System.out.println("End of ChildExOne() constructor");
	}
}