public class ChildExEight extends ParentExSeven
{
	private int p1()
	{
	    System.out.println("Start of p1() non-static method of ChildExEight");
	    System.out.println("End of p1() non-static method of ChildExEight");
	    return 10;
	}
	private double c1(int i , int j, int k)
	{
		System.out.println("Start of c1()non-static method of ChildExEight");
		System.out.println("The value of i is : "+i);
		System.out.println("the value of j is : "+j);
		System.out.println("The value of k is : "+k);
		double multiply = i*j*k;
		System.out.println(multiply);
		System.out.println("End of c1() non-static method of ChildExEight");
		return multiply;
	}
	@Override
	public int r1(int i, int j)
	{
		System.out.println("Start of r1() non-static method of ChildExEight");
		System.out.println("The value of i is : "+i);
		System.out.println("The value of j is : "+j);
		int sum = i+j;
		System.out.println(sum);
		System.out.println("End of r1()non-static method of ChildExEight");
		return sum;	

	}
	public static void main(String[]args)
	{
		 System.out.println("Start of ChildExEight Main Method");
		 ChildExEight c2 = new ChildExEight();
		 int cvalueX = c2.p1();
		 System.out.println("Child value x is "+cvalueX);
		 double cvalueY = c2.c1(12,32,11);
		 System.out.println("Child value Y is "+cvalueY);
		 System.out.println("End of ChildExEight Main Method");
	}
}