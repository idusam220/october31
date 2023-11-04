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
	public int m2()
	{
		System.out.println("Start of m2 method of class ParentExOne");
		System.out.println("End of m2 method of class ParentExOne");
		return 12;
	}
	private void m2(int i)
	{
	   System.out.println("Start of m2 method of class ParentExOne");
	   System.out.println("The value of i is "+i);
	   System.out.println("End of m2 method of class ParentExOne");

	}
	private void m3 ()
	{
		System.out.println("Start of m3 method of class ParentExOne");
		System.out.println("End of m3 method of class ParentExOne");
	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		ParentExOne p1 = new ParentExOne();
		p1.m2(89);
		p1.m3();
		System.out.println("End of Main Method");
	}
}