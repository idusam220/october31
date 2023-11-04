public class ChildExFour extends ChildExTwo
{
	public void n1(int i)
	{
		System.out.println("Start of n1 method of class ChildExFour");
		System.out.println("The value of i is = "+i);
		System.out.println("End of n1 method of class ChildExFour");
	}
	public int n2(int i)
	{
	    System.out.println("Start of n2 method of class ChildExFour");
	    System.out.println("The value is "+i);
		System.out.println("End of n2 method of class ChildExFour");
		return 33;
    }
    public double n3(double i)
    {
    	System.out.println("Start of n3 method of class ChildExFour");
    	System.out.println("The value of i is"+i);
		System.out.println("End of n3 method of class ChildExFour");
		return i;

    }
    public void e1()
    {
		System.out.println("Start of e1 method of class ChildExFour");
		System.out.println("End of e1 method of class ChildExFour");
	}
	

}