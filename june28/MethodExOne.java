public class MethodExOne
{
	public void m1()
	{
		System.out.println("Start of m1-Method");
		m2();
		System.out.println("End of m1-Method");

	}
	public void m2()
	{
	System.out.println("Sart of m2-Method");
	System.out.println("End of m2-Method");
}
public static void main(String[]args)
{
	System.out.println("Start of Main Method");
	MethodExOne me = new MethodExOne();
	me.m1();
	System.out.println("End of Main Method");
}
}
