public class ParentExOne extends Object
{
	public void m1()
	{
	   System.out.println("Start of m1 method of class ParentExOne");
	   System.out.println("End of m1 method of class ParentExOne");
	}
	public void m2(double value)
	{
		System.out.println("Start of m2 method of class ParentExOne");
		System.out.println("The value is : "+value);
		System.out.println("End of m2 method of class ParentExOne");

	}
	public String printName(String userName)
	{
		System.out.println("Start of print name method of class ParentExOne");
		System.out.println("End of print name method of class ParentExOne");
		return userName;
	}
}