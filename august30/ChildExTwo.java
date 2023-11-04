public class ChildExTwo extends ParentExOne
{
	public void m1(int i)
	{
	   System.out.println("Start of m1 method of class childExTwo");
	   System.out.println("The value of i is "+i);
	   System.out.println("End of m1 method of class childExTwo");
    }
    public int m2()
    {
    	System.out.println("Start of m2 method of class childExTwo");
		System.out.println("End of m2 method of class childExTwo");
		return 101;

    }
    public void m5()
    {
    	System.out.println("Start of m5 method of class childExOne");
		System.out.println("End of m5 method of class childExOne");
	}
}