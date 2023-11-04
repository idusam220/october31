public class MethodExThree
{
	public void a1(int i)
	{
		System.out.println("Start of a1-method");
		a2(10.5f);
		a3();
		System.out.println("End of a1-method");
	}
	public void a2(float h)
	{
		System.out.println("Start of a2-method");
		System.out.println("End of a2-method");

	}
	public void a3()
	{
	System.out.println("Start of a3-method");
	System.out.println("End of a3-method");
}
public static void main(String[]args)
{
	System.out.println("Start of Main Method");
	MethodExThree me = new MethodExThree();
	me.a1(10);
	me.a3();
	System.out.println("End of main Method");
}
}