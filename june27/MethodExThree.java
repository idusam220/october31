public class MethodExThree
{
	public int m2(int k)
	{
	int value = k;
	return value;

	}
	public void m3()
	{
		System.out.println("Hey , am m3 method");
	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		MethodExThree met = new MethodExThree();
		met.m3();
		int m2value = met.m2(400);
		System.out.println("The value is :"+m2value);
		System.out.println("End of Main Method");

	}
}