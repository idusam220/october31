public class ChildExFive extends ChildExTwo
{

	public void n1(int e)
	{
		System.out.println("Start of n1 method of class ChildExFive");
		System.out.println("The value of i is "+e);
		System.out.println("End of n1 method of class ChildExFive");
	}
	public int n2(int value)
	{
	    System.out.println("Start of n2 method of class ChildExFive");
	    System.out.println("The value of i is "+value);
		System.out.println("End of n2 method of class ChildExFive");
		return 111;
    }
    public double n3(double i)
    {
    	System.out.println("Start of n3 method of class ChildExFive");
    	System.out.println("the value of i is "+i);
		System.out.println("End of n3 method of class ChildExFive");
		return i;

    }
    public void e1()
    {
    	System.out.println("Start of e1 method of class ChildExFive");
        System.out.println("End of e1 method of class ChildExFive");
    }
    
}