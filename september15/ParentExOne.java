public class ParentExOne
{
	public int id;
	public String name;
	public double income;

	public ParentExOne(int id,String name, double income)
	{
        this.id     = id;
        this.name   = name;
        this.income = income;
        System.out.println("Your id is : "+id + "name : "+name + "Income : "+income);
	}
	public double m1(double i)
	{
		System.out.println("Start of m1(double) ParentExOne method");
		System.out.println("The value of i is "+i);
		System.out.println("End of m1(double) ParentExOne method");
		return i;

	}
	public char m1(char i)
	{
		System.out.println("Start of m1(char) ParentExOne method");
		System.out.println("End of m1(char) ParentExOne method");
		return i;

	}
	ParentExOne(int i)
	{
		System.out.println("Start of ParentExOne() constructor");
		System.out.println("The value of i is : "+i);
		System.out.println("End of ParentExOne() constructor");
	}
}