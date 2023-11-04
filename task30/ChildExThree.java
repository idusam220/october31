public class ChildExThree extends ChildExOne
{
	
	public void n1(int b)
	{
		System.out.println("Start of n1 method of class ChildExThree");
		System.out.println("The value of i is "+b);
		System.out.println("End of n1 method of class ChildExThree");
	}
	public int n2(int c)
	{
	    System.out.println("Start of n2 method of class ChildExThree");
	    System.out.println("The value of i is "+c);
		System.out.println("End of n2 method of class ChildExThree");
		return 18;
    }
    public double n3(double i)
    {
    	System.out.println("Start of n3 method of class ChildExThree");
		System.out.println("End of n3 method of class ChildExThree");
		return 100;
    }
}