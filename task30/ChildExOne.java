public class ChildExOne extends ParentExTwo
{
	public void n1(int i)
	{
		System.out.println("Start of n1 method of class ChildExOne");
		System.out.println("The value of i ="+i);
		System.out.println("End of n1 method of class ChildExOne");
	}
	public int n2(int i)
	{
	    System.out.println("Start of n2 method of class ChildExOne");
	    System.out.println("The value is "+i);
		System.out.println("End of n2 method of class ChildExOne");
		return 33;
    }
    public double n3(double i)
    {
    	System.out.println("Start of n3 method of class ChildExOne");
    	System.out.println("The value of i is "+i);
		System.out.println("End of n3 method of class ChildExOne");
		return i;
    }
    private void b1()
    {
    	System.out.println("Start of b1 method of class ChildExOne");
		System.out.println("End of b1 method of class ChildExOne");

    }
    private void n5(boolean b)
    {
    	System.out.println("Start of n5 method of class ChildExOne");
    	System.out.println("The value of b is :"+b);
    	System.out.println("End of n5 method of class ChildExOne");
    }
    public static void main(String[]args)
    {
    	System.out.println("Start of ChildExOne Main Method");
    	ChildExOne c1 = new ChildExOne();
    	c1.b1();
    	c1.n5(true);
    	System.out.println("End ChildExOne Main Method");
    }
}