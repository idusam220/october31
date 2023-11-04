public class ScopeTest
{
	int z;
	public static void main(String[]args)
	{
		ScopeTest myScope = new ScopeTest();
		int z=6;
		System.out.println(z);
		myScope.doStuff();
		System.out.println(z);
		System.out.println(myScope.z);

	}
	public void doStuff()
	{
		int z=5;
		dostuff2();
		System.out.println(z);
	}
	public void dostuff2()
	{
		z=4;
	}
}