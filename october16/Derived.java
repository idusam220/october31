public class Derived extends Base
{
	static int x=100;
	static 
	{
		m2();
		System.out.println("Derived First Static Block");
	}
	public static void main(String[]args)
	{
		m2();
		System.out.println("Derived Main");
	}
	public static void m2()
	{
		System.out.println(y);
	}
	static 
	{
		System.out.println("Second Derived Static Block");
	}
	static int y = 200;
}