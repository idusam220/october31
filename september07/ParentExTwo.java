public class ParentExTwo
{
	public void m1()
	{
	   System.out.println("Start of non-static m1() of ParentExTwo with void");
	   System.out.println("End of non-static m1() of ParentExTwo with void");
	}
	public short m1(short s)
	{
	   System.out.println("Start of non-static m1() of ParentExTwo with short return type");
	   System.out.println("End of non-static m1() of ParentExTwo with short return type");
	   return s;
	}
	private void m2(boolean b)
	{
		System.out.println("Start of non-static m2() of ParentExTwo with boolean parameter");
		System.out.println("The value of b is = "+b);
		System.out.println("End of non-static m2() of ParentExTwo with boolean parameter");

	}
	public static void b1(int i)
	{
        System.out.println("Start of static b1()  with int parameter");
        System.out.println("The value of i is =" +i);
        System.out.println("End of static b1()  with int parameter");

	}
	public static void main(String[]args)
	{
		System.out.println("Start of ParentExTwo Main Method");
		ParentExTwo p2 = new ParentExTwo();
		p2.m2(false);
		System.out.println("End of ParentExTwo Main Method");
	}

}