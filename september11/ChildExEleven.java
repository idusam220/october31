public class ChildExEleven extends ParentExSeven
{
	public void q1()
	{
	    System.out.println("Start of q1() non-static method of ChildExEleven");
	    System.out.println("end of q1() non-static method of ChildExEleven");
	}
	private boolean t1()
	{
		System.out.println("Start of t1() non-static method of ChildExEleven");
		System.out.println("End of t1() non-static method of ChildExEleven");
		return false;
	}
	@Override
	public int r1(int i, int j)
	{
		System.out.println("Start of r1() non-static method of ChildExEleven");
		System.out.println("The value of i is : "+i);
		System.out.println("The value of j is : "+j);
		int sum = i+j;
		System.out.println(sum);
		System.out.println("End of r1()non-static method of ChildExEleven");
		return sum;
	

	}
	public static void main(String[]args)
	{
		 System.out.println("Start of ChildExEleven Main Method");
		 ChildExEleven c3= new ChildExEleven();
		 boolean cvalueZ= c3.t1();
		 System.out.println("The child value Z is "+cvalueZ);
		 System.out.println("End of ChildExEleven Main Method");
	}
}