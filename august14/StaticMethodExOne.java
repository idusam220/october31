public class StaticMethodExOne
{
	static int   i = 89;
	double       a = 45.5; // non-static variable
	boolean      b = true; // non-static variable
	static float c;		
	char         d;        // non-static variable

	public static void m1()
	{
	  System.out.println("Start of static m1 method");
	  boolean b = false; // local variable
	  StaticMethodExOne so = new StaticMethodExOne();
	  System.out.println("The value of i is :" +i);
	  // Here, a is a non-static variable which belongs to an object
	  // if we want to access a non-static variable from a static-
	  // method, then we need to create an object and then we can
      // can access the variable with the reference variable.
	  System.out.println("The value of a is : "+so.a);
	  System.out.println("The value of b is : "+b);
	  System.out.println("The value of c is : "+c);
	  System.out.println("The value of d is : "+so.d);
	  m2();
	  so.m3(10);
	  System.out.println("End of static m1 method");


	}
	// select the portion which you need to comment
	// and then press command key + /
	// select the portion which we need to uncomment
	// and then press command key + /
	public void m3(int i)
	{
		System.out.println("Start of non static m3 method");
		System.out.println("The value of i is : "+i);
		System.out.println("The value of i is : "+StaticMethodExOne.i);
		System.out.println("End of non static m3 method");

	}
	public static void m2()
	{
		System.out.println("Start of static m2 method");
		StaticMethodExOne se = new StaticMethodExOne();
		System.out.println("The value of i is : "+i);
		System.out.println("The value of a is : "+se.a);
		System.out.println("The value of c is : "+c);
		System.out.println("The value of d is : "+se.d);
		System.out.println("End of static m2 method");
	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		StaticMethodExOne sm = new StaticMethodExOne();
		m1();
		StaticMethodExOne.m2();
		sm.m3('d');
		System.out.println("End of Main Method");
	}

}