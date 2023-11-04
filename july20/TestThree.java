public class TestThree
{
	int z;
	boolean b;
	String s;
	public void m1()
	{
	  int i=10;
	  System.out.println("The value of i is :"+i);
	  System.out.println("The value of z is :"+z);
	  System.out.println("The value of b is :"+b);
	  m2();
	  System.out.println("End of m1-method");

	}
	public void m2()
	{
		System.out.println("Start of non-static m2-method");
		System.out.println("The value of s is :"+s);
		System.out.println("End of non-static m2-method");
	}
	public void m3()
	{
		System.out.println("Start of non static m3-method");
		z=34;
		//b=7;
		System.out.println("The value of z is :"+z);
		System.out.println("The value of b is :"+b);


	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		TestThree t1 = new TestThree();
		t1.m3();
		t1.m2();
		t1.m1();
		int z=32;
		System.out.println("the value of z is :"+z);
		System.out.println("End of Main Method");
	}

}