public class ParentExOne
{
	// public ParentExOne()
	// {
		
	//     System.out.println("Start of constructor with int parameter");
	//     System.out.println("End of constructor with int parameter ");
	// }

	public ParentExOne(int i)
	{
		
	    System.out.println("Start of constructor with int parameter");
	    System.out.println("The value of i "+i);
	    System.out.println("End of constructor with int parameter ");
	}
	public ParentExOne(float i)
	{
	    System.out.println("Start of constructor with float parameter");
	    System.out.println("The value of i "+i);
	    System.out.println("End of constructor with float parameter  ");
	}
	public ParentExOne(char c)
	{
		this(12.5);
		
	    System.out.println("Start of constructor with char parameter");
	    System.out.println("The value of c is "+c);
	    System.out.println("End of constructor with char parameter ");
	}
	public ParentExOne(double d)
	{
		this(true);
		
	    System.out.println("Start of constructor with double parameter");
	    System.out.println("The value of d "+d);
	    System.out.println("End of constructor with double parameter ");
	}
	public ParentExOne(boolean b)
	{
	    System.out.println("Start of constructor with boolean parameter");
	    System.out.println("The value of b "+b);
	    System.out.println("End of constructor with boolean parameter ");
	}
	public int add(int a ,int b)
	{
		System.out.println("Start of add()non-static method of ParentExOne");
		int result = a+b;
		System.out.println("The result is "+result);
		System.out.println("End of add()non-static method of ParentExOne");
		return result;
	}
	public double add(double a ,double b)
	{
		System.out.println("Start of add()non-static method of ParentExOne");
		double dResult = a+b;
		System.out.println("The Other result is "+dResult);
		System.out.println("End of add()non-static method of ParentExOne");
		return dResult;
	}
	public boolean m1(boolean b)
	{
		System.out.println("Start of add()non-static method of ParentExOne");
		System.out.println("The value of b is "+b);
		System.out.println("End of add()non-static method of ParentExOne");
		return b;
	}

}