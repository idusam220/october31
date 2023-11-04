public class TestTwo
{
	public void m1(int i)
	{
	   System.out.println("int -parameter");
	}
	public void m1(float i)
	{
       System.out.println("float-parameter");
	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		TestTwo mod = new TestTwo();
		mod.m1(10);
		mod.m1(12.2f);
		mod.m1('b');
		mod.m1(10L);
		//mod.m1(17.5);
		System.out.println("End of Main Method");
	}
}