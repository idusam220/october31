public class ChildExTwelve extends ChildExEleven
{
	public void s1()
	{
        System.out.println("Start of s1() non-static method of ChildExTwelve");
        System.out.println("End of s1 non-static method of ChildExTwelve");
	}
	@Override
	public void q1()
	{
	    System.out.println("Start of q1() non-static method of ChildExTwelve");
	    System.out.println("end of q1() non-static method of ChildExTwelve");
	}
@Override
	public int r1(int i, int j)
	{
		System.out.println("Start of r1() non-static method of ChildExTwelve");
		System.out.println("The value of i is : "+i);
		System.out.println("The value of j is : "+j);
		int sum = i+j;
		System.out.println(sum);
		System.out.println("End of r1()non-static method of ChildExTwelve");
		return sum;

	}
}