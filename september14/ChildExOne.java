public class ChildExOne extends ParentExOne
{
	public ChildExOne()
	{
		super(10);
		System.out.println("Start of ChildExOne() constructor with no parameter");
		System.out.println("End of ChildExOne() constructor with no parameter");
    
	}
	public ChildExOne(int i)
	{
		super(true);
		System.out.println("Start of ChildExOne() constructor with int parameter");
		System.out.println("End of ChildExOne() constructor with int parameter");
    
	}
	public ChildExOne(boolean b)
	{
		super(20);
		System.out.println("Start of ChildExOne() constructor with boolean parameter");
		System.out.println("End of ChildExOne() constructor with boolean parameter");
    
	}
	
}