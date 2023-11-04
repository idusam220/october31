public class ChildExTen extends ParentExSeven
{
	public double l1(double k,double h)
	{
	    System.out.println("Start of l1()non-static method of ChildExTen");
	    System.out.println("The value of k is : "+k);
	    System.out.println("The value of h is : "+h);
	    System.out.println("End of l1()non-static method of ChildExTen");
	    return h;
	}
	@Override
	public int r1(int i, int j)
	{
		System.out.println("Start of r1() non-static method of ChildExTen");
		System.out.println("The value of i is : "+i);
		System.out.println("The value of j is : "+j);
		int sum = i+j;
		System.out.println(sum);
		System.out.println("End of r1()non-static method of ChildExTen");
		return sum;
	}
}