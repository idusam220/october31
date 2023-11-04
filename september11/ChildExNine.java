public class ChildExNine extends ChildExEight
{
	public void z1()
	{
        System.out.println("Start of z1() non-static method of ChildExNine");
        System.out.println("end of z1() non-staticmethod of ChildExNine");
	}
	@Override
	public int r1(int i, int j)
	{
		System.out.println("Start of r1() non-static method of ChildExNine");
		System.out.println("The value of i is : "+i);
		System.out.println("The value of j is : "+j);
		int sum = i+j;
		System.out.println(sum);
		System.out.println("End of r1()non-static method of ChildExNine");
		return sum;
	

	}

}