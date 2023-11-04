public class ParentExOne
{
	String name;
	double age;
	double income;

	public void m1(int i)
	{
	   System.out.println("Start of m1 method of class ParentExOne");
	   System.out.println("The value of i is "+i);
	   System.out.println("End of m1 method of class ParentExOne");

	}
	public double m2(double value)
	{
		System.out.println("Start of m2 method of class ParentExOne");
    	System.out.println("The value is "+value);
    	System.out.println("End of m2 method of class ParentExOne");
    	return value;
    }
    public boolean m2(boolean value)
    {
    	System.out.println("Start of m2 method of class ParentExOne");
    	System.out.println("The value is "+value);
    	System.out.println("End of m2 method of class ParentExOne");
    	return value;
    }
    public Object m3()
    {
    	System.out.println("Start of m3 method of class ParentExOne");
    	System.out.println("End of m3 method of class ParentExOne");
    	return null;
    }
    public Object m4(int i)
    {
    	System.out.println("Start of m4 method of class ParentExOne");
    	System.out.println("End of m4 method of class ParentExOne");
    	return null;
    }
}