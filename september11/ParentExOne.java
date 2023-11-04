public class ParentExOne
{
	public void m1(int i)
	{
	   System.out.println("Start of m1()non-static method of ParentExOne ");
	   System.out.println("The value of i is "+i);
	   System.out.println("End of m1() non-static method of ParentExOne");
	}
	public static double m2(double d)
	{
	   System.out.println("Start of m2()static method of ParentExOne ");
	   System.out.println("The value of d is "+d);
	   System.out.println("End of m2() static method of ParentExOne");
	   return d;
	}
	public boolean m3()
	{
	   System.out.println("Start of m3()non-static method of ParentExOne ");
	   System.out.println("End of m3() non-static method of ParentExOne");
	   return true;
	}
	public final void m9()
	{
		System.out.println("Start of m9()final method of ParentExOne");
		System.out.println("End of m9() final method of ParentExOne");
	}
}