public class ChildExTwo extends ParentExTwo
{
	public void n1(int d)
	{
		System.out.println("Start of n1 method of class ChildExTwo");
		System.out.println("The value of i is: "+d);
		System.out.println("End of n1 method of class ChildExTwo");
	}
	public int n2(int d)
	{
	    System.out.println("Start of n2 method of class ChildExTwo");
	    System.out.println("The value of i is "+d);
		System.out.println("End of n2 method of class ChildExTwo");
		return 18;
    }
    public double n3(double i)
    {
    	System.out.println("Start of n3 method of class ChildExTwo");
		System.out.println("End of n3 method of class ChildExTwo");
		return i;

    }
    public void e1()
    {
    	System.out.println("Start of e1 method of class ChildExTwo");
		System.out.println("End of e1 method of class ChildExTwo");
    }
}