// public class ChildExOne extends ParentExOne extends Object
// public class ChildExOne extends ParentExOne,Object
public class ChildExOne extends ParentExOne
{
	public void m1() 
	{
	   System.out.println("Start of m1 method of class ChildExOne");
	   System.out.println("End of m1 method of class ChildExOne");

	}
	public void m2(double value)
	{
		System.out.println("Start of m2 method of class ChildExOne");
		System.out.println("The child one value of m2 method is "+value);
	}
	public String printName(String username)
	{
		System.out.println("Start of print name method of class ChildExOne ");
		System.out.println("End of print name method of class ChildExOne");
		return username;
	}
}