public class ParentExSeven
{
	public void m4()
	{
	    System.out.println("Start of m4() non-static method of ParentExSeven");
	    System.out.println("End of m4() non-static method of ParentExSeven");

	}
	private void m5(boolean b)
	{
		System.out.println("Start of m5() non-static method of ParentExSeven");
		System.out.println("The value of b is : "+b);
		System.out.println("End of m5() non-static method of ParentExSeven");

	}
	public int r1(int i,int j)
	{
		System.out.println("Start of r1() non-static method of ParentExSeven");
		System.out.println("The value of i is: "+i);
		System.out.println("The value of j is: "+j);
		int sum = i+j;
		System.out.println(sum);
		System.out.println("End of mr1() non-static method of ParentExSeven");
		return sum;
	}
	public static double g1(double a,double b,double c)
	{
		System.out.println("Start of g1()static method of ParentExSeven");
		System.out.println("The value of a is : "+a);
		System.out.println("The value of b is : "+b);
		System.out.println("The value of c is : "+c);
		double multiply = a*b*c;
		System.out.println(multiply);
		System.out.println("End of g1()static method of ParentExSeven");
		return multiply;
	}
	public final void j1(int i, int a, int b)
	{
		System.out.println("Start of j1()final method of ParentExSeven");
		System.out.println("The value of i is : "+i);
		System.out.println("The value of a is : "+a);
		System.out.println("the value of b is : "+b);
		System.out.println("End of j1() final method of ParentExSeven");
	}
	public static void main(String[]args)
	{
	     System.out.println("Start of ParentExSeven Main Method");
	     ParentExSeven p2 = new ParentExSeven();
	     p2.m5(true);
	     System.out.println("End of ParentExSeven Main Method");
    }
}

