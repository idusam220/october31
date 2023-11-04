public class ChildExTwo extends ParentExOne
{
	public boolean m2(boolean yourvalue)
	{
	   System.out.println("Start of ChildExTwo m2 method");
	   System.out.println("Your value is "+yourvalue);
	   System.out.println("End of ChildExTwo m2 method");
	   return yourvalue;
	}
	public Object m3()
	{
		System.out.println("Start of m3 method of class ChildExTwo");
		System.out.println("End of m3 method of class ChildExTwo");
		return null;
	}
	public String m4(int i)
	{
		System.out.println("Start of m4 method of class ChildExTwo");
		System.out.println("the value of i is "+i);
		System.out.println("End of m4 method of class ChildExTwo");
		return null;
	}
}