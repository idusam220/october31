public class ChildExOne extends ParentExOne
{
	public void m1(int i)
	{
	   System.out.println("Start of m1 method of class childExOne");
	   System.out.println("The value of i is "+i);
	   System.out.println("End of m1 method of class childExOne");
	}
	public void m4()
	{
	   System.out.println("Start of m4 method of class childExOne");
	   System.out.println("End of m4 method of class childExOne");

	}
	public int m2()
	{
		System.out.println("Start of m2 method of class childExOne");
		System.out.println("End of m2 method of class childExOne");
		return 67;
	}
}