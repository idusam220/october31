public class ParentExOne
{
	public ParentExOne()
	{
		System.out.println("Start of ParentExOne no parameter constructor");
		System.out.println("End of ParentExOne no parameter constructor");

	}
	public void m1()
	{
		System.out.println("Start of non-static m1()of ParentExOne");
		System.out.println("End of non-static m1()of ParentExOne");
	}
	public boolean m2()
	{
		System.out.println("Start of non-static m2() of ParentExOne");
		System.out.println("End of non-static m2()of ParentExOne");
		return true;
	}
	public static void m3()
	{
      System.out.println("ParentExOne m3()static method");
	}
}