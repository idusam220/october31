public class ChildExOne extends ParentExOne
{
	public ChildExOne()
	{
       System.out.println("Start of ChildExOne no parameter constructor");
       System.out.println("End of ChildExOne no parameter constructor");
	}
	@Override
	public void m1()
	{
		System.out.println("Start of m1() non-static method of ChildExOne");
		System.out.println("End of m1()non-static method of ChildExOne");
	}
	public void m11()
	{
		System.out.println("Start of m11()non-static method of ChildExOne");
        System.out.println("End of m11()non-static method of ChildExOne");		
	}
}